package com.llango.ejercicio.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llango.ejercicio.models.dao.IArea;
import com.llango.ejercicio.models.entities.Area;
@Service
public class AreaService implements IAreaService{

	@Autowired
	private IArea dao;
	@Override
	@Transactional
	public void save(Area area) {
		dao.save(area);
		
	}

	@Override
	@Transactional
	public Area findById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	@Transactional
	public List<Area> findAll() {
		// TODO Auto-generated method stub
		return (List<Area>) dao.findAll();
	}

}
