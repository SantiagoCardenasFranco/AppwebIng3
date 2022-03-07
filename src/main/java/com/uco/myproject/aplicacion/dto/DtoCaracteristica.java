package com.uco.myproject.aplicacion.dto;

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

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDtoTamano(DtoTamano dtoTamano) {
        this.dtoTamano = dtoTamano;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
}
