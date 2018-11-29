package com.example.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.curso.dao.ILenguajeDao;
import com.example.curso.entity.Lenguaje;

@Service
public class LenguajeService implements ILenguajeService {

	@Autowired
	private ILenguajeDao lenguajeDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Lenguaje> findAll() {
		return (List<Lenguaje>)lenguajeDao.findAll();
	}

	@Override
	@Transactional
	public void saveLenguaje(Lenguaje lenguaje) {
		lenguajeDao.save(lenguaje);		
	}

	@Override
	@Transactional(readOnly = true)
	public Lenguaje findLenguajeByID(Long id) {
		return lenguajeDao.findByIdSQL(id);
	}

}
