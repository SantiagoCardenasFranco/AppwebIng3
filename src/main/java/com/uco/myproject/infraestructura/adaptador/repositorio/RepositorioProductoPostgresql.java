package com.uco.myproject.infraestructura.adaptador.repositorio;

import com.uco.myproject.aplicacion.mapeo.impl.CaracteristicaMapperImpl;
import com.uco.myproject.aplicacion.mapeo.impl.TamanoMapperImpl;
import com.uco.myproject.aplicacion.mapeo.impl.UsuarioMapperImpl;
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
        List<EntidadProducto> entidades = this.repositorioProductoJpa.findAll();
        return entidades.stream().map(entidad -> Producto.of(entidad.getNombre(),
                UsuarioMapperImpl.INSTANCIA.entidadUsuarioAUsuario(entidad.getEntidadUsuario()),
                CaracteristicaMapperImpl.INSTANCIA.entidadCaracteristicaACaracteristica(entidad.getEntidadCaracteristica()))).toList();
    }

    @Override
    public Producto consultarPorId(Long id) {
       return this.repositorioProductoJpa
                .findById(id)
                .map(entidad -> Producto.of(entidad.getNombre(), UsuarioMapperImpl.INSTANCIA.entidadUsuarioAUsuario(entidad.getEntidadUsuario()),
                                CaracteristicaMapperImpl.INSTANCIA.entidadCaracteristicaACaracteristica(entidad.getEntidadCaracteristica())))
               .orElse(null);
    }

    @Override
    public Long guardar(Producto producto) {

        EntidadProducto entidadProducto = new EntidadProducto(producto.getNombre(),
                UsuarioMapperImpl.INSTANCIA.usuarioAEntidadUsuario(producto.getUsuario()),
                CaracteristicaMapperImpl.INSTANCIA.caracteristicaAEntidadCaracteristica(producto.getCaracteristica()));

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
        entidadProducto.setIdProducto(id);
        entidadProducto.setNombre(producto.getNombre());
        repositorioProductoJpa.save(entidadProducto);
        return true;
    }
}
