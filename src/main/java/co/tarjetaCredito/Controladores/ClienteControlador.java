package co.tarjetaCredito.Controladores;

import co.tarjetaCredito.Entidades.ClientesEntidad;
import co.tarjetaCredito.Servicios.ClienteServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClienteControlador {

    @Autowired
    private ClienteServicios clienteServicios;

    @RequestMapping("/registroCliente")
    @GetMapping("/registroCliente")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("cliente", new ClientesEntidad());
        return "registroCliente"; // Devuelve la vista para el formulario de registro
    }


    @PostMapping("/confirmacionRegistro")
    public String guardarCliente(@ModelAttribute("cliente") ClientesEntidad cliente) {
        clienteServicios.guardarCliente(cliente);
        // Redirige al usuario a la página de confirmación
        return "redirect:/confirmacionRegistro"; // Cambia "/confirmaciones" por "/confirmacionRegistro"
    }

}
