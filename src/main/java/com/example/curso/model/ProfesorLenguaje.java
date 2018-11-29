package com.example.curso.model;

import com.example.curso.entity.Lenguaje;
import com.example.curso.entity.Profesor;

public class ProfesorLenguaje {

	private Profesor profesor;
	private Lenguaje lenguaje;
	
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public Lenguaje getLenguaje() {
		return lenguaje;
	}
	public void setLenguaje(Lenguaje lenguaje) {
		this.lenguaje = lenguaje;
	}
	
}
