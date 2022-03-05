package com.uco.myproject.dominio.servicio.producto;

import com.uco.myproject.dominio.puerto.RepositorioProducto;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadProducto;
import org.springframework.stereotype.Service;

@Service
public class ServicioGuardarProducto {

 //private static final String MENSAJE_YA_EXISTE = "Ya existe la persona con los datos ingresados";

    private final RepositorioProducto repositorioProducto;

    public ServicioGuardarProducto(RepositorioProducto repositorioProducto) {
        this.repositorioProducto = repositorioProducto;
    }

    public Long ejecutar(EntidadProducto producto) {

        return this.repositorioProducto.guardar(producto);
    }
}
