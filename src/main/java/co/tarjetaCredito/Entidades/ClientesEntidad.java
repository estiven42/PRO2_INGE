package co.tarjetaCredito.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Clientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientesEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String telefono;
    @Column(nullable = false)
    private String correo;
    @Column(nullable = false)
    private String direccion;
    @Column(nullable = false)
    private String historial_Bancario;
    @Column(nullable = false)
    private String certificados;
}