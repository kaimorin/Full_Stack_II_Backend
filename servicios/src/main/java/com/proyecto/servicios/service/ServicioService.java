package com.proyecto.servicios.service;

import com.proyecto.servicios.dto.ServicioCreateDTO;
import com.proyecto.servicios.dto.ServicioDTO;
import com.proyecto.servicios.model.Servicio;
import com.proyecto.servicios.repository.ServicioRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServicioService {

    private final ServicioRepository servicioRepository;

    public ServicioService(ServicioRepository servicioRepository) {
        this.servicioRepository = servicioRepository;
    }

    @Transactional(readOnly = true)
    public List<ServicioDTO> listarTodos() {
        return servicioRepository.findAll().stream()
                .map(this::mapToDTO)
                .toList();
    }

    @Transactional(readOnly = true)
    public List<ServicioDTO> listarActivos() {
        return servicioRepository.findByActivoTrue().stream()
                .map(this::mapToDTO)
                .toList();
    }

    @Transactional(readOnly = true)
    public ServicioDTO buscarPorId(Long id) {
        Servicio servicio = servicioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Servicio no encontrado con id: " + id));
        return mapToDTO(servicio);
    }

    @Transactional
    public ServicioDTO crear(ServicioCreateDTO dto) {
        Servicio servicio = Servicio.builder()
                .nombre(dto.getNombre())
                .descripcion(dto.getDescripcion())
                .precio(dto.getPrecio())
                .duracionMinutos(dto.getDuracionMinutos())
                .activo(dto.getActivo() != null ? dto.getActivo() : true)
                .categoria(dto.getCategoria())
                .build();

        return mapToDTO(servicioRepository.save(servicio));
    }

    @Transactional
    public ServicioDTO actualizar(Long id, ServicioCreateDTO dto) {
        Servicio servicio = servicioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Servicio no encontrado con id: " + id));

        servicio.setNombre(dto.getNombre());
        servicio.setDescripcion(dto.getDescripcion());
        servicio.setPrecio(dto.getPrecio());
        servicio.setDuracionMinutos(dto.getDuracionMinutos());
        if (dto.getActivo() != null) {
            servicio.setActivo(dto.getActivo());
        }
        servicio.setCategoria(dto.getCategoria());

        return mapToDTO(servicioRepository.save(servicio));
    }

    @Transactional
    public void cambiarEstado(Long id, boolean activo) {
        Servicio servicio = servicioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Servicio no encontrado con id: " + id));
        servicio.setActivo(activo);
        servicioRepository.save(servicio);
    }

    private ServicioDTO mapToDTO(Servicio s) {
        return ServicioDTO.builder()
                .id(s.getId())
                .nombre(s.getNombre())
                .descripcion(s.getDescripcion())
                .precio(s.getPrecio())
                .duracionMinutos(s.getDuracionMinutos())
                .activo(s.getActivo())
                .categoria(s.getCategoria())
                .build();
    }
}