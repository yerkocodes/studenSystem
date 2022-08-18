package com.studentsystem.service;

import java.util.List;

import com.studentsystem.model.Estudiante;

public interface IEstudianteService {
	
	//CREATE
	public Estudiante add(Estudiante estudiante);

	//READ
	public List<Estudiante> findAllEstudiantes();
	public Estudiante findById(Integer id);
	public Estudiante findByRut(String rut);

	//UPDATE
	public Estudiante update(Estudiante estudiante);

	//DELETE
	public Boolean deleteEstudiante(Integer id);

}
