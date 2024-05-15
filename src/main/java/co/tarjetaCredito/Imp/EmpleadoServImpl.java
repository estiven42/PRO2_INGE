package co.tarjetaCredito.Imp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tarjetaCredito.entidades.Empleado;
import co.tarjetaCredito.repositorios.EmpleadoRepo;
import co.tarjetaCredito.servicios.EmpleadoServ;

@Service
public class EmpleadoServImpl implements EmpleadoServ {

    @Autowired
    private EmpleadoRepo empleadoRepo;
    

    @Override
    public void saveEmpleado(Empleado empleado) {
        empleadoRepo.save(empleado);
    }


    @Override
    public List<Empleado> obtenerEmpleados() {
        return (List<Empleado>) this.empleadoRepo.findAll();
    }


    @Override
    public boolean validarEmpleado (String correo, String contrasena) {
    List<Empleado> emp = this.empleadoRepo.findByCorreo(correo);
        for(Empleado objemp: emp) {
            if(objemp.getContrasena() == contrasena){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }


    @Override
    public List<Empleado> buscarCorreo(String correo) {
       return (List<Empleado>) this.empleadoRepo.findByCorreo(correo);
    }


    @Override
    public Empleado exexistsByEmpleado(String correo) {
        return (Empleado) this.exexistsByEmpleado(correo);
    }

}
