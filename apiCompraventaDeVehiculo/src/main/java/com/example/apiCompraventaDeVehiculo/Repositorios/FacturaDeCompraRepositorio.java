package com.example.apiCompraventaDeVehiculo.Repositorios;

import com.example.apiCompraventaDeVehiculo.Modelos.FacturaDeCompra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaDeCompraRepositorio extends JpaRepository<FacturaDeCompra, Long> {
}
