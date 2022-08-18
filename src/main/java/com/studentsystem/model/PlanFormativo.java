package com.studentsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "Plan_Formativo")
@Table(name = "Plan_Formativo")
public class PlanFormativo {
	
	@Id
	private String codigo_plan_formativo;

	@Column(nullable = false)
	private String descripcion;

	@Column(nullable = false)
	private Integer duracion_horas;

}
