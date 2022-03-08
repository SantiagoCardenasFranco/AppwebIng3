package com.uco.myproject.dominio.dto;

public class DtoUsuarioResumen {

    private String nombre;
    private String apellido;
    private String correo;

    public DtoUsuarioResumen() {
    }

    public DtoUsuarioResumen(String nombre, String apellido, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }
}
