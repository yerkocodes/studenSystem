package com.studentsystem.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.studentsystem.model.Estudiante;

public interface IEstudianteRepository extends CrudRepository<Estudiante, Integer> {
	
	@Query("SELECT * FROM Estudiante WHERE rut = :rutEstudiante")
	public Estudiante findByRutEstudiante(String rutEstudiante);

}
