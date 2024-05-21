package co.tarjetaCredito.Controladores;

import co.tarjetaCredito.Entidades.SolicitudEntidad;
import co.tarjetaCredito.Servicios.SolicitudServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/solicitudes")
public class SolicitudControlador {

    private final SolicitudServicios solicitudServicios;

    @Autowired
    public SolicitudControlador(SolicitudServicios solicitudServicios) {
        this.solicitudServicios = solicitudServicios;
    }

    @GetMapping("/nueva")
    public String mostrarFormularioNuevaSolicitud(Model model) {
        model.addAttribute("solicitud", new SolicitudEntidad());
        return "nueva_solicitud"; //
    }

    @PostMapping("/crear")
    public String crearSolicitud(SolicitudEntidad solicitud) {
        solicitudServicios.crearSolicitud(solicitud);
        return "redirect:/solicitudes/nueva";
    }

}
