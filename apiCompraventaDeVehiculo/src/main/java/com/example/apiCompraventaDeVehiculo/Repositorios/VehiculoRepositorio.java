package com.example.apiCompraventaDeVehiculo.Repositorios;

import com.example.apiCompraventaDeVehiculo.Modelos.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepositorio extends JpaRepository<Vehiculo, String> {
}
