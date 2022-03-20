package com.uco.myproject.infraestructura.testdatabuilder;

import com.uco.myproject.aplicacion.dto.DtoCaracteristica;
import com.uco.myproject.aplicacion.dto.DtoProducto;
import com.uco.myproject.aplicacion.dto.DtoTamano;
import com.uco.myproject.aplicacion.dto.DtoUsuario;

public class DtoProductoTestDataBuilder {

    private String nombre;
    private DtoUsuario dtoUsuario;
    private DtoCaracteristica dtoCaracteristica;

    public DtoProductoTestDataBuilder() {
        DtoTamano dtoTamano = new DtoTamano("Grande", "Va desde 32 a 50 cm");
        this.nombre = "ProductoUno";
        this.dtoUsuario =  new DtoUsuario("Santiago", "Cárdenas", "sjhbcjsnd",
                "avsyxgbaj");
        this.dtoCaracteristica = new DtoCaracteristica("LG", "Fundación",
                dtoTamano, "Gerente de LG");
    }

    public DtoProductoTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public DtoProductoTestDataBuilder conDtoUsuario(DtoUsuario dtoUsuario) {
        this.dtoUsuario = dtoUsuario;
        return this;
    }

    public DtoProductoTestDataBuilder conDtoCaracteristica(DtoCaracteristica dtoCaracteristica) {
        this.dtoCaracteristica = dtoCaracteristica;
        return this;
    }

        public DtoProducto build() {
        return new DtoProducto(nombre, dtoUsuario, dtoCaracteristica);
    }
}