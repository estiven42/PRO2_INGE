package co.tarjetaCredito.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Cliente")
public class ClientesEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CLIENTE")
    @SequenceGenerator(name = "SEQ_CLIENTE", sequenceName = "SEQ_CLIENTE", allocationSize = 1)
    @Column(name = "CLI_CODIGO")
    private long serial;
    @Column(name = "CLI_nombre")
    private String nombre;
    @Column(name = "CLI_telefono")
    private int telefono;
    @Column(name = "CLI_correo")
    private String correo;
    @Column(name = "CLI_direccion")
    private String direccion;
    @Column(name = "CLI_historial_Bancario")
    private String historial_Bancario;
    @Column(name = "CLI_certificados")
    private String certificados;
}
