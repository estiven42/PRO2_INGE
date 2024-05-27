package co.tarjetaCredito.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.tarjetaCredito.entidades.TarjetaCredito;

@Repository
public interface TarjetaCreditoRepo extends CrudRepository<TarjetaCredito,Integer>{
    
}
