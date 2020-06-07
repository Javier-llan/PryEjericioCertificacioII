package com.llango.ejercicio.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.llango.ejercicio.models.dao.IAlumno;
import com.llango.ejercicio.models.entities.Alumno;

@Service
public class AlumnoService implements IAlumnoService{

	@Autowired //Inyección de dependencia
	private IAlumno dao;
	
	@Override
	@Transactional
	public void save(Alumno a) {
		dao.save(a);
		
	}

	@Override
	@Transactional
	public Alumno findById(Integer id) {
		
		return dao.findById(id).get();
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public List<Alumno> findAll() {
		// TODO Auto-generated method stub
		return (List<Alumno>) dao.findAll();
	}

}
