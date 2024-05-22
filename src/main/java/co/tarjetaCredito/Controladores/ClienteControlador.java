package co.tarjetaCredito.controladores;

import co.tarjetaCredito.Entidades.ClientesEntidad;
import co.tarjetaCredito.Servicios.ClienteServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clientes")
public class ClienteControlador {

    @Autowired
    private ClienteServicios clienteServicios;

    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        return "registroCliente";
    }

    @GetMapping("/validarCliente")
    public String validarEmpleado() {
        return "/cliente";
    }

    @PostMapping("/guardar")
    public String guardarCliente(@ModelAttribute("cliente") ClientesEntidad cliente) {
        clienteServicios.guardarCliente(cliente);
        return "redirect:/clientes/registro";
    }



    @PutMapping("/{serial}")
    public String modificarCliente(@PathVariable Long serial, @ModelAttribute("cliente") ClientesEntidad cliente) {
        clienteServicios.modificarCliente(serial, cliente);
        return "redirect:/clientes/registro";
    }

    @DeleteMapping("/{serial}")
    public String eliminarCliente(@PathVariable Long serial) {
        clienteServicios.eliminarCliente(serial);
        return "redirect:/clientes/registro";
    }

}
