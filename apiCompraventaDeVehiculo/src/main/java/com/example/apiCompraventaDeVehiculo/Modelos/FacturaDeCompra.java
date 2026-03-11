package com.example.apiCompraventaDeVehiculo.Modelos;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.lang.model.element.Name;
import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class FacturaDeCompra {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCompra;
    @Column(nullable = false)
private LocalDate fecha;

    @Column(nullable = false)
private String nombreComprador;
    @Column(nullable = false)
private String cedulaComprador;
    @Column(nullable = false)
private String celularComprador;

    @Column(precision = 10, scale = 2, nullable = false)
private BigDecimal precio;

    @OneToOne(targetEntity = Vehiculo.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "placa", referencedColumnName = "placa")
    private Vehiculo vehiculo;

    @ManyToOne(targetEntity = Vendedor.class)
    @JoinColumn(name = "idVendedor", referencedColumnName = "idVendedor")
    private Vendedor vendedor;

}
