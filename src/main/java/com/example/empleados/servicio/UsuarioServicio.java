package com.example.empleados.servicio;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.empleados.controlador.dto.UsuarioRegistroDTO;
import com.example.empleados.modelo.Usuario;


public interface UsuarioServicio extends UserDetailsService{

	public Usuario guardar(UsuarioRegistroDTO registroDTO);
	
	public List<Usuario> listarUsuarios();


	
}
