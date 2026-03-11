package com.example.apiCompraventaDeVehiculo.Servicios;

import com.example.apiCompraventaDeVehiculo.Modelos.Vehiculo;
import com.example.apiCompraventaDeVehiculo.Repositorios.VehiculoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoServicio {
    @Autowired
    private VehiculoRepositorio vehiculoRepositorio;

    public VehiculoServicio(VehiculoRepositorio vehiculoRepositorio) {
        this.vehiculoRepositorio = vehiculoRepositorio;
    }
    //Definir las reglas de negocio para el CRUD de vehiculos
    //Agregar un vehiculo


    public Vehiculo saveVehiculo(Vehiculo vehiculo) {
        return vehiculoRepositorio.save(vehiculo);
    }

    public List<Vehiculo> getAllVehiculo(){
        return vehiculoRepositorio.findAll();
    }

    //Falta buscar vehiculo por id, borrar un vehiculo y actualizar vehiculos

}
