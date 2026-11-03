package com.proyecto.servicios.controller;

import com.proyecto.servicios.dto.ApiResponse;
import com.proyecto.servicios.dto.ServicioCreateDTO;
import com.proyecto.servicios.dto.ServicioDTO;
import com.proyecto.servicios.service.ServicioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servicios")
@CrossOrigin(origins = "*") // Habilita la conexión con tu frontend
public class ServicioController {

    private final ServicioService servicioService;

    public ServicioController(ServicioService servicioService) {
        this.servicioService = servicioService;
    }

    @GetMapping("/list")
    public ResponseEntity<ApiResponse<List<ServicioDTO>>> listarServicios(
            @RequestParam(name = "soloActivos", defaultValue = "false") boolean soloActivos) {
        List<ServicioDTO> lista = soloActivos ? servicioService.listarActivos() : servicioService.listarTodos();
        return ResponseEntity.ok(new ApiResponse<>(true, "Servicios obtenidos exitosamente", lista));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<ServicioDTO>> obtenerPorId(@PathVariable Long id) {
        ServicioDTO servicio = servicioService.buscarPorId(id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Servicio encontrado", servicio));
    }

    @PostMapping
    public ResponseEntity<ApiResponse<ServicioDTO>> crearServicio(@Valid @RequestBody ServicioCreateDTO dto) {
        ServicioDTO creado = servicioService.crear(dto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>(true, "Servicio creado exitosamente", creado));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<ServicioDTO>> actualizarServicio(
            @PathVariable Long id,
            @Valid @RequestBody ServicioCreateDTO dto) {
        ServicioDTO actualizado = servicioService.actualizar(id, dto);
        return ResponseEntity.ok(new ApiResponse<>(true, "Servicio actualizado exitosamente", actualizado));
    }

    @PatchMapping("/{id}/estado")
    public ResponseEntity<ApiResponse<Void>> cambiarEstado(
            @PathVariable Long id,
            @RequestParam boolean activo) {
        servicioService.cambiarEstado(id, activo);
        return ResponseEntity.ok(new ApiResponse<>(true, "Estado del servicio actualizado", null));
    }
}