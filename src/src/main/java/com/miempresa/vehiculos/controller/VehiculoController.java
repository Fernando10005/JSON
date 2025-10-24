package com.miempresa.vehiculos.controller;

import com.miempresa.vehiculos.model.Vehiculo;
import com.miempresa.vehiculos.repository.VehiculoRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehiculos")
@CrossOrigin(origins = "*")
public class VehiculoController {

    private final VehiculoRepository repository;

    public VehiculoController(VehiculoRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/agregar")
    public Vehiculo agregar(@RequestBody Vehiculo vehiculo) {
        return repository.save(vehiculo);
    }

    @PutMapping("/modificar")
    public Vehiculo modificar(@RequestBody Vehiculo vehiculo) {
        return repository.save(vehiculo);
    }
}
