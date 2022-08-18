package com.studentsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentsystem.model.Comuna;

@Repository
public interface IComunaRepository extends JpaRepository<Comuna, Integer> {
	
}
