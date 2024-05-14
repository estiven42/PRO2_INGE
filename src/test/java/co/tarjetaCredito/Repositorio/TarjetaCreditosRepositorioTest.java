package co.tarjetaCredito.Repositorio;

import co.tarjetaCredito.Entidades.TarjetaCreditos;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class TarjetaCreditosRepositorioTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private TarjetaCreditosRepositorio tarjetaCreditosRepositorio;

    @Test
    public void whenFindById_thenReturnTarjetaCreditos() {
        // given
        TarjetaCreditos tarjetaCreditos = new TarjetaCreditos();
        tarjetaCreditos.setNumeroTarjeta("1234567890123456");
        tarjetaCreditos.setLimiteCredito(5000.00);
        tarjetaCreditos.setSaldoActual(1000.00);
        tarjetaCreditos.setFkidCliente(1);
        tarjetaCreditos.setEstado("Activa");
        entityManager.persistAndFlush(tarjetaCreditos);

        // when
        Optional<TarjetaCreditos> found = tarjetaCreditosRepositorio.findById(tarjetaCreditos.getIdTarjeta());

        // then
        assertTrue(found.isPresent());
        assertEquals(found.get().getNumeroTarjeta(), tarjetaCreditos.getNumeroTarjeta());
    }
}
