package com.studentsystem.dao;

import org.springframework.data.repository.CrudRepository;

import com.studentsystem.model.Curso;

public interface ICursoRepository extends CrudRepository<Curso, String> {

}
