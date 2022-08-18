package com.studentsystem.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.studentsystem.ExamenCertificacionJavaStudentSystemApplication;
import com.studentsystem.dao.IRegionRepository;
import com.studentsystem.model.Region;
import com.studentsystem.service.IRegionService;

@Service
public class RegionServiceImpl implements IRegionService {
	
	@Autowired
	private IRegionRepository dao;
	
	private Logger log = LoggerFactory.getLogger(ExamenCertificacionJavaStudentSystemApplication.class);

	@Override
	@Transactional
	public Region add(Region region) {
		Region regionToAdd = new Region();
		try {
			regionToAdd = dao.save(region);
		} catch (Exception e) {
			log.error("Ocurred an error in 'add'. Location: 'com.studentsystem.serviceImpl'. Error: " + e.getMessage());
		}
		return regionToAdd;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Region> findAllRegiones() {
		List<Region> regionesList = new ArrayList<>();
		try {
			regionesList = (List<Region>) dao.findAll();
		} catch (Exception e) {
			log.error("Ocurred an error in 'findAllRegiones'. Location: 'com.studentsystem.serviceImpl'. Error: " + e.getMessage());
		}
		return regionesList;
	}

	@Override
	@Transactional(readOnly = true)
	public Region findById(Integer id) {
		Region region = new Region();
		try {
			region = dao.findById(id).get();
		} catch (Exception e) {
			log.error("Ocurred an error in 'findById'. Location: 'com.studentsystem.serviceImpl'. Error: " + e.getMessage());
		}
		
		return region;
	}

	@Override
	@Transactional
	public Region update(Region region) {
		Region regionToUpdate = new Region();
		try {
			regionToUpdate = dao.save(region);
		} catch (Exception e) {
			log.error("Ocurred an error in 'update'. Location: 'com.studentsystem.serviceImpl'. Error: " + e.getMessage());
		}
		return regionToUpdate;
	}

	@Override
	@Transactional
	public Boolean deleteRegion(Integer id) {
		try {
			if (dao.findById(id) != null) {
				dao.deleteById(id);
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			log.error("Ocurred an error in 'deleteRegion'. Location: 'com.studentsystem.serviceImpl'. Error: " + e.getMessage());
		}
		return false;
	}

}