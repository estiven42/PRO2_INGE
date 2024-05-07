package co.tarjetaCredito.Repositorio;

import co.tarjetaCredito.Entidades.PagosPSEEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagosPSERepositorio extends JpaRepository<PagosPSEEntidad, Integer>{

}