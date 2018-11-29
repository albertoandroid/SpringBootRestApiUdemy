package com.example.curso.service;

import java.util.List;

import com.example.curso.entity.Lenguaje;

public interface ILenguajeService {

	public List<Lenguaje> findAll();
	
	public void saveLenguaje(Lenguaje lenguaje);
	
	public Lenguaje findLenguajeByID(Long id);
}
