package co.tarjetaCredito.IMPL;

import co.tarjetaCredito.Entidades.AproRechEntidad;
import co.tarjetaCredito.Repositorio.AproRechRepositorio;
import co.tarjetaCredito.Servicios.AproRechServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AproRechIPML implements AproRechServicios {
    private final AproRechRepositorio solicitudRepository;

    @Autowired
    public AproRechIPML(AproRechRepositorio solicitudRepository) {
        this.solicitudRepository = solicitudRepository;
    }

    @Override
    public AproRechEntidad aprobarSolicitud(Long id) {
        AproRechEntidad solicitud = solicitudRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Solicitud no encontrada"));
        solicitud.setEstado("Aprobada");
        notificarClienteAprobacion();
        return solicitudRepository.save(solicitud);
    }

    @Override
    public AproRechEntidad rechazarSolicitud(Long id) {
        AproRechEntidad solicitud = solicitudRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Solicitud no encontrada"));
        solicitud.setEstado("Rechazada");
        notificarClienteRechazo();
        return solicitudRepository.save(solicitud);
    }

    @Override
    public void notificarClienteAprobacion() {
        System.out.println("Notificación: Su solicitud ha sido aprobada. ¡Felicidades!");
    }


    @Override
    public void notificarClienteRechazo() {
        System.out.println("Notificación: Lamentamos informarle que su solicitud ha sido rechazada.");
    }


    @Override
    public void editarSolicitud(AproRechEntidad solicitud) {
        solicitudRepository.save(solicitud);
    }

    @Override
    public void eliminarSolicitud(Long id) {
        solicitudRepository.deleteById(id);
    }

}