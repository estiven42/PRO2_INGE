package co.tarjetaCredito.Servicios;

import co.tarjetaCredito.Entidades.SolicitudEntidad;

public interface SolicitudServicios {
    void crearSolicitud(SolicitudEntidad solicitud);
    SolicitudEntidad obtenerSolicitudPorCodigo(long codigo);
    void actualizarSolicitud(SolicitudEntidad solicitud);
    void eliminarSolicitudPorCodigo(long codigo);
}
