package co.tarjetaCredito.Servicios;

import co.tarjetaCredito.Entidades.Apro_Rech_Entidad;

public interface Apro_Rech_Servicios
{
    Apro_Rech_Entidad aprobarSolicitud(Long id);
    Apro_Rech_Entidad rechazarSolicitud(Long id);
    void notificarClienteAprobacion();
    void notificarClienteRechazo();
    void editarSolicitud(Apro_Rech_Entidad solicitud);
    void eliminarSolicitud(Long id);
}
