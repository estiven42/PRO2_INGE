
package co.tarjetacredito.repositorios;

import co.tarjetaCredito.entidades.Cliente;
import co.tarjetaCredito.repositorios.ClienteRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class ClienteRepoTest {

    @Autowired
    private ClienteRepo clienteRepo;

    @Test
    void findByCorreo() {

        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Juan Perez");
        cliente1.setTelefono(123456789);
        cliente1.setCorreo("juan.perez@gmail.com");
        cliente1.setContrasena("password1");
        cliente1.setDireccion("Direccion 1");
        clienteRepo.save(cliente1);

        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Maria Lopez");
        cliente2.setTelefono(987654321);
        cliente2.setCorreo("maria.lopez@gmail.com");
        cliente2.setContrasena("contraseña2");
        cliente2.setDireccion("calle 2");
        clienteRepo.save(cliente2);


        List<Cliente> result = clienteRepo.findByCorreo("juan.perez@gmail.com");


        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("Juan Perez", result.get(0).getNombre());
    }
}
