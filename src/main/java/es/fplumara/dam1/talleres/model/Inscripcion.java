package es.fplumara.dam1.talleres.model;

import java.time.LocalDate;


public class Inscripcion {
    private String id;
    private String rol;
    private LocalDate fechaIncripcion;

    public Inscripcion(Long tallerId, Long usuarioId, String rol, LocalDate fechaIncripcion) {
        this.id = id;
        this.rol = rol;
        this.fechaIncripcion = fechaIncripcion;
    }

    public Inscripcion(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public LocalDate getFechaIncripcion() {
        return fechaIncripcion;
    }

    public void setFechaIncripcion(LocalDate fechaIncripcion) {
        this.fechaIncripcion = fechaIncripcion;
    }

}