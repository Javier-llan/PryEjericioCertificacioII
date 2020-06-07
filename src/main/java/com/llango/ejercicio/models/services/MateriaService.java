package com.llango.ejercicio.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llango.ejercicio.models.dao.IMateria;
import com.llango.ejercicio.models.entities.Materia;

@Service
public class MateriaService implements IMateriaService{

	@Autowired
	private IMateria dao;
	
	@Override
	@Transactional
	public void save(Materia materia) {
		dao.save(materia);
		
	}

	@Override
	@Transactional
	public Materia findById(Integer id) {
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
	public List<Materia> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
