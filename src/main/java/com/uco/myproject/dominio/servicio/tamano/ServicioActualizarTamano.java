package com.uco.myproject.dominio.servicio.tamano;

import com.uco.myproject.dominio.modelo.Tamano;
import com.uco.myproject.dominio.puerto.RepositorioTamano;
import com.uco.myproject.dominio.validador.ValidadorHora;
import org.springframework.stereotype.Service;

@Service
public class ServicioActualizarTamano {

    private static final String PERSONA_NO_ACTUALIZADA = "NO SE ENCONTRÓ EL TAMAÑO O NO EXISTE";

    private final RepositorioTamano repositorioTamano;

    public ServicioActualizarTamano(RepositorioTamano repositorioTamano)
    {
        this.repositorioTamano = repositorioTamano;
    }

    public Boolean ejecutar(Long id, Tamano tamano){
        if(repositorioTamano.consultarPorId(id) != null)
        {
            ValidadorHora.validarHora();
            return this.repositorioTamano.actualizar(id, tamano);
        }else {
            throw new IllegalStateException(PERSONA_NO_ACTUALIZADA);
        }
    }
}
