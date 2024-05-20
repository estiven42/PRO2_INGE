package co.tarjetaCredito.Servicios;

import co.tarjetaCredito.Entidades.ClientesEntidad;

public interface ClienteServicios {
    void guardarCliente(ClientesEntidad cliente);
    ClientesEntidad obtenerCliente(Long serial);
    ClientesEntidad modificarCliente(Long serial, ClientesEntidad cliente);
    boolean eliminarCliente(Long serial);
}
