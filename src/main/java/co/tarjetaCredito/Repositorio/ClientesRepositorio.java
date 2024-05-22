package co.tarjetaCredito.Repositorio;

import co.tarjetaCredito.Entidades.ClientesEntidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClientesRepositorio extends CrudRepository<ClientesEntidad, Long> {

}
