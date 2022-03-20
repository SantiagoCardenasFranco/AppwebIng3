package com.uco.myproject.dominio.modelo;

import lombok.Getter;
import com.uco.myproject.dominio.validador.validadorAtributos;
import com.uco.myproject.dominio.validador.validadorObjeto;

@Getter
public class Caracteristica {

    private final String marca;
    private final String descripcion;
    private final Tamano tamano;
    private final String proveedor;

    public static Caracteristica of(String marca, String descripcion, Tamano tamano, String proveedor) {

        validadorAtributos.validarObligatorio(marca, "La marca no puede ser vacia");
        validadorAtributos.validarObligatorio(descripcion, "La descripcion no puede ser vacia");
        validadorObjeto.validarObjeto(tamano, "El tamaño no puede ser vacio");
        validadorAtributos.validarObligatorio(proveedor, "La contraseña no puede estar vacia");

        return new Caracteristica(marca, descripcion, tamano, proveedor);
    }

    private Caracteristica(String marca, String descripcion, Tamano tamano, String proveedor) {
        this.marca = marca;
        this.descripcion = descripcion;
        this.tamano = tamano;
        this.proveedor = proveedor;
    }
}
