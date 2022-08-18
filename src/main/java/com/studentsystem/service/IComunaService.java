package com.studentsystem.service;

import java.util.List;

import com.studentsystem.model.Comuna;

public interface IComunaService {

	//CREATE
	public Comuna add(Comuna comuna);

	//READ
	public List<Comuna> findAllComunas();
	public Comuna findById(Integer id);

	//UPDATE
	public Comuna update(Comuna comuna);

	//DELETE
	public Boolean deleteComuna(Integer id);

}
