package co.tarjetaCredito.repositorios;

import org.springframework.stereotype.Repository;

import co.tarjetaCredito.entidades.SolicitudTarjetaCredito;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface SolicitudTarjetaCreditoRepo extends CrudRepository<SolicitudTarjetaCredito, Integer>{
    
}
