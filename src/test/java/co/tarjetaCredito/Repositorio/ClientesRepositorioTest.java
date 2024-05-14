package co.tarjetaCredito.Repositorio;

import co.tarjetaCredito.Entidades.ClientesEntidad;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ClientesRepositorioTest {
    @Autowired
    ClientesRepositorio clientesRepositorio;
    @Autowired
    TestEntityManager testEntityManager;

    @BeforeEach
    void setUp() {
        ClientesEntidad clientesEntidad = ClientesEntidad.builder()
                .idCliente(1L)
                .nombre("pepe")
                .telefono("3232323")
                .correo("pepe@gmial.com")
                .direccion("carrea 99")
                .historial_Bancario("si tengo")
                .certificados("tengo todos")
                .build();
        testEntityManager.persist(clientesEntidad);
    }

    @Test
    public void cuandoBuscoPorId_entidadEsEncontrada() {
        Optional<ClientesEntidad> cliente = clientesRepositorio.findById(1L);
        assertTrue(cliente.isPresent());
        assertEquals("pepe", cliente.get().getNombre());
    }
}
