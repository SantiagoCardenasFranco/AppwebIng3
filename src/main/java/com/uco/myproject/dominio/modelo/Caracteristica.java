package com.uco.myproject.dominio.modelo;

public class Caracteristica {

    private final String marca;
    private final String descripcion;
    private final Tamano tamano;
    private final String proveedor;

    public static Caracteristica of(String marca, String descripcion, Tamano tamano, String proveedor) {

        validarObligatorio(marca, "La marca no puede ser vacia");
        validarObligatorio(descripcion, "La descripcion no puede ser vacia");
        validarObjeto(tamano);
        validarObligatorio(proveedor, "La contraseña no puede estar vacia");

        return new Caracteristica(marca, descripcion, tamano, proveedor);
    }

    private Caracteristica(String marca, String descripcion, Tamano tamano, String proveedor) {
        this.marca = marca;
        this.descripcion = descripcion;
        this.tamano = tamano;
        this.proveedor = proveedor;
    }

    private static void validarObjeto(Object objeto){
        if(objeto == null){
            throw new IllegalArgumentException("El tamaño no puede ser vacio");
        }
    }

    private static void validarObligatorio(String valor, String mensaje) {
        if(valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Tamano getTamano() {
        return tamano;
    }

    public String getProveedor() {
        return proveedor;
    }
}
