package co.vinni.soapproyectobase.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Empleado")
public class Equipo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EMPLEADO")
    @SequenceGenerator(name = "SEQ_EMPLEADO", sequenceName = "SEQ_EMPLEADO", allocationSize = 1)
    @Column(name = "EMP_CODIGO")
    private long serial;

    @Column(name = "EMP_NOMBRE")
    private String nombre;

    @Column(name = "EMP_CORREO")
    private String correo;

    @Column(name = "EMP_CONTRASENA")
    private String contrasena;

}