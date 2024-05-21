package co.tarjetaCredito.Repositorio;

import co.tarjetaCredito.Entidades.PagosPSE_Entidad;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class PagosPSERepositorioTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private PagosPSERepositorio pagosPSERepositorio;

    @Test
    public void whenFindById_thenReturnPagosPSEEntidad() {
        // given
        PagosPSE_Entidad pagosPSEEntidad = new PagosPSE_Entidad();
        pagosPSEEntidad.setFechaPago(LocalDate.now());
        pagosPSEEntidad.setMonto(1000.00);
        pagosPSEEntidad.setNumeroTarjeta("1234567890123456");
        pagosPSEEntidad.setFkidtarjetacredito(1);
        entityManager.persistAndFlush(pagosPSEEntidad);

        // when
        Optional<PagosPSE_Entidad> found = pagosPSERepositorio.findById(pagosPSEEntidad.getIdPago());

        // then
        assertTrue(found.isPresent());
        assertEquals(found.get().getNumeroTarjeta(), pagosPSEEntidad.getNumeroTarjeta());
    }
}
