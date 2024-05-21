package co.tarjetaCredito.Controladores;

import co.tarjetaCredito.Entidades.PagosPSE_Entidad;
import co.tarjetaCredito.Servicios.PagosPSEServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pse")
public class PSEControlador {
    private final PagosPSEServicios pagosPSEServicios;

    @Autowired
    public PSEControlador(PagosPSEServicios pagosPSEServicios) {
        this.pagosPSEServicios = pagosPSEServicios;
    }

    @PostMapping("/realizar-pago")
    public String realizarPago(@RequestBody PagosPSE_Entidad pago) {
        // Lógica para procesar el pago y guardarlo en la base de datos
        pagosPSEServicios.guardarPago(pago);
        return "Pago realizado exitosamente";
    }

    // Otros métodos para validar pagos, consultar historial, etc.
    // ...

    // Puedes agregar más rutas y lógica según tus necesidades
}
