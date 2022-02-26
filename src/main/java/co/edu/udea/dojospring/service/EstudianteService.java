package co.edu.udea.dojospring.service;

import co.edu.udea.dojospring.model.Estudiante;

public interface EstudianteService {
    void crearEstudiante(Estudiante estudiante);

    Estudiante getEstudiante(Integer id);
}
