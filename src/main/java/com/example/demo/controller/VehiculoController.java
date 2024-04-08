package com.example.demo.controller;

import com.example.demo.entity.Vehiculo;
import com.example.demo.services.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    @GetMapping
    public List<Vehiculo> getAllVehiculos() {
        return vehiculoService.getVehiculos();
    }

    @GetMapping("/{vehiculoId}")
    public Optional<Vehiculo> getVehiculoById(@PathVariable("vehiculoId") Long vehiculoId) {
        return vehiculoService.getVehiculo(vehiculoId);
    }

    @PostMapping
    public void saveOrUpdateVehiculo(@RequestBody Vehiculo vehiculo) {
        vehiculoService.saveOrUpdateVehiculo(vehiculo);
    }

    @DeleteMapping("/{vehiculoId}")
    public void deleteVehiculo(@PathVariable("vehiculoId") Long vehiculoId) {
        vehiculoService.deleteVehiculo(vehiculoId);
    }
}
