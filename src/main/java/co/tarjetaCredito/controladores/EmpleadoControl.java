 package co.tarjetaCredito.controladores;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.transaction.annotation.Transactional;

import co.tarjetaCredito.entidades.Empleado;
import co.tarjetaCredito.repositorios.EmpleadoRepo;
import co.tarjetaCredito.servicios.EmpleadoServ;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
 public class EmpleadoControl {

    @Autowired
    private EmpleadoServ empleadoServ;
    @Autowired
    private EmpleadoRepo empleadoRepo;

    @PostMapping({ "/registrar" })
	public ResponseEntity<?> guardarEmpleado(@RequestBody Empleado emp) {

        this.empleadoServ.saveEmpleado(emp);
        

        return ResponseEntity.badRequest().body("Guardado");
    }

    @GetMapping("/validar/empleado")
    public String getMethodName(Model modelo, Empleado emp) {
        return new String();
    }

    @GetMapping("/listadoEmpleados")
    public String getMethodName(@RequestParam String param) {
        return "ok";
    }
    
    

}