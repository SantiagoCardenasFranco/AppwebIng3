package com.uco.myproject.dominio.servicio.usuario;

import com.uco.myproject.dominio.puerto.RepositorioUsuario;
import org.springframework.stereotype.Service;

@Service
public class ServicioEliminarUsuario {

    private static final String MENSAJE_NO_EXISTE = "El usuario que intenta elminar no está en el repositorio";

    private final RepositorioUsuario repositorioUsuario;

    public ServicioEliminarUsuario(RepositorioUsuario repositorioUsuario){
        this.repositorioUsuario = repositorioUsuario;
    }

    public Boolean ejecutar(Long id) {
        //if(this.repositorioPersona.existe(persona)){
        return this.repositorioUsuario.eliminar(id);
        /*}else
        {
            throw new IllegalStateException(MENSAJE_NO_EXISTE);
        }*/
    }
}
