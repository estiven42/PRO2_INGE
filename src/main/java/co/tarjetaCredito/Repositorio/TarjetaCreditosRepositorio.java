package co.tarjetaCredito.Repositorio;

import co.tarjetaCredito.Entidades.TarjetaCreditos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarjetaCreditosRepositorio extends JpaRepository<TarjetaCreditos,Integer>
{

}
