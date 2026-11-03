package com.proyecto.servicios.repository;

import com.proyecto.servicios.model.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Long> {
    List<Servicio> findByActivoTrue();
    List<Servicio> findByCategoriaIgnoreCase(String categoria);
}