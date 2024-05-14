 package co.tarjetacredito.controladores;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;
import co.tarjetacredito.entidades.Empleado;
import co.tarjetacredito.repositorios.EmpleadoRepo;
import co.tarjetacredito.servicios.EmpleadoServ;



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
    
    @GetMapping("/validar")
    public String validarEmpleado() {
        return "index.html";
    }

    @PostMapping("/guardar/{nombre}/{correo}{contrasena}")
    public String postMethodName(@RequestBody String entity) {
        entity.getBytes();
        
        return entity;
    }

    @GetMapping("/listaEmpledo")
    public List<Empleado> getempleados(){
        return (List<Empleado>) this.empleadoRepo.findAll();
    }
    

}