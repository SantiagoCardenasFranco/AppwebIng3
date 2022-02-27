package com.uco.myproject.dominio.puerto;


import com.uco.myproject.dominio.modelo.Tamano;

import java.util.List;

public interface RepositorioTamano {

    List<Tamano> listar();
    Long guardar(Tamano tamano);
    Boolean eliminar(Long id);
    Boolean actualizar(Long id, Tamano tamano);
}
