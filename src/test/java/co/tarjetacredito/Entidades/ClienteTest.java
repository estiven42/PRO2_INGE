


package co.tarjetacredito.Entidades;

import org.junit.jupiter.api.Test;
import co.tarjetaCredito.entidades.Cliente;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void probarObtenerSerial() {
        co.tarjetaCredito.entidades.Cliente cliente = new co.tarjetaCredito.entidades.Cliente();
        cliente.setSerial(12345);
        assertEquals(12345, cliente.getSerial());
    }

    @Test
    void probarObtenerNombre() {
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan Pérez");
        assertEquals("Juan Pérez", cliente.getNombre());
    }

    @Test
    void probarObtenerTelefono() {
        Cliente cliente = new Cliente();
        cliente.setTelefono(1234567890);
        assertEquals(1234567890, cliente.getTelefono());
    }

    @Test
    void probarObtenerCorreo() {
        co.tarjetaCredito.entidades.Cliente cliente = new Cliente();
        cliente.setCorreo("juan.perez@example.com");
        assertEquals("juan.perez@example.com", cliente.getCorreo());
    }

    @Test
    void probarObtenerContrasena() {
        Cliente cliente = new Cliente();
        cliente.setContrasena("contraseña123");
        assertEquals("contraseña123", cliente.getContrasena());
    }

    @Test
    void probarObtenerDireccion() {
        Cliente cliente = new Cliente();
        cliente.setDireccion("Calle 123, Ciudad");
        assertEquals("Calle 123, Ciudad", cliente.getDireccion());
    }

    @Test
    void probarEstablecerSerial() {
        Cliente cliente = new Cliente();
        cliente.setSerial(54321);
        assertEquals(54321, cliente.getSerial());
    }

    @Test
    void probarEstablecerNombre() {
        Cliente cliente = new Cliente();
        cliente.setNombre("María García");
        assertEquals("María García", cliente.getNombre());
    }

    @Test
    void probarEstablecerTelefono() {
        Cliente cliente = new Cliente();
        cliente.setTelefono(987654321);
        assertEquals(987654321, cliente.getTelefono());
    }

    @Test
    void probarEstablecerCorreo() {
        Cliente cliente = new Cliente();
        cliente.setCorreo("maria.garcia@example.com");
        assertEquals("maria.garcia@example.com", cliente.getCorreo());
    }

    @Test
    void probarEstablecerContrasena() {
        Cliente cliente = new Cliente();
        cliente.setContrasena("contraseña456");
        assertEquals("contraseña456", cliente.getContrasena());
    }

    @Test
    void probarEstablecerDireccion() {
        Cliente cliente = new Cliente();
        cliente.setDireccion("Avenida 456, Pueblo");
        assertEquals("Avenida 456, Pueblo", cliente.getDireccion());
    }
}
