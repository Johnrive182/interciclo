package edu.examen.interciclo.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.examen.interciclo.modelo.Universidad;

public interface UniversidadRepository extends JpaRepository<Universidad, Integer>{
	
}

