package pe.edu.upc.vwalletweb.entities;

import jakarta.persistence.*;


@Table(name = "Servicio")
@Entity
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idservicio;
    @Column(name = "nombre_servicio",nullable = false,length = 20)
    private String nombreservicio;
    @Column(name = "estado",nullable = false,length = 20)
    private String estado;



    public Servicio() {
    }

    public Servicio(int idservicio, String nombreservicio, String estado) {
        this.idservicio = idservicio;
        this.nombreservicio = nombreservicio;
        this.estado = estado;
    }

    public int getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(int idservicio) {
        this.idservicio = idservicio;
    }

    public String getNombreservicio() {
        return nombreservicio;
    }

    public void setNombreservicio(String nombreservicio) {
        this.nombreservicio = nombreservicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}