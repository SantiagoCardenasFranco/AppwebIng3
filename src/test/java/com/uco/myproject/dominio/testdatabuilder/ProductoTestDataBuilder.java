package com.uco.myproject.dominio.testdatabuilder;

import com.uco.myproject.dominio.modelo.Caracteristica;
import com.uco.myproject.dominio.modelo.Producto;
import com.uco.myproject.dominio.modelo.Tamano;
import com.uco.myproject.dominio.modelo.Usuario;

public class ProductoTestDataBuilder {

    private String nombre;
    private Usuario usuario;
    private Caracteristica caracteristica;

    public ProductoTestDataBuilder() {
        this.nombre = "ProductoUno";
        this.usuario = Usuario.of("Santiago", "Cárdenas", "sjhbcjsnd",
                "avsyxgbaj");
        this.caracteristica = Caracteristica.of("LG", "Fundación",
                Tamano.of("Grande", "Va desde 32 a 50 cm") , "Gerente de LG");
    }

    public ProductoTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ProductoTestDataBuilder conUsuario(Usuario usuario) {
        this.usuario = usuario;
        return this;
    }

    public ProductoTestDataBuilder conCaracteristica(Caracteristica caracteristica) {
        this.caracteristica = caracteristica;
        return this;
    }

        public Producto build() {
        return Producto.of(nombre, usuario, caracteristica);
    }
}
