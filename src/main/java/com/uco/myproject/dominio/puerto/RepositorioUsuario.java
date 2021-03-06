package com.uco.myproject.dominio.puerto;

import com.uco.myproject.dominio.dto.DtoUsuarioResumen;
import com.uco.myproject.dominio.modelo.Usuario;

import java.util.List;

public interface RepositorioUsuario {

    List<DtoUsuarioResumen> listar();
    Usuario consultarPorId(Long id);
    Long guardar(Usuario usuario);
    boolean existe(Usuario usuario);
    Boolean eliminar(Long id);
    Boolean actualizar(Long id, Usuario usuario);
}
