

package co.tarjetacredito.Entidades;

import org.junit.jupiter.api.Test;
import co.tarjetaCredito.entidades.EstadoSolicitud;

import static org.junit.jupiter.api.Assertions.*;

class EstadoSolicitudTest {

    @Test
    void probarObtenerSerial() {
        EstadoSolicitud estadoSolicitud = new EstadoSolicitud();
        estadoSolicitud.setSerial(12345);
        assertEquals(12345, estadoSolicitud.getSerial());
    }

    @Test
    void probarObtenerDescripcion() {
        EstadoSolicitud estadoSolicitud = new EstadoSolicitud();
        estadoSolicitud.setDescripcion("Aprobada");
        assertEquals("Aprobada", estadoSolicitud.getDescripcion());
    }

    @Test
    void probarEstablecerSerial() {
        EstadoSolicitud estadoSolicitud = new EstadoSolicitud();
        estadoSolicitud.setSerial(54321);
        assertEquals(54321, estadoSolicitud.getSerial());
    }

    @Test
    void probarEstablecerDescripcion() {
        EstadoSolicitud estadoSolicitud = new EstadoSolicitud();
        estadoSolicitud.setDescripcion("Rechazada");
        assertEquals("Rechazada", estadoSolicitud.getDescripcion());
    }
}
