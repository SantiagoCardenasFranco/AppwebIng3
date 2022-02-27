package com.uco.myproject.infraestructura.adaptador.repositorio;

import com.uco.myproject.dominio.modelo.Usuario;
import com.uco.myproject.dominio.puerto.RepositorioUsuario;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadUsuario;
import com.uco.myproject.infraestructura.adaptador.repositorio.jpa.RepositorioUsuarioJpa;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class RepositorioUsuarioPostgresql implements RepositorioUsuario {

    private final RepositorioUsuarioJpa repositorioUsuarioJpa;

    public RepositorioUsuarioPostgresql(RepositorioUsuarioJpa repositorioUsuarioJpa) {
        this.repositorioUsuarioJpa = repositorioUsuarioJpa;
    }

    @Override
    public List<Usuario> listar() {
        List<EntidadUsuario> entidades = this.repositorioUsuarioJpa.findAll();
        return entidades.stream().map(entidad -> Usuario.of(entidad.getNombre(), entidad.getApellido(),
                entidad.getCorreo(), entidad.getPassword())).toList();
    }

    @Override
    public Usuario consultarPorId(Long id) {

       return this.repositorioUsuarioJpa
               .findById(id)
               .map(entidad -> Usuario.of(entidad.getNombre(), entidad.getApellido(),
                       entidad.getCorreo(), entidad.getPassword()))
               .orElse(null);
    }

    @Override
    public Long guardar(Usuario usuario) {

        EntidadUsuario entidadUsuario = new EntidadUsuario(usuario.getNombre(), usuario.getApellido(),
                usuario.getCorreo(), usuario.getPassword());

        return this.repositorioUsuarioJpa.save(entidadUsuario).getId();
    }

    @Override
    public boolean existe(Usuario usuario) {
        return this.repositorioUsuarioJpa.findByNombreAndApellido(usuario.getNombre(), usuario.getApellido()) != null;
    }

    @Override
    public Boolean eliminar(Long id) {
        this.repositorioUsuarioJpa.deleteById(id);
        return true;
    }

    @Override
    public Boolean actualizar(Long id, Usuario usuario) {
        repositorioUsuarioJpa.findById(id);
        EntidadUsuario entidadUsuario = new EntidadUsuario();
        entidadUsuario.setNombre(usuario.getNombre());
        entidadUsuario.setApellido(usuario.getApellido());
        entidadUsuario.setCorreo(usuario.getCorreo());
        entidadUsuario.setPassword(usuario.getPassword());
        repositorioUsuarioJpa.save(entidadUsuario);
        return true;
    }
}
