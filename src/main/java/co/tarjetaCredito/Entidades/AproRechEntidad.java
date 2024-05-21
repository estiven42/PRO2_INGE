package co.tarjetaCredito.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Table(name = "Solicitud_Tarjeta_Credito")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AproRechEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_solicitud")
    private Long idSolicitud;

    @Column(nullable = false, name = "estado")
    private String estado;

    @Column(nullable = false, name = "fecha_creacion")
    private LocalDate fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private ClientesEntidad cliente;

}