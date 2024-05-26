package co.tarjetaCredito.servicios;

import java.util.List;

import co.tarjetaCredito.entidades.SolicitudTarjetaCredito;

public interface SolicitudTarjetaCreditoServ {

    List<SolicitudTarjetaCredito> listadoSolicitudes();

    SolicitudTarjetaCredito obtenSolicitudTarjetaCredito(Integer id);
}
