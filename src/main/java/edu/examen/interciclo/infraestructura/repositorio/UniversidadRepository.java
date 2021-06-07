package edu.examen.interciclo.infraestructura.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.examen.interciclo.modelo.Universidad;


public interface UniversidadRepository extends JpaRepository<Universidad, Integer>{
	
	Universidad findByNombreUni(String nombre);

	List<Universidad> findByNombre(String nombre);
	
	Universidad findById(int id);

}

