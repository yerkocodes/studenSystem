package com.studentsystem.service;

import java.util.List;

import com.studentsystem.model.Region;

public interface IRegionService {

	//CREATE
	public Region add(Region region);

	//READ
	public List<Region> findAllRegiones();
	public Region findById(Integer id);

	//UPDATE
	public Region update(Region region);

	//DELETE
	public Boolean deleteRegion(Integer id);

}
