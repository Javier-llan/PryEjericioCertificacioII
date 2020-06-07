package com.llango.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.llango.ejercicio.models.entities.Area;

public interface IArea extends CrudRepository <Area, Integer> {

}
