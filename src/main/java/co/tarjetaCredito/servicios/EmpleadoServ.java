package co.tarjetacredito.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tarjetacredito.entidades.Empleado;
import co.tarjetacredito.repositorios.EmpleadoRepo;

public interface EmpleadoServ {
    
    public void saveEmpleado(Empleado empleado);

    List<Empleado> obtenerEmpleados();

    boolean validarEmpleado(String correo, String contrasena);
}
