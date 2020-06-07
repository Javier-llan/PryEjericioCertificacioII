package com.llango.ejercicio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.llango.ejercicio.models.entities.Alumno;
import com.llango.ejercicio.models.services.IAlumnoService;
@Controller
@RequestMapping(value="/alumno")
public class AlumnoController {
	//Todas las peticiones que gestiona este controlador
	//empiezan por /alumno, p.e: https://localhost:8080/alumno/create
	@Autowired
	private IAlumnoService srvAlumno;
	//cada metodo en el controlador gestiona una petición al controlador
	//a travez de una URL (puede -> 1. Escrita en el navegador
	//2.- Puede ser Hiperlink, 3.- Puede ser un action de un form)
	
	@GetMapping(value="create")
	public String create(Model model) {
		Alumno alumno=new Alumno();
		model.addAttribute("title","Registro de un nuevo alumno");
		model.addAttribute("alumno",alumno);//similar al viewBag permite enviar lista, objetos o atributos 
		return "alumno/form";//ubicación de la vista
	}
	@GetMapping(value="/retrieve/{id}")
	public String retrieve(@PathVariable(value="id") Integer id, Model model) {
		Alumno alumno=srvAlumno.findById(id);
		model.addAttribute("alumno",alumno);
		return "alumno/card";
	}
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id") Integer id,Model model) {
		Alumno alumno = srvAlumno.findById(id);
		model.addAttribute("title","Actualizando el registro de "+alumno);
		model.addAttribute("alumno",alumno);
		return "alumno/form";
	}
	
	@GetMapping(value="/delete/{id}")
	public String delete(@PathVariable(value="id") Integer id,Model model) {
		srvAlumno.delete(id);
		return "redirect:/alumno/list";
		
	}
	
	@GetMapping(value="/list")
	public String list(Model model) {
		List<Alumno>alumnos =srvAlumno.findAll();
		model.addAttribute("alumno",alumnos);
		model.addAttribute("title","Listado de alumnos");
		return "alumno/list";
	}
	
	@PostMapping(value="Save")
	public String save(Alumno alumno, Model model) {
		srvAlumno.save(alumno);
		return "redirect:/alumno/list";
	}
}
