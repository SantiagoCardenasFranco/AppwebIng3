package com.uco.myproject.dominio.modelo;

import lombok.Getter;
import com.uco.myproject.dominio.validador.validadorAtributos;
import com.uco.myproject.dominio.validador.validadorObjeto;

@Getter
public class Producto {

    private final String nombre;
    private final Usuario usuario;
    private final Caracteristica caracteristica;

    public static Producto of(String nombre, Usuario usuario, Caracteristica caracteristica) {

        validadorAtributos.validarObligatorio(nombre, "Un producto debe ser registrado con un nombre");
        validadorObjeto.validarObjeto(usuario, "Un producto debe ser registrado por un usuario");
        validadorObjeto.validarObjeto(caracteristica, "La caracteristca de un producto no debe estar vacio");

        return new Producto(nombre, usuario, caracteristica);
    }

    private Producto(String nombre, Usuario usuario, Caracteristica caracteristica) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.caracteristica = caracteristica;
    }
}
