package com.llango.ejercicio.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.llango.ejercicio.models.dao.IAula;
import com.llango.ejercicio.models.entities.Aula;

public class AulaService implements IAulaService{

	@Autowired
	private IAula dao;
	
	@Override
	@Transactional
	public void save(Aula au) {
		dao.save(au);
		
	}

	@Override
	@Transactional
	public Aula findById(Integer id) {
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
	public List<Aula> findAll() {
		// TODO Auto-generated method stub
		return (List<Aula>) dao.findAll();
	}

}
