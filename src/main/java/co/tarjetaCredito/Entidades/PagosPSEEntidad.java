package co.tarjetaCredito.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name="PagosPSE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagosPSEEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPago;
    @Column(nullable = false)
    private LocalDate fechaPago;
    @Column(nullable = false)
    private double monto;
    @Column(nullable = false)
    private String numeroTarjeta;
    @Column(nullable = false)
    private int fkidtarjetacredito;
}