package co.tarjetaCredito.Repositorio;

import co.tarjetaCredito.Entidades.Apro_Rech_Entidad;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class Apro_Rech_RepositorioTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private Apro_Rech_Repositorio aproRechRepositorio;

    private Apro_Rech_Entidad aproRechEntidad;

    @BeforeEach
    public void setUp() {
        aproRechEntidad = new Apro_Rech_Entidad();
        aproRechEntidad.setEstado("Aprobada");
        aproRechEntidad.setFechaCreacion(LocalDate.now());
        entityManager.persistAndFlush(aproRechEntidad);
    }

    @Test
    public void whenFindById_thenReturnApro_Rech_Entidad() {
        // when
        Optional<Apro_Rech_Entidad> found = aproRechRepositorio.findById(aproRechEntidad.getIdSolicitud());

        // then
        assertTrue(found.isPresent());
        assertEquals(found.get().getEstado(), aproRechEntidad.getEstado());
    }
}
