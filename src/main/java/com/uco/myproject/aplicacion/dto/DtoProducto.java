package com.uco.myproject.aplicacion.dto;

import com.uco.myproject.dominio.modelo.Usuario;

public class DtoProducto {

    private String nombre;
    private Usuario usuario;

    public DtoProducto() {
    }

    private DtoProducto(String nombre, Usuario usuario) {
        //this.idProducto = idProducto;
        this.nombre = nombre;
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
