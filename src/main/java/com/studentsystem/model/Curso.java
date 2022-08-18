package com.studentsystem.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Curso")
@Entity(name = "Curso")
public class Curso {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //MYSQL
	private String codigo_curso;

	@Column(nullable = false)
	private Date fecha_inicio;

	@Column(nullable = false)
	private Date fecha_termno;

	@Column(nullable = false, updatable = false, insertable = false)
	private String codigo_plan_formativo;

	@ManyToOne
	@JoinColumn(name = "codigo_plan_formativo")
	private PlanFormativo planFormativo;
}
