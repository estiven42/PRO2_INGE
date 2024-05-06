package co.tarjetaCredito.Servicios;

import co.tarjetaCredito.Entidades.ClientesEntidad;
import co.tarjetaCredito.Repositorio.ClientesRepositorio;
import co.tarjetaCredito.Servicios.ClienteServicios;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientesIPML implements ClienteServicios
{
    private final ClientesRepositorio repositoriocliente;


    @Override
    public ClientesEntidad gurdarCliente(ClientesEntidad cliente) {
        return repositoriocliente.save(cliente);
    }

    @Override
    public ClientesEntidad obtenerUsuario(Long idCliente) {
        return repositoriocliente.findById(idCliente).orElseThrow(()-> {throw new RuntimeException();});
    }

    @Override
    public ClientesEntidad modificarCliente(Long idCliente, ClientesEntidad clientemodificar) {
        ClientesEntidad clienteBuscado=repositoriocliente.findById(idCliente).get();
        clienteBuscado.setIdCliente(clientemodificar.getIdCliente());
        clienteBuscado.setNombre(clientemodificar.getNombre());
        clienteBuscado.setDireccion(clientemodificar.getDireccion());
        clienteBuscado.setTelefono(clientemodificar.getTelefono());
        clienteBuscado.setCorreo(clientemodificar.getCorreo());
        clienteBuscado.setCertificados(clientemodificar.getCertificados());
        clienteBuscado.setHistorial_Bancario(clientemodificar.getHistorial_Bancario());
        return repositoriocliente.save(clienteBuscado);
    }

    @Override
    public boolean eliminarCliente(long idCliente) {
        try {
            repositoriocliente.deleteById(idCliente);
            return true;
        }catch (Exception e)
        {
            return false;
        }
    }
}
