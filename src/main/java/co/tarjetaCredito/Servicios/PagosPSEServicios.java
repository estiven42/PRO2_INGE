package co.tarjetaCredito.Servicios;

import co.tarjetaCredito.Entidades.PagosPSE_Entidad;

public interface PagosPSEServicios {
    PagosPSE_Entidad guardarPago(PagosPSE_Entidad pago);

    boolean validarPagosPSE(PagosPSE_Entidad pago);
}
