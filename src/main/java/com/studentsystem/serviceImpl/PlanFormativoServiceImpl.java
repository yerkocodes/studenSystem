package com.studentsystem.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.studentsystem.ExamenCertificacionJavaStudentSystemApplication;
import com.studentsystem.dao.IPlanFormativoRepository;
import com.studentsystem.model.PlanFormativo;
import com.studentsystem.service.IPlanFormativoService;

@Service
public class PlanFormativoServiceImpl implements IPlanFormativoService {

	@Autowired
	private IPlanFormativoRepository dao;

	private Logger log = LoggerFactory.getLogger(ExamenCertificacionJavaStudentSystemApplication.class);

	@Override
	@Transactional(readOnly = true)
	public List<PlanFormativo> findAllPlanFormativo() {
		List<PlanFormativo> lista = new ArrayList<>();
		try {
			lista = dao.findAll();
		} catch (Exception e) {
			log.error("Ocurred an error in 'findAllPlanFormativo'. Location: 'com.studentsystem.serviceImpl'. Error: " + e.getMessage());
		}
		return lista;
	}

}
