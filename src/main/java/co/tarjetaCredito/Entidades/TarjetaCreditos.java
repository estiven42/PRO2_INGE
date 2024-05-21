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

    @Column(name = "numeroTarjeta", nullable = false)
    private String numeroTarjeta;

    @Column(name = "limiteCredito", nullable = false)
    private double limiteCredito;

    @Column(name = "saldoActual", nullable = false)
    private double saldoActual;

    @Column(name = "fkidCliente", nullable = false)
    private int fkidCliente;

    @Column(name = "estado", nullable = false)
    private String estado;
}
