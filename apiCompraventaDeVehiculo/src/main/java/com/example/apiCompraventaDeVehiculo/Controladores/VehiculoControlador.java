package com.example.apiCompraventaDeVehiculo.Controladores;

import com.example.apiCompraventaDeVehiculo.Modelos.Vehiculo;
import com.example.apiCompraventaDeVehiculo.Servicios.VehiculoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoControlador {
    //Inyectar servicio de VehiculoServicio
    @Autowired
    private VehiculoServicio vehiculoServicio;

    //Endpoints

    //Crear vehiculos
    @PostMapping
    public Vehiculo crearVehiculo(@RequestBody Vehiculo vehiculo) {
        return vehiculoServicio.saveVehiculo(vehiculo);
    }

    //Recuperar todos los vehiculos
    @GetMapping
    public List<Vehiculo> getVehiculos()
    {
        return vehiculoServicio.getAllVehiculo();
    }




}
