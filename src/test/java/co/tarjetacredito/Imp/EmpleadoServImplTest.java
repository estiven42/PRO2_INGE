package co.tarjetacredito.Imp;

import co.tarjetaCredito.Imp.EmpleadoServImpl;
import co.tarjetaCredito.entidades.Empleado;
import co.tarjetaCredito.repositorios.EmpleadoRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class EmpleadoServImplTest {

    @Mock
    private EmpleadoRepo empleadoRepo;

    @InjectMocks
    private EmpleadoServImpl empleadoServImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void saveEmpleado_EmpleadoNoExiste_GuardadoExitoso() {
        Empleado empleado = new Empleado();
        empleado.setCorreo("correo@gmail.com");
        when(empleadoRepo.findByCorreo(empleado.getCorreo())).thenReturn(new ArrayList<>());

        boolean guardadoExitoso = empleadoServImpl.saveEmpleado(empleado);

        assertTrue(guardadoExitoso);
        verify(empleadoRepo, times(1)).findByCorreo(empleado.getCorreo());
        verify(empleadoRepo, times(1)).save(empleado);
    }


    @Test
    void obtenerEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado());
        empleados.add(new Empleado());
        when(empleadoRepo.findAll()).thenReturn(empleados);

        List<Empleado> empleadosObtenidos = empleadoServImpl.obtenerEmpleados();

        assertNotNull(empleadosObtenidos);
        assertEquals(empleados.size(), empleadosObtenidos.size());
        verify(empleadoRepo, times(1)).findAll();
    }

    @Test
    void validarEmpleado_EmpleadoValido_ValidacionExitosa() {
        String correo = "correo@gmail.com";
        String contrasena = "contrasena";
        Empleado empleado = new Empleado();
        empleado.setCorreo(correo);
        empleado.setContrasena(contrasena);
        when(empleadoRepo.findByCorreo(correo)).thenReturn(List.of(empleado));

        boolean validacionExitosa = empleadoServImpl.validarEmpleado(correo, contrasena);

        assertTrue(validacionExitosa);
        verify(empleadoRepo, times(1)).findByCorreo(correo);
    }



    @Test
    void buscarCorreo() {
        String correo = "correo@gmail.com";
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado());
        when(empleadoRepo.findByCorreo(correo)).thenReturn(empleados);

        List<Empleado> empleadosEncontrados = empleadoServImpl.buscarCorreo(correo);

        assertNotNull(empleadosEncontrados);
        assertEquals(empleados.size(), empleadosEncontrados.size());
        verify(empleadoRepo, times(1)).findByCorreo(correo);
    }

    @Test
    void exexistsByEmpleado_EmpleadoExistente_RetornoCorrecto() {
        String correo = "correo@gmail.com";
        Empleado empleado = new Empleado();
        empleado.setCorreo(correo);
        when(empleadoRepo.findByCorreo(correo)).thenReturn(List.of(empleado));

        Empleado empleadoExistente = empleadoServImpl.exexistsByEmpleado(correo);

        assertNotNull(empleadoExistente);
        assertEquals(empleado, empleadoExistente);
        verify(empleadoRepo, times(1)).findByCorreo(correo);
    }

    @Test
    void exexistsByEmpleado_EmpleadoNoExistente_RetornoNull() {
        String correo = "correo@gmail.com";
        when(empleadoRepo.findByCorreo(correo)).thenReturn(new ArrayList<>());

        Empleado empleadoExistente = empleadoServImpl.exexistsByEmpleado(correo);

        assertNull(empleadoExistente);
        verify(empleadoRepo, times(1)).findByCorreo(correo);
    }
}
