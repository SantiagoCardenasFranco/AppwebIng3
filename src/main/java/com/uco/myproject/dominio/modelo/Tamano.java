package com.uco.myproject.dominio.modelo;
import lombok.Getter;
import com.uco.myproject.dominio.validador.validadorAtributos;

@Getter
public class Tamano {

    private final String nombre;
    private final String especificacion;

    public static Tamano of(String nombre, String especificacion) {

        validadorAtributos.validarObligatorio(nombre, "El nombre no puede ser vacio");
        validadorAtributos.validarObligatorio(especificacion, "La especificación no puede estar vacia");

        return new Tamano(nombre, especificacion);
    }

    private Tamano(String nombre, String especificacion) {
        this.nombre = nombre;
        this.especificacion = especificacion;
    }

}
