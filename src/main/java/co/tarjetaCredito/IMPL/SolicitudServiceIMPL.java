package co.tarjetaCredito.IMPL;

import co.tarjetaCredito.Entidades.SolicitudEntidad;
import co.tarjetaCredito.Repositorio.SolicitudRepositorio;
import co.tarjetaCredito.Servicios.SolicitudServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolicitudServiceIMPL implements SolicitudServicios {

    private final SolicitudRepositorio solicitudRepositorio;

    @Autowired
    public SolicitudServiceIMPL(SolicitudRepositorio solicitudRepositorio) {
        this.solicitudRepositorio = solicitudRepositorio;
    }

    @Override
    public void crearSolicitud(SolicitudEntidad solicitud) {
        solicitudRepositorio.save(solicitud);
    }

    @Override
    public SolicitudEntidad obtenerSolicitudPorCodigo(long codigo) {
        return solicitudRepositorio.findById(codigo).orElse(null);
    }

    @Override
    public void actualizarSolicitud(SolicitudEntidad solicitud) {
        solicitudRepositorio.save(solicitud);
    }

    @Override
    public void eliminarSolicitudPorCodigo(long codigo) {
        solicitudRepositorio.deleteById(codigo);
    }

}
