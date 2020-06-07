package com.llango.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.llango.ejercicio.models.entities.Matricula;

public interface IMatricula extends CrudRepository<Matricula, Integer>{

}
