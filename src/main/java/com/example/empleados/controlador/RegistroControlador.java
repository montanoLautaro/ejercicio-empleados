package com.example.empleados.controlador;

import com.example.empleados.servicio.EmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistroControlador {

	@Autowired
	private EmpleadoServicio empleadoServicio;
	
	@GetMapping("/login")
	public String iniciarSesion() {
		return "login";
	}
	
	@GetMapping("/")
	public String verPaginaDeInicio(Model modelo) {
		modelo.addAttribute("empl",empleadoServicio.listarTodosLosEmpleados());
		return "index";
	}
}
