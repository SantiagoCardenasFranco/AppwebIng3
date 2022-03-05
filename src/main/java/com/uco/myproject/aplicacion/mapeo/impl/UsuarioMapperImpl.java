package com.uco.myproject.aplicacion.mapeo.impl;

import com.uco.myproject.aplicacion.dto.DtoUsuario;
import com.uco.myproject.aplicacion.mapeo.UsuarioMaper;
import com.uco.myproject.dominio.modelo.Usuario;

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
}
