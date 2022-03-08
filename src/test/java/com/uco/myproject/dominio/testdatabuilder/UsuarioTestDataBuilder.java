package com.uco.myproject.dominio.testdatabuilder;

import com.uco.myproject.dominio.modelo.Usuario;

public class UsuarioTestDataBuilder {

    private String nombre;
    private String apellido;
    private String correo;
    private String password;

    public UsuarioTestDataBuilder() {
        this.nombre = "Santiago";
        this.apellido = "Cárdenas";
        this.correo = "sjdgfbusjdh";
        this.password = "jydfbdsjhb48A";
    }

    public UsuarioTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public UsuarioTestDataBuilder conApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public UsuarioTestDataBuilder conCorreo(String correo){
        this.correo = correo;
        return this;
    }

    public UsuarioTestDataBuilder conPassword(String password){
        this.password = password;
        return this;
    }

    public Usuario build() {
        return Usuario.of(nombre, apellido, correo, password);
    }
}
