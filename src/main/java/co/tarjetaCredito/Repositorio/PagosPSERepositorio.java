package co.tarjetaCredito.Repositorio;

import co.tarjetaCredito.Entidades.PagosPSE_Entidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagosPSERepositorio extends JpaRepository<PagosPSE_Entidad, Integer>{

}