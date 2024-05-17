package co.tarjetaCredito.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tarjetaCredito.entidades.Cliente;
import co.tarjetaCredito.repositorios.ClienteRepo;
import co.tarjetaCredito.servicios.ClienteServ;

@Service
public class ClienteServImp implements ClienteServ{

    @Autowired
    private ClienteRepo clienteRepo;

    @Override
    public List<Cliente> obtenerClientes() {
        return (List<Cliente>) this.clienteRepo.findAll();
    }

    
}