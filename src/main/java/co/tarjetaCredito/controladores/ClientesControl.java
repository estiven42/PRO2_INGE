package co.tarjetaCredito.controladores;

import co.tarjetaCredito.entidades.Clientes;
import co.tarjetaCredito.servicios.ClientesServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/Clientes")
public class ClientesControl
{

    @Autowired
    private ClientesServicio ClientesServicio;

    @GetMapping
    public ArrayList<Clientes>getClientes()
    {
        return this.ClientesServicio.getClientes();
    }
}
