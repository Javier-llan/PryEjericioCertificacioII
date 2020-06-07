package com.llango.ejercicio.models.services;

import java.util.List;

import com.llango.ejercicio.models.entities.Materia;

public interface IMateriaService {

	public void save(Materia materia);
	public Materia findById(Integer id);
	public void delete(Integer id);
	public List<Materia> findAll();
	
}
