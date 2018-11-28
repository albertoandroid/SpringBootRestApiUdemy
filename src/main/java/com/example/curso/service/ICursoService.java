package com.example.curso.service;

import java.util.List;

import com.example.curso.entity.Curso;

public interface ICursoService {
	
	public List<Curso> findAll();
	
	public void saveCurso(Curso curso);
	
	public List<Curso> getCursosProfesor(Long id);
}
