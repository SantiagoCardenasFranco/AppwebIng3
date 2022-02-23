package com.uco.myproject.dominio.testdatabuilder;

import com.uco.myproject.dominio.modelo.Usuario;

public class PersonaTestDataBuilder {

    private String nombre;
    private String apellido;
    private String correo;
    private String password;

    public PersonaTestDataBuilder() {
        this.nombre = "juan";
        this.apellido = "castano";
        this.correo = "sjdgfbusjdh";
        this.password = "ksdnjdsk5";
    }

    public PersonaTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PersonaTestDataBuilder conApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public PersonaTestDataBuilder conCorreo(String correo){
        this.correo = correo;
        return this;
    }

    public PersonaTestDataBuilder conPassword(String password){
        this.password = password;
        return this;
    }

    public Usuario build() {
        return Usuario.of(nombre, apellido, correo, password);
    }
}
