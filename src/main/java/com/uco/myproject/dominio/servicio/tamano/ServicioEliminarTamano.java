package com.uco.myproject.dominio.servicio.tamano;

import com.uco.myproject.dominio.puerto.RepositorioTamano;
import com.uco.myproject.dominio.validador.ValidadorHora;
import org.springframework.stereotype.Service;

@Service
public class ServicioEliminarTamano {

    private static final String MENSAJE_NO_EXISTE = "El tamaño que intenta eliminar no está en el repositorio";

    private final RepositorioTamano repositorioTamano;

    public ServicioEliminarTamano(RepositorioTamano repositorioTamano){
        this.repositorioTamano = repositorioTamano;
    }

    public Boolean ejecutar(Long id) {
        if(repositorioTamano.consultarPorId(id) != null) {
            ValidadorHora.validarHora();
            return this.repositorioTamano.eliminar(id);
        }else{
            throw new IllegalStateException(MENSAJE_NO_EXISTE);
        }
    }
}
