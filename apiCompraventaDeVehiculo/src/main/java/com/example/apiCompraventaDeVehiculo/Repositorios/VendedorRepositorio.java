package com.example.apiCompraventaDeVehiculo.Repositorios;

import com.example.apiCompraventaDeVehiculo.Modelos.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepositorio extends JpaRepository<Vendedor, String> {
}
