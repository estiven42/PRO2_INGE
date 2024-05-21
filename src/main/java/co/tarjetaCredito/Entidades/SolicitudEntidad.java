package co.tarjetaCredito.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Solicitud")
public class SolicitudEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SOLICITUD")
    @SequenceGenerator(name = "SEQ_SOLICITUD", sequenceName = "SEQ_SOLICITUD", allocationSize = 1)
    @Column(name = "SOL_CODIGO")
    private long codigo;

    @Column(name = "SOL_numero")
    private String numero;

    @Column(name = "SOL_fecha")
    private LocalDate fecha;

    @Column(name = "SOL_estado")
    private String estado;

}
