package co.tarjetaCredito.Implementacion;

import co.tarjetaCredito.Entidades.ClientesEntidad;
import co.tarjetaCredito.Repositorio.ClientesRepositorio;
import co.tarjetaCredito.Servicios.ClienteServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesIMPL implements ClienteServicios {

    @Autowired
    private ClientesRepositorio clientesRepositorio;

    @Override
    public void guardarCliente(ClientesEntidad cliente) {
        clientesRepositorio.save(cliente);
    }

    @Override
    public ClientesEntidad obtenerCliente(Long serial) {
        return clientesRepositorio.findById(serial).orElse(null);
    }

    @Override
    public ClientesEntidad modificarCliente(Long serial, ClientesEntidad cliente) {
        if (clientesRepositorio.existsById(serial)) {
            cliente.setSerial(serial);
            return clientesRepositorio.save(cliente);
        }
        return null;
    }

    @Override
    public boolean eliminarCliente(Long serial) {
        if (clientesRepositorio.existsById(serial)) {
            clientesRepositorio.deleteById(serial);
            return true;
        }
        return false;
    }
}
