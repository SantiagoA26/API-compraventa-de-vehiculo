package com.example.apiCompraventaDeVehiculo.Controladores;


import com.example.apiCompraventaDeVehiculo.Modelos.Vendedor;
import com.example.apiCompraventaDeVehiculo.Servicios.VendedorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendedor")
public class VendedorControlador {
    //Inyectar servicio de vendedor servicio
    @Autowired
    private VendedorServicio vendedorServicio;

    //Endpoints

    //Crear vendedores
    @PostMapping
    public Vendedor crearVendedor(@RequestBody Vendedor vendedor){
        return vendedorServicio.saveVendedor(vendedor);
    }

    // Recuperar todos los vendedores
    @GetMapping
    public List<Vendedor> getVendedor() {
        return vendedorServicio. getAllVendedor();
    }



}
