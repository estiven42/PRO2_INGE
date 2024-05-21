package co.tarjetaCredito.Controladores;

import co.tarjetaCredito.Entidades.TarjetaCreditos;
import co.tarjetaCredito.IMPL.TarjetaCreditosServiciosImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tarjetas")
public class TarjetaCreditosControlador {
    private final TarjetaCreditosServiciosImpl servicioTarjeta;

    @Autowired
    public TarjetaCreditosControlador(TarjetaCreditosServiciosImpl servicioTarjeta) {
        this.servicioTarjeta = servicioTarjeta;
    }

    @GetMapping("/dataCredito")
    public String datosTarjetaCredito(Model model) {
        TarjetaCreditos tarjetaGenerada = servicioTarjeta.generarDatosTarjetaAprobada(1, 5000.0, true);
        model.addAttribute("tarjetaGenerada", tarjetaGenerada);
        return "dataCredito";
    }

    @PostMapping("/guardar")
    public String guardarTarjeta(@ModelAttribute TarjetaCreditos tarjeta) {
        servicioTarjeta.generarDatosTarjetaAprobada(tarjeta.getFkidCliente(), tarjeta.getLimiteCredito(), true);
        return "redirect:/tarjetas/dataCredito";
    }


}
