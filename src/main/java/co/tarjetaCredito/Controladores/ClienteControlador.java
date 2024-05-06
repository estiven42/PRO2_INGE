package co.tarjetaCredito.Controladores;

import co.tarjetaCredito.Entidades.ClientesEntidad;
import co.tarjetaCredito.Servicios.ClienteServicios;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/clientes")
public class ClienteControlador {
    private final ClienteServicios servicioCliente;

    @PostMapping
    public ResponseEntity guardarCliente(@RequestBody ClientesEntidad cliente) {
        return new ResponseEntity(servicioCliente.gurdarCliente(cliente), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity obtenerCliente(@PathVariable("id") ClientesEntidad idCliente) {
        return new ResponseEntity(servicioCliente.gurdarCliente(idCliente), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity modificarCliente(@PathVariable("id") Long idCliente, @RequestBody ClientesEntidad cliente) {
        return new ResponseEntity(servicioCliente.modificarCliente(idCliente, cliente), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminarCliente(@PathVariable("id") Long idCliente) {
        boolean respuesta = servicioCliente.eliminarCliente(idCliente);
        if (respuesta == true) {
            return new ResponseEntity(HttpStatus.OK);
        } else
        {
            return new ResponseEntity(HttpStatus.OK);
        }
}

}
