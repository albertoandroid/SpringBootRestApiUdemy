package com.example.curso.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.curso.entity.Profesor;
import com.example.curso.model.MProfesor;

@Component("mapper")
public class Mapper {

	public static List<MProfesor> convertirLista(List<Profesor> profesores){
		List<MProfesor> mProfesores = new ArrayList<>();
		for(Profesor profesor: profesores) {
			mProfesores.add(new MProfesor(profesor));
		}
		return mProfesores;
	}
}
