package com.llango.ejercicio.models.services;

import java.util.List;

import com.llango.ejercicio.models.entities.Matricula;

public interface IMatriculaService {

	public void save(Matricula matricula);
	public Matricula findById(Integer id);
	public void delete(Integer id);
	public List<Matricula> findAll();
	
}
