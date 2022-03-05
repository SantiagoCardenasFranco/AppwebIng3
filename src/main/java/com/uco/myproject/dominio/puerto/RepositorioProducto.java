package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.modelo.Producto;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadProducto;

import java.util.List;

public interface RepositorioProducto {

    List<Producto> listar();
    Producto consultarPorId(Long id);
    Long guardar(EntidadProducto producto);
    Boolean eliminar(Long id);
    Boolean actualizar(Long id, Producto producto);
}
