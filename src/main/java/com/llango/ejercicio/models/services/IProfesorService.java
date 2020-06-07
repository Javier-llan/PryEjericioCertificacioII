package com.llango.ejercicio.models.services;

import java.util.List;

import com.llango.ejercicio.models.entities.Profesor;

public interface IProfesorService {
 
	public void save(Profesor profersor);
	public Profesor findById(Integer id);
	public void delete(Integer id);
	public List<Profesor> findAll();
}
