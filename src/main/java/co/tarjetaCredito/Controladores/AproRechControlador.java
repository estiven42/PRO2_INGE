package co.tarjetaCredito.Controladores;

import co.tarjetaCredito.Servicios.AproRechServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AproRechControlador {

    private final AproRechServicios aproRechServicios;

    @Autowired
    public AproRechControlador(AproRechServicios aproRechServicios) {
        this.aproRechServicios = aproRechServicios;
    }

    @GetMapping("/aprobar/{id}")
    public String aprobarSolicitud(@PathVariable Long id) {
        aproRechServicios.aprobarSolicitud(id);
        return "redirect:/solicitudes";
    }

    @GetMapping("/rechazar/{id}")
    public String rechazarSolicitud(@PathVariable Long id) {
        aproRechServicios.rechazarSolicitud(id);
        return "redirect:/solicitudes";
    }
}
