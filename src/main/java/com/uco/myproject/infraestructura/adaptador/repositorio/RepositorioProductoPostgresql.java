package com.uco.myproject.infraestructura.adaptador.repositorio;

import com.uco.myproject.dominio.modelo.Producto;
import com.uco.myproject.dominio.modelo.Usuario;
import com.uco.myproject.dominio.puerto.RepositorioProducto;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadProducto;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadUsuario;
import com.uco.myproject.infraestructura.adaptador.repositorio.jpa.RepositorioProductoJpa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioProductoPostgresql implements RepositorioProducto {

    private final RepositorioProductoJpa repositorioProductoJpa;

    public RepositorioProductoPostgresql(RepositorioProductoJpa repositorioProductoJpa) {
        this.repositorioProductoJpa = repositorioProductoJpa;
    }


    @Override
    public List<Producto> listar() {
        return null;
    }

    @Override
    public Producto consultarPorId(Long id) {
        return  null;
    }

    @Override
    public Long guardar(Producto producto) {
        EntidadProducto entidadProducto = new EntidadProducto();

        return this.repositorioProductoJpa.save(entidadProducto).getIdProducto();
    }


    @Override
    public Boolean eliminar(Long id) {
        repositorioProductoJpa.deleteById(id);
        return true;
    }

    @Override
    public Boolean actualizar(Long id, Producto producto) {
        repositorioProductoJpa.findById(id);
        EntidadProducto entidadProducto = new EntidadProducto();
        entidadProducto.setNombre(producto.getNombre());
        repositorioProductoJpa.save(entidadProducto);
        return true;
    }
}
