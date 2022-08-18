package com.studentsystem.model;

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
public class Region {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //MYSQL
	private int codigo_region;

	@Column(nullable = false)
	private String nombre;

}
