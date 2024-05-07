package co.tarjetaCredito.Servicios;
import co.tarjetaCredito.Entidades.PagosPSEEntidad;

public interface PagosPSEServicios {
    PagosPSEEntidad guardarPago(PagosPSEEntidad pago);
    boolean validarPagosPSE(PagosPSEEntidad pago);

}
