package co.edu.unisabana.estudiantesTrabajo.controller;

import co.edu.unisabana.estudiantesTrabajo.entity.Estudiante;
import co.edu.unisabana.estudiantesTrabajo.logica.estudianteLogica;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@AllArgsConstructor
public class estudianteController {

    private estudianteLogica estudianteLogica;

    @PostMapping("/agregar")
    public Estudiante addEstudiante(@RequestBody Estudiante estudiante){
        return estudianteLogica.addEstudiante(estudiante);
    }

    @GetMapping("/mostrar")
    public List<Estudiante> getEstudiante(){
        return estudianteLogica.getEstudiante();
    }

    @GetMapping("/vida")
    private String health() {
        return "Estoy vivo y feliz :)";
    }
}
