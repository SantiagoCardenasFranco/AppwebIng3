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
    public EntidadUsuario usuarioAEntidadUsusario(Usuario usuario) {
        if (usuario == null) {
            return null;
        }
        EntidadUsuario entidadUsuario = new EntidadUsuario();
        entidadUsuario.setNombre(usuario.getNombre());
        entidadUsuario.setApellido(usuario.getApellido());
        entidadUsuario.setCorreo(usuario.getCorreo());
        entidadUsuario.setPassword(usuario.getPassword());
        return entidadUsuario;
    }
}
