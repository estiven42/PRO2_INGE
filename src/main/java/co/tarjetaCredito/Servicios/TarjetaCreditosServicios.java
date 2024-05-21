package co.tarjetaCredito.Servicios;

import co.tarjetaCredito.Entidades.TarjetaCreditos;

public interface TarjetaCreditosServicios {
    TarjetaCreditos generarDatosTarjetaAprobada(int idCliente, double salarioCliente, boolean esClienteSinRiesgo);

    void editarSolicitud(TarjetaCreditos tarjeta);

    void eliminarSolicitud(long idTarjeta);
}
