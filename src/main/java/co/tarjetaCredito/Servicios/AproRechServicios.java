package co.tarjetaCredito.Servicios;

import co.tarjetaCredito.Entidades.AproRechEntidad;

public interface AproRechServicios {
    AproRechEntidad aprobarSolicitud(Long id);
    AproRechEntidad rechazarSolicitud(Long id);
    void notificarClienteAprobacion();
    void notificarClienteRechazo();
    void editarSolicitud(AproRechEntidad solicitud);
    void eliminarSolicitud(Long id);
}
