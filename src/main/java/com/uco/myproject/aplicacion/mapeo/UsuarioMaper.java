package com.uco.myproject.aplicacion.mapeo;

import com.uco.myproject.aplicacion.dto.DtoUsuario;
import com.uco.myproject.dominio.modelo.Usuario;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadUsuario;
import org.mapstruct.factory.Mappers;

public interface UsuarioMaper {

    UsuarioMaper  INSTANCIA = Mappers.getMapper(UsuarioMaper.class);

    DtoUsuario usuarioAUsuarioDto (Usuario usuario);
    EntidadUsuario usuarioAEntidadUsuario(Usuario usuario);
    Usuario dtoUsuarioAUsuario (DtoUsuario dtoUsuario);
    Usuario entidadUsuarioAUsuario (EntidadUsuario entidadUsuario);
}
