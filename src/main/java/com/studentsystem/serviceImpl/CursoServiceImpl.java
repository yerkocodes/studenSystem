package com.studentsystem.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.studentsystem.ExamenCertificacionJavaStudentSystemApplication;
import com.studentsystem.dao.ICursoRepository;
import com.studentsystem.model.Curso;
import com.studentsystem.service.ICursoService;

@Service
public class CursoServiceImpl implements ICursoService {
	
	@Autowired
	private ICursoRepository dao;
	
	private Logger log = LoggerFactory.getLogger(ExamenCertificacionJavaStudentSystemApplication.class);

	@Override
	@Transactional
	public Curso add(Curso curso) {
		Curso cursoToAdd = new Curso();
		try {
			cursoToAdd = dao.save(curso);
		} catch (Exception e) {
			log.error("Ocurred an error in 'add'. Location: 'com.studentsystem.serviceImpl'. Error: " + e.getMessage());
		}
		return cursoToAdd;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Curso> findAllCursos() {
		List<Curso> cursoList = new ArrayList<>();
		try {
			cursoList = (List<Curso>) dao.findAll();
		} catch (Exception e) {
			log.error("Ocurred an error in 'findAllCursos'. Location: 'com.studentsystem.serviceImpl'. Error: " + e.getMessage());
		}
		return cursoList;
	}

	@Override
	@Transactional(readOnly = true)
	public Curso findById(String id) {
		Curso comuna = new Curso();
		try {
			comuna = dao.findByIdCurso(id);
		} catch (Exception e) {
			log.error("Ocurred an error in 'findById'. Location: 'com.studentsystem.serviceImpl'. Error: " + e.getMessage());
		}
		
		return comuna;
	}

	@Override
	@Transactional
	public Curso update(Curso curso) {
		Curso cursoToUpdate = new Curso();
		try {
			
			cursoToUpdate = dao.save(curso);
			
		} catch (Exception e) {
			log.error("Ocurred an error in 'update'. Location: 'com.studentsystem.serviceImpl'. Error: " + e.getMessage());
		}
		return cursoToUpdate;
	}

	@Override
	@Transactional
	public Boolean deleteCurso(String id) {
		try {
			if (dao.findById(id) != null) {
				dao.deleteCursoWithId(id);
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			log.error("Ocurred an error in 'deleteCurso'. Location: 'com.studentsystem.serviceImpl'. Error: " + e.getMessage());
		}
		return false;
	}

}
