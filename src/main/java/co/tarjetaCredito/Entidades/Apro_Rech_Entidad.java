package co.tarjetaCredito.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="Estado")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apro_Rech_Entidad
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSolicitud;

    @Column(nullable = false)
    private String estado; // Aprobada, Rechazada, Pendiente, etc.

    @Column(nullable = false)
    private LocalDate fechaCreacion;

    @ManyToOne
    private ClientesEntidad cliente;

    //@ManyToOne
    //private Empleado empleado;

}
