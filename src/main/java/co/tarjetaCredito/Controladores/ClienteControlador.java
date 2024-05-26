package co.tarjetaCredito.Controladores;

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
        model.addAttribute("cliente", new ClientesEntidad());
        return "registroCliente"; // Devuelve la vista para el formulario de registro
    }

    @PostMapping("/guardar")
    public String guardarCliente(@ModelAttribute("cliente") ClientesEntidad cliente) {
        clienteServicios.guardarCliente(cliente);
        return "redirect:/clientes/registro"; // Redirige al formulario de registro después de guardar
    }
}
