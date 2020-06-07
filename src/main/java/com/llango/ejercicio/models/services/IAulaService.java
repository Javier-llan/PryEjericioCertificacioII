package com.llango.ejercicio.models.services;

import java.util.List;

import com.llango.ejercicio.models.entities.Aula;

public interface IAulaService {
	
	public void save (Aula au);
	public Aula findById(Integer id);
	public void delete (Integer id);
	public List<Aula> findAll();

}
