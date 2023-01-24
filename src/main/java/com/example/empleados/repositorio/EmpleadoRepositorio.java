package com.example.empleados.repositorio;

import com.example.empleados.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long> {

    }


