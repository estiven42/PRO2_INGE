package co.tarjetaCredito.Controladores;

import co.tarjetaCredito.Entidades.Apro_Rech_Entidad;
import co.tarjetaCredito.Servicios.Apro_Rech_Servicios;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/apro_rech")
public class Apro_Rech_Controlador
{
    private final Apro_Rech_Servicios servicioAproRech;

    @PostMapping
    public ResponseEntity guardarSolicitud(@RequestBody Apro_Rech_Entidad solicitud) {
        return new ResponseEntity(servicioAproRech.aprobarSolicitud(solicitud.getIdSolicitud()), HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity obtenerSolicitud(@PathVariable("id") Long idSolicitud) {
        return new ResponseEntity(servicioAproRech.aprobarSolicitud(idSolicitud), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity modificarSolicitud(@PathVariable("id") Long idSolicitud, @RequestBody Apro_Rech_Entidad solicitud) {
        servicioAproRech.editarSolicitud(solicitud);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminarSolicitud(@PathVariable("id") Long idSolicitud) {
        servicioAproRech.eliminarSolicitud(idSolicitud);
        return new ResponseEntity(HttpStatus.OK);
    }
}
