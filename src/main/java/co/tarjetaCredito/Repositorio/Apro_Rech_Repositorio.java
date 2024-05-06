package co.tarjetaCredito.Repositorio;

import co.tarjetaCredito.Entidades.Apro_Rech_Entidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Apro_Rech_Repositorio extends JpaRepository<Apro_Rech_Entidad,Long>
{

}