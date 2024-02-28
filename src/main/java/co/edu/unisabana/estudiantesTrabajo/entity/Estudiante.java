package co.edu.unisabana.estudiantesTrabajo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
}
