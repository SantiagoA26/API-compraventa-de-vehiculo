package com.example.apiCompraventaDeVehiculo.Modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Vehiculo {
    @Id // Clave primaria
    @Column(nullable = false, length = 9)
    private String placa;
    @Column(nullable = false)
    private String marca;
    @Column(nullable = false)
    private String modelo;
    @Column(nullable = false)
    private int anio;
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal precio;

    @OneToOne(mappedBy = "vehiculo")
    private FacturaDeCompra facturaDeCompra;

}
