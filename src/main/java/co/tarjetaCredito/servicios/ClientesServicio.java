package co.tarjetaCredito.servicios;

import co.tarjetaCredito.entidades.Clientes;
import co.tarjetaCredito.repositorios.ClientesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClientesServicio
{
    @Autowired
    ClientesRepo ClienteRepo;

    public ArrayList<Clientes>getClientes()
    {
        return (ArrayList<Clientes>)ClientesRepo.finAll();
    }
}
