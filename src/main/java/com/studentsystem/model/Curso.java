package com.studentsystem.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Curso {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //MYSQL
	private String codigo_curso;

	@Column(nullable = false)
	private Date fecha_inicio;

	@Column(nullable = false)
	private Date fecha_termino;

	@Column(nullable = false)
	private String codigo_modulo;

}
