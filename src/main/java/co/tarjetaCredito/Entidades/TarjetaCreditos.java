package co.tarjetaCredito.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="TarjetaCreditos")
public class TarjetaCreditos
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTarjeta;

    @Column(nullable = false)
    private String numeroTarjeta;

    @Column(nullable = false)
    private double limiteCredito;

    @Column(nullable = false)
    private double saldoActual;

    @Column(nullable = false)
    private int fkidCliente;

    @Column(nullable = false)
    private String estado;

    public void asignarLimiteCredito(double limite) {
        this.limiteCredito = limite;
    }

    public void activar() {
        this.estado = "Activa";
    }

    public void desactivar() {
        this.estado = "Inactiva";
    }
}
