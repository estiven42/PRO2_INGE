package co.tarjetaCredito.Servicios;

import co.tarjetaCredito.Entidades.AproRechEntidad; // Cambio de nombre de la entidad

public interface AproRechServicios { // Cambio de nombre de la interfaz
    AproRechEntidad aprobarSolicitud(Long id);
    AproRechEntidad rechazarSolicitud(Long id);
    void notificarClienteAprobacion();
    void notificarClienteRechazo();
    void editarSolicitud(AproRechEntidad solicitud);
    void eliminarSolicitud(Long id);
}
