package com.llango.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.llango.ejercicio.models.entities.Alumno;

public interface IAlumno extends CrudRepository<Alumno, Integer>{

}
