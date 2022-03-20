package com.uco.myproject.dominio.servicio.caracteristica;

import com.uco.myproject.dominio.modelo.Caracteristica;
import com.uco.myproject.dominio.puerto.RepositorioCaracteristica;
import com.uco.myproject.dominio.validador.ValidadorHora;
import org.springframework.stereotype.Service;

@Service
public class ServicioActualizarCaracteristica {

    private static final String CARACTERISTICA_ACTUALIZADA = "NO SE ENCONTRÓ LA CARACTERISTICA O NO EXISTE";

    private final RepositorioCaracteristica repositorioCaracteristica;

    public ServicioActualizarCaracteristica(RepositorioCaracteristica repositorioCaracteristica)
    {
        this.repositorioCaracteristica = repositorioCaracteristica;
    }

    public Boolean ejecutar(Long id, Caracteristica caracteristica){
        if(repositorioCaracteristica.consultarPorId(id) != null){
            ValidadorHora.validarHora();
            return this.repositorioCaracteristica.actualizar(id, caracteristica);
        }else {
            throw new IllegalStateException(CARACTERISTICA_ACTUALIZADA);
        }
    }
}
