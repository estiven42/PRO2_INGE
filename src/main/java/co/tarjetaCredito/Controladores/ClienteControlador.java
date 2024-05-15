package co.tarjetaCredito.Controladores;

import co.tarjetaCredito.Entidades.ClientesEntidad;
import co.tarjetaCredito.Servicios.ClienteServicios;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
@RequestMapping("/clientes")
public class ClienteControlador {
    private final ClienteServicios servicioCliente;

    @PostMapping
    public ResponseEntity guardarCliente(@ModelAttribute ClientesEntidad cliente) {
        return new ResponseEntity(servicioCliente.gurdarCliente(cliente), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity obtenerCliente(@PathVariable("id") Long idCliente) {
        return new ResponseEntity(servicioCliente.obtenerUsuario(idCliente), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity modificarCliente(@PathVariable("id") Long idCliente, @ModelAttribute ClientesEntidad cliente) {
        return new ResponseEntity(servicioCliente.modificarCliente(idCliente, cliente), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminarCliente(@PathVariable("id") Long idCliente) {
        boolean respuesta = servicioCliente.eliminarCliente(idCliente);
        if (respuesta == true) {
            return new ResponseEntity(HttpStatus.OK);
        } else
        {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/validar")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
