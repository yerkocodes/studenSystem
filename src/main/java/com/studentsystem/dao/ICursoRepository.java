package com.studentsystem.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.studentsystem.model.Curso;

public interface ICursoRepository extends CrudRepository<Curso, String> {
	
	@Query("SELECT * FROM Curso WHERE codigo_curso = :codidoDelCurso")
	public Curso findByIdCurso(String codigoDelCurso);

}
