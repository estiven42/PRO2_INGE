 package co.tarjetaCredito.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.transaction.annotation.Transactional;

import co.tarjetaCredito.entidades.Empleado;
import co.tarjetaCredito.servicios.EmpleadoServ;

@RestController
@Transactional
@RequestMapping({ "/empleado" })
 public class EmpleadoControl {

    @Autowired
    private EmpleadoServ empleadoServ;

    @PostMapping({ "/registrar" })
	public ResponseEntity<?> guardarEmpleado(@RequestBody Empleado emp) {

        this.empleadoServ.saveEmpleado(emp);
        

        return ResponseEntity.badRequest().body("Guardado");
    }

}