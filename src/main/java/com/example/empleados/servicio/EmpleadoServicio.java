package com.example.empleados.servicio;

import com.example.empleados.modelo.Empleado;

import java.util.List;

public interface EmpleadoServicio {
    public List<Empleado> listarTodosLosEmpleados();

    public Empleado guardarEmpleado(Empleado empleado);

    public Empleado obtenerEmpleadoPorId (Long id);

    public Empleado actualizarEmpleado (Empleado empleado);

    public void eliminarEmpleado (Long id);
}
