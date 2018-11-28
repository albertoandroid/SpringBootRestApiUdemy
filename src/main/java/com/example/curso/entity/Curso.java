package com.example.curso.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="curso")
public class Curso implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long curso_id;
	
	private String nombre;
	
	@Column(name="profesor_id")
	private Long profesorId;
	
	public Curso() {
		
	}
	
	public Long getCurso_id() {
		return curso_id;
	}

	public void setCurso_id(Long curso_id) {
		this.curso_id = curso_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Long getProfesorId() {
		return profesorId;
	}


	public void setProfesorId(Long profesorId) {
		this.profesorId = profesorId;
	}

	private static final long serialVersionUID = 1L;
}
