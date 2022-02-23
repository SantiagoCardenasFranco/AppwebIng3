package com.uco.myproject.infraestructura.testdatabuilder;

import com.uco.myproject.aplicacion.dto.DtoUsuario;

public class DtoPersonaTestDataBuilder {

    private String nombre;
    private String apellido;
    private String correo;
    private String password;

    public DtoPersonaTestDataBuilder() {
        this.nombre = "juan";
        this.apellido = "castaño";
        this.correo = "jhdfbjhd";
        this.password = "sbdfujdsh";
    }

    public DtoPersonaTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public DtoPersonaTestDataBuilder conApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public  DtoPersonaTestDataBuilder conCorreo(String correo){
        this.correo = correo;
        return this;
    }

    public DtoPersonaTestDataBuilder conPassword(String password){
        this.password = password;
        return this;
    }

    public DtoUsuario build() {
        return new DtoUsuario(nombre, apellido, correo, password);
    }
}
