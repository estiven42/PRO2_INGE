package co.tarjetaCredito.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import co.tarjetaCredito.Entidades.ClientesEntidad;

@Repository
public interface ClienteRepo extends CrudRepository<ClientesEntidad, Integer>{

    
}
