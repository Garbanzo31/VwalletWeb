package pe.edu.upc.vwalletweb.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "Usuarios")
public class Usuario {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idUsuario;
@Column(name="tipo_usuario", nullable = false, length = 10)
    private String tipoUsuario;
    @Column(name="nombre", nullable = false, length = 100)
    private String nombre;
    @Column(name="correo_electronico", nullable = false, length = 100)
    private String correo;
    @Column(name="pin", nullable = false, length = 6)
    private String pin;
    @Column(name="creadoEn")
    private LocalDateTime creadoEn;
    @Column(name="editadoEn")
    private LocalDateTime editadoEn;

    public Usuario() {
    }

    public Usuario(int idUsuario, String tipoUsuario, String nombre, String correo, String pin, LocalDateTime creadoEn, LocalDateTime editadoEn) {
        this.idUsuario = idUsuario;
        this.tipoUsuario = tipoUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.pin = pin;
        this.creadoEn = creadoEn;
        this.editadoEn = editadoEn;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public LocalDateTime getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(LocalDateTime creadoEn) {
        this.creadoEn = creadoEn;
    }

    public LocalDateTime getEditadoEn() {
        return editadoEn;
    }

    public void setEditadoEn(LocalDateTime editadoEn) {
        this.editadoEn = editadoEn;
    }
}

