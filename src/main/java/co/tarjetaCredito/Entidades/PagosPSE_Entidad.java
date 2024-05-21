package co.tarjetaCredito.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "PagosPSE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagosPSE_Entidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPago;

    @Column(name = "fechaPago", nullable = false)
    private LocalDate fechaPago;

    @Column(name = "monto", nullable = false)
    private double monto;

    @Column(name = "numeroTarjeta", nullable = false)
    private String numeroTarjeta;

    @Column(name = "fkidtarjetacredito", nullable = false)
    private int fkidtarjetacredito;
}
