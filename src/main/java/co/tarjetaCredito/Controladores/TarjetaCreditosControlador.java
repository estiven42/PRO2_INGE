package co.tarjetaCredito.Controladores;

import co.tarjetaCredito.Entidades.TarjetaCreditos;
import co.tarjetaCredito.Servicios.TarjetaCreditosServiciosImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/tarjetas")
public class TarjetaCreditosControlador {
    private final TarjetaCreditosServiciosImpl servicioTarjeta;

    @PostMapping
    public ResponseEntity guardarTarjeta(@RequestBody TarjetaCreditos tarjeta) {
        return new ResponseEntity(servicioTarjeta.generarDatosTarjetaAprobada(tarjeta.getFkidCliente(), tarjeta.getLimiteCredito(), true), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity obtenerTarjeta(@PathVariable("id") int idTarjeta) {
        return new ResponseEntity(servicioTarjeta.generarDatosTarjetaAprobada(idTarjeta, 0, true), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity modificarTarjeta(@PathVariable("id") int idTarjeta, @RequestBody TarjetaCreditos tarjeta) {
        servicioTarjeta.editarSolicitud(tarjeta);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminarTarjeta(@PathVariable("id") int idTarjeta) {
        servicioTarjeta.eliminarSolicitud((long) idTarjeta);
        return new ResponseEntity(HttpStatus.OK);
    }
}
