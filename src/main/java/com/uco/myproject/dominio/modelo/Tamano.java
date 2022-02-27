package com.uco.myproject.dominio.modelo;

public class Tamano {

    private final String nombre;
    private final String especificacion;

    public static Tamano of(String nombre, String especificacion) {

        validarObligatorio(nombre, "El nombre no puede ser vacio");
        validarObligatorio(especificacion, "La especificación no puede estar vacia");

        return new Tamano(nombre, especificacion);
    }

    private Tamano(String nombre, String especificacion) {
        this.nombre = nombre;
        this.especificacion = especificacion;
    }

    private static void validarObligatorio(String valor, String mensaje) {
        if(valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecificacion() {
        return especificacion;
    }
}
