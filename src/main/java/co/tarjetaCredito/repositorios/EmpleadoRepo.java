package co.tarjetacredito.repositorios;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.tarjetacredito.entidades.Empleado;

import java.util.List;


@Repository
public interface EmpleadoRepo extends CrudRepository<Empleado, Integer> {

        List<Empleado> findByCorreo(String correo);
        
        
    
}
