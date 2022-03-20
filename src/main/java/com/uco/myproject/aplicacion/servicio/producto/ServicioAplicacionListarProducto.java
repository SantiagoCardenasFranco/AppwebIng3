package com.uco.myproject.aplicacion.servicio.producto;

import com.uco.myproject.dominio.modelo.Producto;
import com.uco.myproject.dominio.puerto.RepositorioProducto;
import com.uco.myproject.dominio.validador.ValidadorHora;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionListarProducto {

    private final RepositorioProducto repositorioProducto;

    public ServicioAplicacionListarProducto(RepositorioProducto repositorioProducto) {
        this.repositorioProducto = repositorioProducto;
    }

    public List<Producto> ejecutar() {
        ValidadorHora.validarHora();
        return this.repositorioProducto.listar();
    }
}
