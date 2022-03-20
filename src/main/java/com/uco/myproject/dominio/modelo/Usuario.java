package com.uco.myproject.dominio.modelo;
import com.uco.myproject.dominio.validador.validadorAtributos;
import lombok.Getter;

@Getter
public class Usuario {

    private final String nombre;
    private final String apellido;
    private final String correo;
    private final String password;

    public static Usuario of(String nombre, String apellido, String correo, String password) {

        validadorAtributos.validarObligatorio(nombre, "El nombre no puede ser vacio");
        validadorAtributos.validarObligatorio(apellido, "El apellido no puede ser vacio");
        validadorAtributos.validarObligatorio(correo, "El correo no puede ser vacio");
        validadorAtributos.validarObligatorio(password, "La contraseña no puede estar vacia");
        validadorAtributos.implemetacionCaracteresEspecialesCorreo(correo, "El correo tiene una reglas de escritura");
        validadorAtributos.implemetacionCaracteresEspecialesPassword(password, "La contaseña tiene unas reglas de escritura");

        return new Usuario(nombre, apellido, correo, password);
    }

    private Usuario(String nombre, String apellido, String correo, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
    }
}
