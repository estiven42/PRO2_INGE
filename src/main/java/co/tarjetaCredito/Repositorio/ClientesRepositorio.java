package co.tarjetaCredito.Repositorio;

import co.tarjetaCredito.Entidades.ClientesEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ClientesRepositorio extends JpaRepository<ClientesEntidad,Long>
{

}