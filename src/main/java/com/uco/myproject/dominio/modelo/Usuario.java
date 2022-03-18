package com.uco.myproject.dominio.modelo;
import lombok.Getter;

@Getter
public class Usuario {

    private final String nombre;
    private final String apellido;
    private final String correo;
    private final String password;

    public static Usuario of(String nombre, String apellido, String correo, String password) {

        validarObligatorio(nombre, "El nombre no puede ser vacio");
        validarObligatorio(apellido, "El apellido no puede ser vacio");
        validarObligatorio(correo, "El correo no puede ser vacio");
        validarObligatorio(password, "La contraseña no puede estar vacia");

        return new Usuario(nombre, apellido, correo, password);
    }

    private Usuario(String nombre, String apellido, String correo, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
    }

    private static void validarObligatorio(String valor, String mensaje) {
        if(valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
    }
}
