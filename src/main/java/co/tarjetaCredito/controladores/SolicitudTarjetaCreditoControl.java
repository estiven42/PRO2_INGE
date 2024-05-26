package co.tarjetaCredito.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import co.tarjetaCredito.servicios.SolicitudTarjetaCreditoServ;

@Controller
public class SolicitudTarjetaCreditoControl {
    
    @Autowired
    private SolicitudTarjetaCreditoServ solicitudesServ;

    @GetMapping("/detalles/{id}")
    public String verDetallesSolicitud(@PathVariable("id") Integer id, Model model) {
        System.out.println(solicitudesServ.obtenSolicitudTarjetaCredito(id));
        model.addAttribute("solicitudes", solicitudesServ.obtenSolicitudTarjetaCredito(id));
        return "/detalles_solicitud";
    }
}
