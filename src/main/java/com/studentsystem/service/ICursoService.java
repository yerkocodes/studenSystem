package com.studentsystem.service;

import java.util.List;

import com.studentsystem.model.Curso;

public interface ICursoService {

	//CREATE
	public Curso add(Curso curso);

	//READ
	public List<Curso> findAllCursos();
	public Curso findById(String id);

	//UPDATE
	public Curso update(Curso curso);

	//DELETE
	public Boolean deleteCurso(String id);

}
