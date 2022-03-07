package com.uco.myproject.infraestructura.adaptador.repositorio;

import com.uco.myproject.dominio.modelo.Caracteristica;
import com.uco.myproject.dominio.modelo.Producto;
import com.uco.myproject.dominio.puerto.RepositorioCaracteristica;
import com.uco.myproject.dominio.puerto.RepositorioProducto;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadCaracteristica;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadProducto;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadUsuario;
import com.uco.myproject.infraestructura.adaptador.repositorio.jpa.RepositorioCaracteristicaJpa;
import com.uco.myproject.infraestructura.adaptador.repositorio.jpa.RepositorioProductoJpa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioCaracteristcaPostgresql implements RepositorioCaracteristica {

    private final RepositorioCaracteristicaJpa repositorioCaracteristicaJpa;

    public RepositorioCaracteristcaPostgresql(RepositorioCaracteristicaJpa repositorioCaracteristicaJpa) {
        this.repositorioCaracteristicaJpa = repositorioCaracteristicaJpa;
    }


    @Override
    public List<Caracteristica> listar() {
        return null;
    }

    @Override
    public Caracteristica consultarPorId(Long id) {
        return null;
    }

    @Override
    public Long guardar(Caracteristica caracteristica) {
        return null;
    }

    @Override
    public boolean existe(Caracteristica caracteristica) {
        return this.repositorioCaracteristicaJpa.findByMarca(caracteristica.getMarca()) != null;
    }

    @Override
    public Boolean eliminar(Long id) {
        repositorioCaracteristicaJpa.deleteById(id);
        return true;
    }

    @Override
    public Boolean actualizar(Long id, Caracteristica caracteristica) {
        repositorioCaracteristicaJpa.findById(id);
        EntidadCaracteristica entidadCaracteristica = new EntidadCaracteristica();
        entidadCaracteristica.setId(id);
        entidadCaracteristica.setDescripcion(caracteristica.getDescripcion());
        entidadCaracteristica.setMarca(caracteristica.getMarca());
        entidadCaracteristica.setNombreProveedor(caracteristica.getProveedor());
        repositorioCaracteristicaJpa.save(entidadCaracteristica);
        return true;
    }
}
