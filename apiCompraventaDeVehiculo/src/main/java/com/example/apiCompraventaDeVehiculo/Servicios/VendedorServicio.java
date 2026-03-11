package com.example.apiCompraventaDeVehiculo.Servicios;


import com.example.apiCompraventaDeVehiculo.Modelos.Vendedor;
import com.example.apiCompraventaDeVehiculo.Repositorios.VendedorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendedorServicio {
    @Autowired
    private VendedorRepositorio vendedorRepositorio;

            public VendedorServicio(VendedorRepositorio vendedorRepositorio){
        this.vendedorRepositorio = vendedorRepositorio;
            }

            //Definir las reglas de negocio para el CRUD de vendedor
    //Agregar un vendedor
    public Vendedor saveVendedor(Vendedor vendedor){
                return vendedorRepositorio.save(vendedor);
    }

    //Listar los vendedores
    public List<Vendedor> getAllVendedor(){
                return vendedorRepositorio.findAll();
    }

}
