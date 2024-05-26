package co.tarjetaCredito.servicios;

import co.tarjetaCredito.entidades.Cliente;

public interface ClienteServicios {
    void guardarCliente(Cliente cliente);
    Cliente obtenerCliente(Integer serial);
    Cliente modificarCliente(Integer serial, Cliente cliente);
    boolean eliminarCliente(Integer serial);
}
