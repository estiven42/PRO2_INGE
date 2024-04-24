package co.tarjetaCredito.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.tarjetaCredito.entidades.Empleado;

@Repository
public interface empleadoRepo extends CrudRepository<Empleado, Integer> {
    
}
