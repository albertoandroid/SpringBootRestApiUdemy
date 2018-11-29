package com.example.curso.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.curso.entity.Lenguaje;

public interface ILenguajeDao extends CrudRepository<Lenguaje, Long> {
	
	@Query("select l from Lenguaje l where l.id=?1")
	public Lenguaje findByIdSQL(Long id);

}
