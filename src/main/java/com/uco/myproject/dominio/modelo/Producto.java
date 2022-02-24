package com.uco.myproject.dominio.modelo;

public class Producto {

    private final String nombre;
    private final Usuario usuario;

    public static Producto of(String nombre, Usuario usuario) {

        //validarNumero(idProducto, "La identificación del producto no puede estar vacia");
        validarObligatorio(nombre, "El nombre no puede ser vacio");
        validarObjeto(usuario, "Un producto debe ser registrado por un usuario");

        return new Producto(nombre, usuario);
    }

    private Producto(String nombre, Usuario usuario) {
        //this.idProducto = idProducto;
        this.nombre = nombre;
        this.usuario = usuario;
    }

    private static void validarObjeto(Object objeto, String mensaje){
        if(objeto.getClass() == null){
            throw new IllegalArgumentException(mensaje);
        }
    }


    private static void validarObligatorio(String valor, String mensaje) {
        if(valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
