package com.uco.myproject.infraestructura.testdatabuilder;

import com.uco.myproject.aplicacion.dto.DtoUsuario;

public class DtoUsuarioTestDataBuilder {

    private String nombre;
    private String apellido;
    private String correo;
    private String password;

    public DtoUsuarioTestDataBuilder() {
        this.nombre = "juan";
        this.apellido = "castaño";
        this.correo = "jhdfbjhd";
        this.password = "sbdfujdsh";
    }

    public DtoUsuarioTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public DtoUsuarioTestDataBuilder conApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public DtoUsuarioTestDataBuilder conCorreo(String correo){
        this.correo = correo;
        return this;
    }

    public DtoUsuarioTestDataBuilder conPassword(String password){
        this.password = password;
        return this;
    }

    public DtoUsuario build() {
        return new DtoUsuario(nombre, apellido, correo, password);
    }
}
