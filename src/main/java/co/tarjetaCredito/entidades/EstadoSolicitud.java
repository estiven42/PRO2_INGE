package co.tarjetaCredito.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "estado_solicitud")
public class EstadoSolicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_estado_solicitud")
    @SequenceGenerator(name = "SEQ_estado_solicitud", sequenceName = "SEQ_estado_solicitud", allocationSize = 1)
    @Column(name = "EST_CODIGO")
    private long serial;

    @Column(name = "EST_DESCRIPCION")
    private String descripcion;
}
