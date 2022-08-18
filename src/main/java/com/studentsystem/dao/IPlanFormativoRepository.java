package com.studentsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentsystem.model.PlanFormativo;

@Repository
public interface IPlanFormativoRepository extends JpaRepository<PlanFormativo, String> {

}
