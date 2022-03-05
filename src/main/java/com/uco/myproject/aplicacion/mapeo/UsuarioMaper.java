package com.uco.myproject.aplicacion.mapeo;

import com.uco.myproject.aplicacion.dto.DtoUsuario;
import com.uco.myproject.dominio.modelo.Usuario;
import org.mapstruct.factory.Mappers;

public interface UsuarioMaper {

    UsuarioMaper  INSTANCIA = Mappers.getMapper(UsuarioMaper.class);

    DtoUsuario usuarioAUsuarioDto (Usuario usuario);
}
