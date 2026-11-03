package com.proyecto.servicios.dto;

import jakarta.validation.constraints.*;
import lombok.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServicioCreateDTO {

    @NotBlank(message = "El nombre del servicio es obligatorio")
    @Size(max = 100, message = "El nombre no puede superar los 100 caracteres")
    private String nombre;

    private String descripcion;

    @NotNull(message = "El precio es obligatorio")
    @DecimalMin(value = "0.0", inclusive = false, message = "El precio debe ser mayor a 0")
    private BigDecimal precio;

    @NotNull(message = "La duración en minutos es obligatoria")
    @Min(value = 5, message = "La duración mínima es de 5 minutos")
    private Integer duracionMinutos;

    private Boolean activo = true;

    private String categoria;
}