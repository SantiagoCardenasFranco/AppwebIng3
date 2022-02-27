package com.uco.myproject.aplicacion.dto;

import com.uco.myproject.dominio.modelo.Tamano;

public class DtoCaracteristica {

    private String marca;
    private String descripcion;
    private DtoTamano dtoTamano;
    private String proveedor;

    public DtoCaracteristica() {
    }

    public DtoCaracteristica(String marca, String descripcion, DtoTamano dtoTamano, String proveedor) {
        this.marca = marca;
        this.descripcion = descripcion;
        this.dtoTamano = dtoTamano;
        this.proveedor = proveedor;
    }

    public String getMarca() {
        return marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public DtoTamano getDtoTamano() {
        return dtoTamano;
    }

    public String getProveedor() {
        return proveedor;
    }
}
