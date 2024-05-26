package co.tarjetaCredito.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.tarjetaCredito.entidades.Cliente;

@Repository
public interface ClienteRepo extends CrudRepository<Cliente, Integer>{

    
}
