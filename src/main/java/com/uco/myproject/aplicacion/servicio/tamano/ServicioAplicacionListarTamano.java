package com.uco.myproject.aplicacion.servicio.tamano;

import com.uco.myproject.dominio.modelo.Tamano;
import com.uco.myproject.dominio.puerto.RepositorioTamano;
import com.uco.myproject.dominio.validador.ValidadorHora;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionListarTamano {

    private final RepositorioTamano repositorioTamano;

    public ServicioAplicacionListarTamano(RepositorioTamano repositorioTamano) {
        this.repositorioTamano = repositorioTamano;
    }

    public List<Tamano> ejecutar() {
        ValidadorHora.validarHora();
        return this.repositorioTamano.listar();
    }
}
