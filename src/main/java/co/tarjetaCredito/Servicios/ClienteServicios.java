package co.tarjetaCredito.Servicios;

import co.tarjetaCredito.Entidades.ClientesEntidad;

public interface ClienteServicios
{
    ClientesEntidad gurdarCliente(ClientesEntidad cliente);
    ClientesEntidad obtenerUsuario(Long idCliente);
    ClientesEntidad modificarCliente(Long idCliente, ClientesEntidad cliente);
    boolean eliminarCliente(long idCliente);
}
