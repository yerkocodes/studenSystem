package com.studentsystem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.studentsystem.model.Estudiante;
import com.studentsystem.service.IEstudianteService;
import com.studentsystem.service.IPlanFormativoService;
import com.studentsystem.service.IRegionService;

@Controller
public class EstudiantesController {
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IRegionService regionService;
	
	@Autowired
	private IPlanFormativoService planFormativoService;
	
	@GetMapping("/")
	public RedirectView toHome() {
		return new RedirectView("/estudiantes");
	}
	
	@GetMapping("/estudiantes")
	public ModelAndView home() {
		ModelAndView modelandView = new ModelAndView("home");
		modelandView.addObject("estudiantes", estudianteService.findAllEstudiantes());
		modelandView.addObject("plan", planFormativoService.findAllPlanFormativo());
		modelandView.addObject("regiones", regionService.findAllRegiones());
		modelandView.addObject("cursos", planFormativoService.findAllPlanFormativo());
		return modelandView;
	}
	
	@PostMapping("/filtroEstudiante")
	public ModelAndView filtroEstudiante(@RequestParam("region") int codigoRegion, @RequestParam("curso") String codigoPlanFormativo ) {
		
		ModelAndView modelandView = new ModelAndView("home");

		List<Estudiante> response = new ArrayList<>();
		
		for (Estudiante estudiante : estudianteService.findAllEstudiantes()) {
			if (estudiante.getComuna().getCodigo_region() == codigoRegion && estudiante.getCurso().getPlanFormativo().getCodigo_plan_formativo().equals(codigoPlanFormativo) ) { 
				response.add(estudiante);
			} 
		}
		
		modelandView.addObject("estudiantes", response);
		modelandView.addObject("plan", planFormativoService.findAllPlanFormativo());
		modelandView.addObject("regiones", regionService.findAllRegiones());
		modelandView.addObject("cursos", planFormativoService.findAllPlanFormativo());
		
		return modelandView;
	}

}
