package co.tarjetaCredito.entidades;

import jakarta.persistence.*;

@Entity
@Table(name="Clientes")

public class Clientes
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;
    @Column
    private String telefono;
    @Column
    private String correo;
    @Column
    private String direccion;
    @Column
    private String historial_Bancario;
    @Column
    private String Certificados;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHistorial_Bancario() {
        return historial_Bancario;
    }

    public void setHistorial_Bancario(String historial_Bancario) {
        this.historial_Bancario = historial_Bancario;
    }

    public String getCertificados() {
        return Certificados;
    }

    public void setCertificados(String certificados) {
        Certificados = certificados;
    }
}
