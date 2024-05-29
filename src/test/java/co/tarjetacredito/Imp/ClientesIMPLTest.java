package co.tarjetacredito.Imp;

import co.tarjetaCredito.Imp.ClientesIMPL;
import co.tarjetaCredito.entidades.Cliente;
import co.tarjetaCredito.repositorios.ClienteRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ClientesIMPLTest {

    @Mock
    private ClienteRepo clienteRepo;

    @InjectMocks
    private ClientesIMPL clientesIMPL;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void modificarCliente_ClienteExiste_ModificacionExitosa() {
        int id = 1;
        Cliente cliente = new Cliente();
        cliente.setSerial(id);
        when(clienteRepo.existsById(id)).thenReturn(true);
        when(clienteRepo.save(cliente)).thenReturn(cliente);

        Cliente clienteModificado = clientesIMPL.modificarCliente(id, cliente);

        assertNotNull(clienteModificado);
        assertEquals(cliente, clienteModificado);
        verify(clienteRepo, times(1)).existsById(id);
        verify(clienteRepo, times(1)).save(cliente);
    }

    @Test
    void eliminarCliente_ClienteExiste_EliminacionExitosa() {
        int id = 1;
        when(clienteRepo.existsById(id)).thenReturn(true);

        boolean eliminacionExitosa = clientesIMPL.eliminarCliente(id);

        assertTrue(eliminacionExitosa);
        verify(clienteRepo, times(1)).existsById(id);
        verify(clienteRepo, times(1)).deleteById(id);
    }

    @Test
    void validarCliente_ClienteValido_ClienteRetornado() {
        String correo = "correo@gmail.com";
        String contrasena = "contrasena";
        Cliente cliente = new Cliente();
        cliente.setCorreo(correo);
        cliente.setContrasena(contrasena);
        when(clienteRepo.findByCorreo(correo)).thenReturn(List.of(cliente));

        Cliente clienteValidado = clientesIMPL.validarCliente(correo, contrasena);

        assertNotNull(clienteValidado);
        assertEquals(cliente, clienteValidado);
        verify(clienteRepo, times(1)).findByCorreo(correo);
    }

    @Test
    void validarCliente_ClienteInvalido_NullRetornado() {
        String correo = "correo@gmail.com";
        String contrasena = "contrasena";
        when(clienteRepo.findByCorreo(correo)).thenReturn(List.of());

        Cliente clienteValidado = clientesIMPL.validarCliente(correo, contrasena);

        assertNull(clienteValidado);
        verify(clienteRepo, times(1)).findByCorreo(correo);
    }
}
