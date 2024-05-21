package co.tarjetaCredito.IMPL;

import co.tarjetaCredito.Entidades.TarjetaCreditos;
import co.tarjetaCredito.Repositorio.TarjetaCreditosRepositorio;
import co.tarjetaCredito.Servicios.TarjetaCreditosServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class TarjetaCreditosServiciosImpl implements TarjetaCreditosServicios {
    private final TarjetaCreditosRepositorio tarjetaCreditosRepositorio;

    @Autowired
    public TarjetaCreditosServiciosImpl(TarjetaCreditosRepositorio tarjetaCreditosRepositorio) {
        this.tarjetaCreditosRepositorio = tarjetaCreditosRepositorio;
    }

    @Override
    public TarjetaCreditos generarDatosTarjetaAprobada(int idCliente, double salarioCliente, boolean esClienteSinRiesgo) {
        TarjetaCreditos tarjeta = new TarjetaCreditos();
        tarjeta.setFkidCliente(idCliente);
        tarjeta.setNumeroTarjeta(generarNumeroTarjeta());
        tarjeta.setSaldoActual(0.0);
        tarjeta.setEstado("Aprobada");
        tarjeta.setLimiteCredito(calcularLimiteCredito(salarioCliente, esClienteSinRiesgo));
        return tarjetaCreditosRepositorio.save(tarjeta);
    }

    private String generarNumeroTarjeta() {
        Random random = new Random();
        return "45" + String.format("%014d", random.nextInt(1_000_000_000));
    }

    private double calcularLimiteCredito(double salarioCliente, boolean esClienteSinRiesgo) {
        if (esClienteSinRiesgo) {
            return salarioCliente * 1.5;
        } else {
            return salarioCliente * 0.5;
        }
    }

    public void editarSolicitud(TarjetaCreditos tarjeta) {
    }

    public void eliminarSolicitud(long idTarjeta) {
    }
}


