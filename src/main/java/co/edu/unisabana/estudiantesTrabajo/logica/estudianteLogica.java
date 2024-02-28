package co.edu.unisabana.estudiantesTrabajo.logica;

import co.edu.unisabana.estudiantesTrabajo.entity.Estudiante;
import co.edu.unisabana.estudiantesTrabajo.entity.estudianteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class estudianteLogica {

    private estudianteRepository repository;

    public Estudiante addEstudiante(Estudiante estudiante){
        return repository.save(estudiante);
    }

    public List<Estudiante> getEstudiante(){
        return repository.findAll();
    }

}
