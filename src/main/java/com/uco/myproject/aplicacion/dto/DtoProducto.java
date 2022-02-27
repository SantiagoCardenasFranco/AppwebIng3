package com.uco.myproject.aplicacion.dto;

public class DtoProducto {

    private String nombre;
    private DtoUsuario dtoUsuario;
    private DtoCaracteristica dtoCaracteristica;

    public DtoProducto() {
    }

    private DtoProducto(String nombre, DtoUsuario dtoUsuario, DtoCaracteristica dtoCaracteristica) {
        //this.idProducto = idProducto;
        this.nombre = nombre;
        this.dtoUsuario = dtoUsuario;
        this.dtoCaracteristica = dtoCaracteristica;
    }

    public String getNombre() {
        return nombre;
    }

    public DtoUsuario getDtoUsuario() {
        return dtoUsuario;
    }

    public DtoCaracteristica getDtoCaracteristica() {
        return dtoCaracteristica;
    }
}
