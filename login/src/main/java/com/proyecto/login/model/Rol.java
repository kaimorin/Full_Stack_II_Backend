package com.proyecto.login.model;


import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;


import lombok.*;

@Entity
@Table (name="roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rol {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY )
    private Long idrol;

    @Column(name="nombre_rol")
    private String nombre;

    @OneToMany(mappedBy = "rol", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<User> users = new ArrayList<>();
}

