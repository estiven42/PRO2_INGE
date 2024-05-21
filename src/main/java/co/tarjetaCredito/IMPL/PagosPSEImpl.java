package co.tarjetaCredito.IMPL;

import co.tarjetaCredito.Entidades.PagosPSE_Entidad;
import co.tarjetaCredito.Repositorio.PagosPSERepositorio;
import co.tarjetaCredito.Servicios.PagosPSEServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagosPSEImpl implements PagosPSEServicios {
    private final PagosPSERepositorio repositorioPagosPSE;

    @Autowired
    public PagosPSEImpl(PagosPSERepositorio repositorioPagosPSE) {
        this.repositorioPagosPSE = repositorioPagosPSE;
    }

    @Override
    public PagosPSE_Entidad guardarPago(PagosPSE_Entidad pago) {
        return repositorioPagosPSE.save(pago);
    }

    @Override
    public boolean validarPagosPSE(PagosPSE_Entidad pago) {
        return true;
    }
}
