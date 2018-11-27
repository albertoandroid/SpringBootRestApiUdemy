package com.example.curso.service;

import java.util.List;
import java.util.Optional;

import com.example.curso.entity.Profesor;

public interface IProfesorService {
	
	public List<Profesor> findAll();
	
	public void save(Profesor profesor);
	
	public Profesor findProfesor(Profesor profesor);
	
	public Profesor checkProfesorLogin(Profesor profesor);
	
	public void deleteProfesor(Profesor profesor);
	
	public Profesor uptadeProfesor(Profesor profesor);
	
	public Optional<Profesor> findProfesorById(Long profesor_id);
	
	public void deleteProfesor(Long id);
	
	public void deleteAllProfesor();
	
	public Profesor findById(Long id);
	
	public Profesor findByIdSQL(Long id);
	
}
