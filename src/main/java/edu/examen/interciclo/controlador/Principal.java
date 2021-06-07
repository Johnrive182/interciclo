package edu.examen.interciclo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.examen.interciclo.infraestructura.repositorio.UniversidadRepository;

@Controller
public class Principal {

	@Autowired
	UniversidadRepository personaRepository;

}
