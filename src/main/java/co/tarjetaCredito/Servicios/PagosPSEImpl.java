package co.tarjetaCredito.Servicios;


import co.tarjetaCredito.Entidades.PagosPSEEntidad;
import co.tarjetaCredito.Repositorio.PagosPSERepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PagosPSEImpl implements PagosPSEServicios {
    private final PagosPSERepositorio repositorioPagosPSE;

    @Override
    public PagosPSEEntidad guardarPago(PagosPSEEntidad pago) {
        return repositorioPagosPSE.save(pago);
    }

    @Override
    public boolean validarPagosPSE(PagosPSEEntidad pago)
    {
        return true;
    }
}