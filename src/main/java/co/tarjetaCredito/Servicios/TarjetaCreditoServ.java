package co.tarjetaCredito.servicios;

import org.hibernate.mapping.List;

import co.tarjetaCredito.entidades.TarjetaCredito;

public interface TarjetaCreditoServ {

    TarjetaCredito guardarTarjeta(TarjetaCredito tarjeta);
    TarjetaCredito obtenerTarjeta(Integer id);
}
