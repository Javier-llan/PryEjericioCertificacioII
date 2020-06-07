package com.llango.ejercicio.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llango.ejercicio.models.dao.ISemestre;
import com.llango.ejercicio.models.entities.Semestre;
@Service
public class SemestreService implements ISemestreService{
	@Autowired
	private ISemestre dao;
	@Override
	public void save(Semestre semestre) {
		// TODO Auto-generated method stub
		dao.save(semestre);
	}

	@Override
	public Semestre findById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public List<Semestre> findAll() {
		// TODO Auto-generated method stub
		return (List<Semestre>)dao.findAll();
	}

}
