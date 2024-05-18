package co.tarjetaCredito.controladores;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import co.tarjetaCredito.entidades.Cliente;
import co.tarjetaCredito.repositorios.ClienteRepo;
import co.tarjetaCredito.servicios.ClienteServ;

import org.springframework.ui.Model;

@Controller
public class ClienteControl {

    @Autowired
    private ClienteServ clienteServ;

    @GetMapping("/validarEmpleado")
    public String validarEmpleado() {
        return "/cliente";
    }
    
}
