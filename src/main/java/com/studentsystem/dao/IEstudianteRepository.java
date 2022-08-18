package com.studentsystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.studentsystem.model.Estudiante;

public interface IEstudianteRepository extends CrudRepository<Estudiante, Integer> {
	
	@Query(value = "SELECT * FROM Estudiante WHERE rut = ?1", nativeQuery = true)
	public Estudiante findByRutEstudiante(String rutEstudiante);
	
	@Query(value = "SELECT * FROM Estudiante e INNER JOIN Curso c ON c.codigo_curso = e.codigo_curso WHERE c.codigo_region = ?1", nativeQuery = true)
	public List<Estudiante> findEstudiantesPeerRegion(Integer codigoRegion);

}
