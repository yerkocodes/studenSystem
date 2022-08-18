package com.studentsystem.dao;

import org.springframework.data.repository.CrudRepository;

import com.studentsystem.model.Region;

public interface IRegionRepository extends CrudRepository<Region, Integer> {

}
