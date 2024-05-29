

package co.tarjetacredito.Entidades;

import org.junit.jupiter.api.Test;
import co.tarjetaCredito.entidades.Empleado;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {

    @Test
    void probarObtenerNombre() {
        Empleado empleado = new Empleado();
        empleado.setNombre("Juan Pérez");
        assertEquals("Juan Pérez", empleado.getNombre());
    }

    @Test
    void probarEstablecerNombre() {
        Empleado empleado = new Empleado();
        empleado.setNombre("María García");
        assertEquals("María García", empleado.getNombre());
    }

    @Test
    void probarObtenerSerial() {
        Empleado empleado = new Empleado();
        empleado.setSerial(12345);
        assertEquals(12345, empleado.getSerial());
    }

    @Test
    void probarEstablecerSerial() {
        Empleado empleado = new Empleado();
        empleado.setSerial(54321);
        assertEquals(54321, empleado.getSerial());
    }

    @Test
    void probarObtenerCorreo() {
        Empleado empleado = new Empleado();
        empleado.setCorreo("juan.perez@example.com");
        assertEquals("juan.perez@example.com", empleado.getCorreo());
    }

    @Test
    void probarEstablecerCorreo() {
        Empleado empleado = new Empleado();
        empleado.setCorreo("maria.garcia@example.com");
        assertEquals("maria.garcia@example.com", empleado.getCorreo());
    }

    @Test
    void probarObtenerContrasena() {
        Empleado empleado = new Empleado();
        empleado.setContrasena("contraseña123");
        assertEquals("contraseña123", empleado.getContrasena());
    }

    @Test
    void probarEstablecerContrasena() {
        Empleado empleado = new Empleado();
        empleado.setContrasena("contraseña456");
        assertEquals("contraseña456", empleado.getContrasena());
    }
}
