package com.studentsystem.model;

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
@Entity(name = "Estudiante")
@Table(name = "Estudiante")
public class Estudiante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_estudiante;

	@Column(nullable = false, unique = true)
	private String rut;

	@Column(nullable = false)
	private String nombre;

	@Column(nullable = false)
	private String apellido_pat;

	@Column(nullable = false)
	private String apellido_mat;

	@Column(nullable = false)
	private String direccion;

	@Column(nullable = false, updatable = false, insertable = false)
	private int codigo_comuna;

	@Column(nullable = false, updatable = false, insertable = false)
	private String codigo_curso;

	@ManyToOne
	@JoinColumn(name = "codigo_curso")
	private Curso curso;

	@ManyToOne
	@JoinColumn(name = "codigo_comuna")
	private Comuna comuna;

}
