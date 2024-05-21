package co.tarjetaCredito.Repositorio;

import co.tarjetaCredito.Entidades.SolicitudEntidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudRepositorio extends JpaRepository<SolicitudEntidad, Long> {
}