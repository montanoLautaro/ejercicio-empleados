package com.example.empleados.controlador;

import com.example.empleados.modelo.Empleado;
import com.example.empleados.servicio.EmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
    public class EmpleadoControlador {

        @Autowired
        private EmpleadoServicio servicio;

        /*
            Obtengo el listado de los estudiantes
         */
        @GetMapping({"/empleados"})
        public String listarEmpleados(Model modelo) {
            modelo.addAttribute("empl",servicio.listarTodosLosEmpleados());
            return "empleados"; //retorna al archivo html empleados
        }

        @GetMapping("/empleados/nuevo")
        public String crearEmpleadoFormulario(Model modelo) {
            Empleado empleado = new Empleado();
            modelo.addAttribute("empleado", empleado);
            return "crear_empleado";
        }

        @PostMapping("/empleados")
        public String guardarEmpleado (@ModelAttribute("empleado")Empleado empleado ){
            servicio.guardarEmpleado(empleado);
            return "redirect:/";
        }
}
