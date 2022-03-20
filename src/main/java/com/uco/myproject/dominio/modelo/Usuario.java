package com.uco.myproject.dominio.modelo;
import com.uco.myproject.dominio.validador.ValidadorAtributos;
import lombok.Getter;

@Getter
public class Usuario {

    private final String nombre;
    private final String apellido;
    private final String correo;
    private final String password;

    public static Usuario of(String nombre, String apellido, String correo, String password) {

        ValidadorAtributos.validarObligatorio(nombre, "El nombre no puede ser vacio");
        ValidadorAtributos.validarObligatorio(apellido, "El apellido no puede ser vacio");
        ValidadorAtributos.validarObligatorio(correo, "El correo no puede ser vacio");
        ValidadorAtributos.validarObligatorio(password, "La contraseña no puede estar vacia");
        ValidadorAtributos.implemetacionCaracteresEspecialesCorreo(correo, "El correo tiene una reglas de escritura");
        ValidadorAtributos.implemetacionCaracteresEspecialesPassword(password, "La contaseña tiene unas reglas de escritura");

        return new Usuario(nombre, apellido, correo, password);
    }

    private Usuario(String nombre, String apellido, String correo, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
    }
}
