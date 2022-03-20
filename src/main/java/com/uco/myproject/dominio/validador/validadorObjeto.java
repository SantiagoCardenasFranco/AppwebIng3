package com.uco.myproject.dominio.validador;

public class validadorObjeto {

    public static void validarObjeto(Object objeto, String mensaje){
        if(objeto == null){
            throw new IllegalArgumentException(mensaje);
        }
    }
}
