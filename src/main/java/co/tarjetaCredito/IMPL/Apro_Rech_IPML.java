package co.tarjetaCredito.IMPL;

import co.tarjetaCredito.Entidades.Apro_Rech_Entidad;
import co.tarjetaCredito.Repositorio.Apro_Rech_Repositorio;
import co.tarjetaCredito.Servicios.Apro_Rech_Servicios;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Apro_Rech_IPML implements Apro_Rech_Servicios {
    private final Apro_Rech_Repositorio solicitudRepository;

    @Autowired
    public Apro_Rech_IPML(Apro_Rech_Repositorio solicitudRepository) {
        this.solicitudRepository = solicitudRepository;
    }

    public Apro_Rech_Entidad aprobarSolicitud(Long id) {
        Apro_Rech_Entidad solicitud = solicitudRepository.findById(id).orElseThrow(() -> new RuntimeException("Solicitud no encontrada"));
        solicitud.setEstado("Aprobada");
        notificarClienteAprobacion();
        return solicitudRepository.save(solicitud);
    }

    public Apro_Rech_Entidad rechazarSolicitud(Long id) {
        Apro_Rech_Entidad solicitud = solicitudRepository.findById(id).orElseThrow(() -> new RuntimeException("Solicitud no encontrada"));
        solicitud.setEstado("Rechazada");
        notificarClienteRechazo();
        return solicitudRepository.save(solicitud);
    }

    @Override
    public void notificarClienteAprobacion() {

    }

    @Override
    public void notificarClienteRechazo() {

    }

    @Override
    public void editarSolicitud(Apro_Rech_Entidad solicitud) {

    }

    @Override
    public void eliminarSolicitud(Long id) {

    }
}
