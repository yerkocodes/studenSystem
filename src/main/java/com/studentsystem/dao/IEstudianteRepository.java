package com.studentsystem.dao;

import org.springframework.data.repository.CrudRepository;

import com.studentsystem.model.Estudiante;

public interface IEstudianteRepository extends CrudRepository<Estudiante, Integer> {

}
