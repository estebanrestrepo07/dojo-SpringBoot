package co.edu.udea.dojospring.controller;

import co.edu.udea.dojospring.model.Estudiante;
import co.edu.udea.dojospring.service.EstudianteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "estudiante")
public class EstudianteController {

    private final EstudianteService estudianteService;

    @PostMapping()
    public String crearEstudiante(@RequestBody Estudiante estudiante){
        estudianteService.crearEstudiante(estudiante);
        return "Estudiante Creado";
    }

    @GetMapping("/{id}")
    public Estudiante getEstudiante(@PathVariable("id") Integer id){
        return estudianteService.getEstudiante(id);
    }

}