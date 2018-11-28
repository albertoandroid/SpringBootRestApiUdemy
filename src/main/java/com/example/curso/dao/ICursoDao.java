package com.example.curso.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.curso.entity.Curso;

public interface ICursoDao extends CrudRepository<Curso, Long> {
	
	public List<Curso> findByProfesorId(Long id);

}
