package com.llango.ejercicio.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.llango.ejercicio.models.dao.IProfesor;
import com.llango.ejercicio.models.entities.Profesor;
@Service
public class ProfesorService implements IProfesorService{

	@Autowired
	private IProfesor dao;
	@Override
	@Transactional
	public void save(Profesor profesor) {
		// TODO Auto-generated method stub
		dao.save(profesor);
	}

	@Override
	@Transactional
	public Profesor findById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	@Transactional
	public List<Profesor> findAll() {
		// TODO Auto-generated method stub
		return (List<Profesor>) dao.findAll();
	}

}
