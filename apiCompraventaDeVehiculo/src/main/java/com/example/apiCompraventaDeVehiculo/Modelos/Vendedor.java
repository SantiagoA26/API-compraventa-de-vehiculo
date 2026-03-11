package com.example.apiCompraventaDeVehiculo.Modelos;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Vendedor {
    @Id
    @Column(nullable = false, length =6)
    private String idVendedor;
    @Column(nullable = false)
    private String nombreVend;
    @Column(nullable = false)
    private String apellidoVend;
    @Column(nullable = false)
    private String CedulaVend;
    @Column(nullable = false)
    private LocalDate FechaNacimientoVend;

    @OneToMany(mappedBy = "vendedor")
    private List<FacturaDeCompra> facturaDeCompra;
}
