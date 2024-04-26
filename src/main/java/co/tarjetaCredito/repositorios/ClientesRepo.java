package co.tarjetaCredito.repositorios;

import co.tarjetaCredito.entidades.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepo extends JpaRepository<Clientes,Long>
{

    static Object finAll() {
        return getObject();
    }

    private static Object getObject() {
        return null;
    }
}
