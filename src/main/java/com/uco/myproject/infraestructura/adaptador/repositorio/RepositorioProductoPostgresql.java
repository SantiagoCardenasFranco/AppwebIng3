package com.uco.myproject.infraestructura.adaptador.repositorio;

import com.uco.myproject.aplicacion.mapeo.impl.CaracteristicaMapperImpl;
import com.uco.myproject.aplicacion.mapeo.impl.UsuarioMapperImpl;
import com.uco.myproject.dominio.modelo.Caracteristica;
import com.uco.myproject.dominio.modelo.Producto;
import com.uco.myproject.dominio.modelo.Tamano;
import com.uco.myproject.dominio.modelo.Usuario;
import com.uco.myproject.dominio.puerto.RepositorioProducto;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadCaracteristica;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadProducto;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadUsuario;
import com.uco.myproject.infraestructura.adaptador.repositorio.jpa.RepositorioCaracteristicaJpa;
import com.uco.myproject.infraestructura.adaptador.repositorio.jpa.RepositorioProductoJpa;
import com.uco.myproject.infraestructura.adaptador.repositorio.jpa.RepositorioUsuarioJpa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioProductoPostgresql implements RepositorioProducto {

    private final RepositorioProductoJpa repositorioProductoJpa;
    private final RepositorioUsuarioJpa repositorioUsuarioJpa;
    private final RepositorioCaracteristicaJpa repositorioCaracteristicaJpa;

    public RepositorioProductoPostgresql(RepositorioProductoJpa repositorioProductoJpa, RepositorioUsuarioJpa repositorioUsuarioJpa, RepositorioCaracteristicaJpa repositorioCaracteristicaJpa) {
        this.repositorioProductoJpa = repositorioProductoJpa;
        this.repositorioUsuarioJpa = repositorioUsuarioJpa;
        this.repositorioCaracteristicaJpa = repositorioCaracteristicaJpa;
    }


    @Override
    public List<Producto> listar() {
        List<EntidadProducto> entidades = this.repositorioProductoJpa.findAll();
        return entidades.stream().map(entidad -> Producto.of(entidad.getNombre(),
                Usuario.of(entidad.getEntidadUsuario().getNombre(),
                        entidad.getEntidadUsuario().getApellido(),
                        entidad.getEntidadUsuario().getCorreo(),
                        entidad.getEntidadUsuario().getPassword()),
                Caracteristica.of(entidad.getEntidadCaracteristica().getMarca(),
                        entidad.getEntidadCaracteristica().getDescripcion(),
                        Tamano.of(entidad.getEntidadCaracteristica().getEntidadTamano().getNombre(),
                                entidad.getEntidadCaracteristica().getEntidadTamano().getEspecificacion()),
                        entidad.getEntidadCaracteristica().getNombreProveedor()))).toList();
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
        EntidadUsuario entidadUsuario = this.repositorioUsuarioJpa.findByNombreAndApellido(producto.getUsuario().getNombre(), producto.getUsuario().getApellido());
        EntidadCaracteristica entidadCaracteristica =this.repositorioCaracteristicaJpa.findByMarca(producto.getCaracteristica().getMarca());

        EntidadProducto entidadProducto = new EntidadProducto(producto.getNombre(),
                entidadUsuario, entidadCaracteristica);

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
