package com.llango.ejercicio.models.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity //javax.persistence es el ORM => JPA
@Table(name="aulas")//minusculas y plural y para dos palabras con _
public class Aula implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="pk_aula")
	private Integer idaula;
	
	@Column(name="fecha_inicio")
	private Calendar fechaInicio;
	
	@Column(name="fecha_fin")
	private Calendar fechaFin;
	
	public Aula() {
		super();
	}
	
	public Aula(Integer id) {
		super();
		this.idaula=id;
	}
	
	
	
	public Integer getIdaula() {
		return idaula;
	}

	public void setIdaula(Integer idaula) {
		this.idaula = idaula;
	}

	public Calendar getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Calendar fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Calendar getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Calendar fechaFin) {
		this.fechaFin = fechaFin;
	}



	@JoinColumn(name="fk_profesor", referencedColumnName="pk_persona")
	@ManyToOne
	private Profesor docente;
	

	
	@JoinColumn(name="fk_asignatura", referencedColumnName="pk_materia")
	@ManyToOne
	private Materia asignatura;

	public Profesor getDocente() {
		return docente;
	}

	public void setDocente(Profesor docente) {
		this.docente = docente;
	}

	public Materia getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Materia asignatura) {
		this.asignatura = asignatura;
	}

	

	
	
}
