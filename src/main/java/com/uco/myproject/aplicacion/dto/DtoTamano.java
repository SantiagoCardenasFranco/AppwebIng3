package com.uco.myproject.aplicacion.dto;

public class DtoTamano {

    private String nombre;
    private String especificacion;

    public DtoTamano() {
    }

    public DtoTamano(String nombre, String especificacion) {
        this.nombre = nombre;
        this.especificacion = especificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecificacion() {
        return especificacion;
    }
}
