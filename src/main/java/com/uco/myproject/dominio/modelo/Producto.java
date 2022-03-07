package com.uco.myproject.dominio.modelo;

public class Producto {

    private final String nombre;
    private final Usuario usuario;
    private final Caracteristica caracteristica;

    public static Producto of(String nombre, Usuario usuario, Caracteristica caracteristica) {

        //validarNumero(idProducto, "La identificación del producto no puede estar vacia");
        validarObligatorio(nombre);
        validarObjeto(usuario, "Un producto debe ser registrado por un usuario");
        validarObjeto(caracteristica, "La caracteristca de un producto no debe estar vacio");

        return new Producto(nombre, usuario, caracteristica);
    }

    private Producto(String nombre, Usuario usuario, Caracteristica caracteristica) {
        //this.idProducto = idProducto;
        this.nombre = nombre;
        this.usuario = usuario;
        this.caracteristica = caracteristica;
    }

    private static void validarObjeto(Object objeto, String mensaje){
        if(objeto == null){
            throw new IllegalArgumentException(mensaje);
        }
    }


    private static void validarObligatorio(String valor) {
        if(valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser vacio");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Caracteristica getCaracteristica() {
        return caracteristica;
    }
}
