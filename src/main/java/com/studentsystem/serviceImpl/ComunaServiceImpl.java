package com.studentsystem.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.studentsystem.ExamenCertificacionJavaStudentSystemApplication;
import com.studentsystem.dao.IComunaRepository;
import com.studentsystem.model.Comuna;
import com.studentsystem.service.IComunaService;

@Service
public class ComunaServiceImpl implements IComunaService {
	
	@Autowired
	private IComunaRepository dao;
	
	private Logger log = LoggerFactory.getLogger(ExamenCertificacionJavaStudentSystemApplication.class);

	@Override
	@Transactional
	public Comuna add(Comuna comuna) {
		Comuna comunaToAdd = new Comuna();
		try {
			comunaToAdd = dao.save(comuna);
		} catch (Exception e) {
			log.error("Ocurred an error in 'add'. Location: 'com.studentsystem.serviceImpl'. Error: " + e.getMessage());
		}
		return comunaToAdd;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Comuna> findAllComunas() {
		List<Comuna> comunasList = new ArrayList<>();
		try {
			comunasList = (List<Comuna>) dao.findAll();
		} catch (Exception e) {
			log.error("Ocurred an error in 'findAllComunas'. Location: 'com.studentsystem.serviceImpl'. Error: " + e.getMessage());
		}
		return comunasList;
	}

	@Override
	@Transactional(readOnly = true)
	public Comuna findById(Integer id) {
		Comuna comuna = new Comuna();
		try {
			comuna = dao.findById(id).get();
		} catch (Exception e) {
			log.error("Ocurred an error in 'findById'. Location: 'com.studentsystem.serviceImpl'. Error: " + e.getMessage());
		}
		
		return comuna;
	}

	@Override
	@Transactional
	public Comuna update(Comuna comuna) {
		Comuna comunaToUpdate = new Comuna();
		try {
			
			comunaToUpdate = dao.save(comuna);
			
		} catch (Exception e) {
			log.error("Ocurred an error in 'update'. Location: 'com.studentsystem.serviceImpl'. Error: " + e.getMessage());
		}
		return comunaToUpdate;
	}

	@Override
	@Transactional
	public Boolean deleteComuna(Integer id) {
		try {
			if (dao.findById(id) != null) {
				dao.deleteById(id);
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			log.error("Ocurred an error in 'deleteComuna'. Location: 'com.studentsystem.serviceImpl'. Error: " + e.getMessage());
		}
		return false;
	}

}
