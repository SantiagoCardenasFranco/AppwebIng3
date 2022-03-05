package com.uco.myproject.dominio.testdatabuilder;

import com.uco.myproject.dominio.modelo.Tamano;
import com.uco.myproject.dominio.modelo.Usuario;

public class TamanoTestDataBuilder {

    private String nombre;
    private String especificacion;

    public TamanoTestDataBuilder() {
        this.nombre = "Grande";
        this.especificacion = "Va desde 30 a 50 cm";
    }

    public TamanoTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public TamanoTestDataBuilder conEspecificacion(String especificacion) {
        this.especificacion = especificacion;
        return this;
    }

    public Tamano build() {
        return Tamano.of(nombre, especificacion);
    }
}
