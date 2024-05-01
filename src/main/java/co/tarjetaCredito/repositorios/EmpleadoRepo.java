package co.tarjetaCredito.repositorios;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.tarjetaCredito.entidades.Empleado;
import co.tarjetaCredito.servicios.EmpleadoServ;
import java.util.List;


@Repository
public interface EmpleadoRepo extends CrudRepository<Empleado, Integer> {

        Boolean findByContrasena(String contrasena);

        
    
}
