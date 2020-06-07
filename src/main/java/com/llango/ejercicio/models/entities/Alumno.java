package com.llango.ejercicio.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="alumnos")
public class Alumno extends Persona  implements Serializable{

private static final long serialVersionUID = 1L;
	
	//atributos de la tabla
	@Column(name="identificador")
	private String identificador;


	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	//relación entre tablas uno a muchos
	
	@OneToMany(mappedBy="estudiante",fetch=FetchType.LAZY)
	private List<Matricula> matricula;

	public List<Matricula> getMatricula() {
		return matricula;
	}

	public void setMatricula(List<Matricula> matricula) {
		this.matricula = matricula;
	}
	
	//constructor
	public Alumno() {
		super();
	}
	
	public Alumno(Integer id) {
		super();
		this.setIdpersona(id);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
