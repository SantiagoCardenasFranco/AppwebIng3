package com.uco.myproject.aplicacion.mapeo.impl;

import com.uco.myproject.aplicacion.dto.DtoUsuario;
import com.uco.myproject.aplicacion.mapeo.UsuarioMaper;
import com.uco.myproject.dominio.modelo.Usuario;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadUsuario;

public class UsuarioMapperImpl implements UsuarioMaper {
    @Override
    public DtoUsuario usuarioAUsuarioDto(Usuario usuario) {
        if (usuario == null) {
            return null;
        }
        DtoUsuario dtoUsuario = new DtoUsuario();
        dtoUsuario.setNombre(usuario.getNombre());
        dtoUsuario.setApellido(usuario.getApellido());
        dtoUsuario.setCorreo(usuario.getCorreo());
        dtoUsuario.setPassword(usuario.getPassword());
        return dtoUsuario;
    }

    @Override
    public Usuario dtoUsuarioAUsuario(DtoUsuario dtoUsuario) {
        if (dtoUsuario == null) {
            return null;
        }

        return Usuario.of(dtoUsuario.getNombre(), dtoUsuario.getApellido(), dtoUsuario.getCorreo(),
                dtoUsuario.getPassword());
    }

    @Override
    public Usuario entidadUsuarioAUsuario(EntidadUsuario entidadUsuario) {
        if (entidadUsuario == null) {
            return null;
        }
        return Usuario.of(entidadUsuario.getNombre(), entidadUsuario.getApellido(), entidadUsuario.getCorreo(),
                entidadUsuario.getPassword());
    }

    @Override
    public EntidadUsuario usuarioAEntidadUsuario(Usuario usuario) {
        if(usuario == null)
        {
            return null;
        }
        EntidadUsuario entidadUsuario = new EntidadUsuario();
        entidadUsuario.setNombre(usuario.getNombre());
        entidadUsuario.setCorreo(usuario.getCorreo());
        entidadUsuario.setApellido(usuario.getApellido());
        entidadUsuario.setPassword(usuario.getPassword());
        return entidadUsuario;
    }
}
