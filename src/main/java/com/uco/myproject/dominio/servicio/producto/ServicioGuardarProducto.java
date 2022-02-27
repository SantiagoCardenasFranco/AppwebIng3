package com.uco.myproject.dominio.servicio.producto;

import com.uco.myproject.dominio.modelo.Producto;
import com.uco.myproject.dominio.modelo.Usuario;
import com.uco.myproject.dominio.puerto.RepositorioProducto;
import com.uco.myproject.dominio.puerto.RepositorioUsuario;
import org.springframework.stereotype.Service;

@Service
public class ServicioGuardarProducto {

 /*   private static final String MENSAJE_YA_EXISTE = "Ya existe la persona con los datos ingresados";

    private final RepositorioProducto repositorioProducto;

    public ServicioGuardarProducto(RepositorioProducto repositorioProducto) {
        this.repositorioProducto = repositorioProducto;
    }

    public Long ejecutar(Producto producto) {

        if(this.repositorioProducto.existe(producto)) {
            throw new IllegalStateException(MENSAJE_YA_EXISTE);
        }
        return this.repositorioProducto.guardar(producto);
    }*/
}
