package com.studentsystem.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.studentsystem.model.Curso;

public interface ICursoRepository extends CrudRepository<Curso, String> {
	
	@Query(value = "SELECT * FROM Curso WHERE codigo_curso = ?1", nativeQuery = true)
	public Curso findByIdCurso(String codigoDelCurso);
	
	@Query(value = "DELETE FROM Curso WHERE codigo_curso = ?1", nativeQuery = true)
	public Curso deleteCursoWithId(String codigoDelCurso);

}
