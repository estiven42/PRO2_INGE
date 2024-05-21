package co.tarjetaCredito.Repositorio;

import co.tarjetaCredito.Entidades.AproRechEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AproRechRepositorio extends JpaRepository<AproRechEntidad, Long> {

}