package com.example.demo.services;

import com.example.demo.entity.Vehiculo;
import com.example.demo.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    public List<Vehiculo> getVehiculos() {
        return vehiculoRepository.findAll();
    }

    public Optional<Vehiculo> getVehiculo(Long id) {
        return vehiculoRepository.findById(id);
    }

    public void saveOrUpdateVehiculo(Vehiculo vehiculo) {
        vehiculoRepository.save(vehiculo);
    }

    public void deleteVehiculo(Long id) {
        vehiculoRepository.deleteById(id);
    }
}
