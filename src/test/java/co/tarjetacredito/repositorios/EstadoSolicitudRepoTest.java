package co.tarjetacredito.repositorios;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import co.tarjetaCredito.entidades.EstadoSolicitud;
import co.tarjetaCredito.repositorios.EstadoSolicitudRepo;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class EstadoSolicitudRepoTest {

    @Autowired
    private EstadoSolicitudRepo estadoSolicitudRepo;

    @Test
    void testSaveEstadoSolicitud() {

        EstadoSolicitud estadoSolicitud = new EstadoSolicitud();
        estadoSolicitud.setDescripcion("Nuevo estado de solicitud");


        estadoSolicitudRepo.save(estadoSolicitud);

        Optional<EstadoSolicitud> resultado = estadoSolicitudRepo.findById((int) estadoSolicitud.getSerial());
        assertTrue(resultado.isPresent());
        assertEquals("Nuevo estado de solicitud", resultado.get().getDescripcion());
    }

    @Test
    void testFindAllEstadosSolicitud() {

        Iterable<EstadoSolicitud> estadosSolicitud = estadoSolicitudRepo.findAll();


        assertNotNull(estadosSolicitud);
        assertTrue(estadosSolicitud.iterator().hasNext());
    }


}
