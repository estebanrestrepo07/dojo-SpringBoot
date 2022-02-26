package co.edu.udea.dojospring.service.implement;

import co.edu.udea.dojospring.model.Estudiante;
import co.edu.udea.dojospring.repository.EstudianteRepository;
import co.edu.udea.dojospring.service.EstudianteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EstudianteServiceImp implements EstudianteService {

    private final EstudianteRepository estudianteRepository;

    @Override
    public void crearEstudiante(Estudiante estudiante){
        estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante getEstudiante(Integer id){
        return estudianteRepository.findById(id).orElse(null);
    }
}
