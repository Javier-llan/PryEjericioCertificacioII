package com.llango.ejercicio.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity //javax.persistence es el ORM => JPA
@Table(name="areas")//minusculas y plural y para dos palabras con _
public class Area implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="pk_area")
	private Integer idarea;
	
	@Column(name="nombre")
	private String nombre;

	public Area() {
		super();
	}
	
	public Area(Integer id) {
		super();
		this.idarea=id;
	}

	public Integer getIdarea() {
		return idarea;
	}

	public void setIdarea(Integer idarea) {
		this.idarea = idarea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//uno a varios con materia
	@OneToMany(mappedBy="area", fetch=FetchType.LAZY)
	private List<Materia> materias;

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	
	
}
