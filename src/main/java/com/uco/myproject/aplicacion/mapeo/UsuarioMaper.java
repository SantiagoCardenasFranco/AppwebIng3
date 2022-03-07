package com.uco.myproject.aplicacion.mapeo;

import com.uco.myproject.aplicacion.dto.DtoUsuario;
import com.uco.myproject.dominio.modelo.Usuario;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadUsuario;
import org.mapstruct.factory.Mappers;

public interface UsuarioMaper {

    UsuarioMaper  INSTANCIA = Mappers.getMapper(UsuarioMaper.class);

    DtoUsuario usuarioAUsuarioDto (Usuario usuario);
    Usuario dtoUsuarioAUsuario (DtoUsuario dtoUsuario);
    EntidadUsuario DtoUsuarioAEntidadUsuario(DtoUsuario dtoUsuario);
    EntidadUsuario usuarioAEntidadUsusario (Usuario usuario);
}
