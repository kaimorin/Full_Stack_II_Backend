package com.proyecto.servicios.dto;

import lombok.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ServicioDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private Integer duracionMinutos;
    private Boolean activo;
    private String categoria;
}
