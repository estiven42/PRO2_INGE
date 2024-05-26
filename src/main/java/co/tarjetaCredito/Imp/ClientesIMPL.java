package co.tarjetaCredito.Imp;

import co.tarjetaCredito.servicios.ClienteServicios;
import co.tarjetaCredito.entidades.Cliente;
import co.tarjetaCredito.repositorios.ClienteRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientesIMPL implements ClienteServicios {

    @Autowired
    private ClienteRepo clienteRepo;

    @Override
    public void guardarCliente(Cliente cliente) {
        clienteRepo.save(cliente);
    }

    @Override
    public Cliente obtenerCliente(Integer id) {
        Optional<Cliente> clienteOpt = clienteRepo.findById(id);
        return clienteOpt.orElse(null);
    }

    @Override
    public Cliente modificarCliente(Integer serial, Cliente cliente) {
        if (clienteRepo.existsById(serial)) {
            return clienteRepo.save(cliente);
        }
        return null;
    }

    @Override
    public boolean eliminarCliente(Integer serial) {
        if (clienteRepo.existsById(serial)) {
            clienteRepo.deleteById(serial);
            return true;
        }
        return false;
    }
}
