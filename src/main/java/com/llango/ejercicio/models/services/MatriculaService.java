package com.llango.ejercicio.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llango.ejercicio.models.dao.IMatricula;
import com.llango.ejercicio.models.entities.Matricula;
@Service
public class MatriculaService implements IMatriculaService{

	@Autowired
	private IMatricula dao;
	@Override
	public void save(Matricula matricula) {
		// TODO Auto-generated method stub
		dao.save(matricula);
	}

	@Override
	public Matricula findById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public List<Matricula> findAll() {
		// TODO Auto-generated method stub
		return (List<Matricula>) dao.findAll();
	}

}
