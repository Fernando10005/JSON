package com.miempresa.vehiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.miempresa.vehiculos.model.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, String> {}
