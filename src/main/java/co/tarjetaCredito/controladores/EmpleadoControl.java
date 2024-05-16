 package co.tarjetaCredito.controladores;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import co.tarjetaCredito.entidades.Empleado;
import co.tarjetaCredito.repositorios.EmpleadoRepo;
import co.tarjetaCredito.servicios.EmpleadoServ;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import lombok.val;



@Controller
 public class EmpleadoControl {

    @Autowired
    private EmpleadoServ empleadoServ;
    @Autowired
    private EmpleadoRepo empleadoRepo;

    @PostMapping("/registro")
    public String registrarEmpleado(
            @RequestParam("nombre") String nombre,
            @RequestParam("email") String email,
            @RequestParam("password") String password) {
        
        Empleado emp = new Empleado();

        emp.setNombre(nombre);
        emp.setCorreo(email);
        emp.setContrasena(password);
        this.empleadoServ.saveEmpleado(emp);
        return "/index";
    }

    @PostMapping("/validar/empleado")
    public String validarEmpleado(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {
        boolean validador = this.empleadoServ.validarEmpleado(email, password);
        if (validador) {
            return "/inicio";
        } else {
            model.addAttribute("error", "Usuario o contraseña incorrectos");
            return "/index";
        }
    }
    @GetMapping("/registroEmpleadocontrol")
    public String getMethodName() {
        return "/registroEmpleado";
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