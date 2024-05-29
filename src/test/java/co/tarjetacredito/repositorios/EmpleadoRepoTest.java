
package co.tarjetaCredito.repositorios;

import co.tarjetaCredito.entidades.Empleado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class EmpleadoRepoTest {

    @Autowired
    private EmpleadoRepo empleadoRepo;

    @Test
    void findByCorreo() {

        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Carlos Sanchez");
        empleado1.setCorreo("carlos.sanchez@gmail.com");
        empleado1.setContrasena("password1");
        empleadoRepo.save(empleado1);

        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Ana Martinez");
        empleado2.setCorreo("ana.martinez@gmail.com");
        empleado2.setContrasena("password2");
        empleadoRepo.save(empleado2);


        List<Empleado> result = empleadoRepo.findByCorreo("carlos.sanchez@gmail.com");


        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("Carlos Sanchez", result.get(0).getNombre());
    }

    @Test
    void testFindByCorreoWithNoResult() {

        List<Empleado> result = empleadoRepo.findByCorreo("not.existing@gmail.com");


        assertNotNull(result);
        assertTrue(result.isEmpty());
    }
}
