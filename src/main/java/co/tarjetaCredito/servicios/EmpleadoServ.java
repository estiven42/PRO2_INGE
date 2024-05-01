package co.tarjetaCredito.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tarjetaCredito.entidades.Empleado;
import co.tarjetaCredito.repositorios.EmpleadoRepo;

public interface EmpleadoServ {
    
    public void saveEmpleado(Empleado empleado);

    List<Empleado> obtenerEmpleados();

    boolean validarEmpleado(String contrasena);
}
