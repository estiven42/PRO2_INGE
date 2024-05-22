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
        return "registroCliente";
    }

    @PostMapping("/guardar")
    public String guardarCliente(@ModelAttribute("cliente") ClientesEntidad cliente) {
        clienteServicios.guardarCliente(cliente);
        return "redirect:/clientes/registro";
    }

    @GetMapping("/{serial}")
    public String obtenerCliente(@PathVariable Long serial, Model model) {
        ClientesEntidad cliente = clienteServicios.obtenerCliente(serial);
        if (cliente == null) {
            throw new ClienteNoEncontradoException("Cliente no encontrado con el serial: " + serial);
        }
        model.addAttribute("cliente", cliente);
        return "mostrarCliente";
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
    @ExceptionHandler(ClienteNoEncontradoException.class)
    public String handleClienteNoEncontradoException(ClienteNoEncontradoException ex) {
        // Aquí puedes personalizar la página de error o redirigir a otra página de error
        return "errorClienteNoEncontrado";
    }
}
