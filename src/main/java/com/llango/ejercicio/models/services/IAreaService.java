package com.llango.ejercicio.models.services;

import java.util.List;

import com.llango.ejercicio.models.entities.Area;

public interface IAreaService {

	public void save(Area area);
	public Area findById(Integer id);
	public void delete(Integer id);
	public List<Area> findAll();
}
