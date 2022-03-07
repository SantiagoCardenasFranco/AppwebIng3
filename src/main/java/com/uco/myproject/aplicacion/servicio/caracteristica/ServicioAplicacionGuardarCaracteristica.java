package com.uco.myproject.aplicacion.servicio.caracteristica;

import com.uco.myproject.aplicacion.dto.DtoCaracteristica;
import com.uco.myproject.aplicacion.dto.DtoUsuario;
import com.uco.myproject.aplicacion.dto.respuesta.DtoRespuesta;
import com.uco.myproject.dominio.modelo.Caracteristica;
import com.uco.myproject.dominio.modelo.Usuario;
import com.uco.myproject.dominio.servicio.caracteristica.ServicioGuardarCaracteristica;
import com.uco.myproject.dominio.servicio.usuario.ServicioGuardarUsuario;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionGuardarCaracteristica {

    private final ServicioGuardarCaracteristica servicioGuardarCaracteristica;

    public ServicioAplicacionGuardarCaracteristica(ServicioGuardarCaracteristica servicioGuardarCaracteristica) {
        this.servicioGuardarCaracteristica = servicioGuardarCaracteristica;
    }

    /*public DtoRespuesta<Long> ejecutar(DtoCaracteristica dto) {

        Caracteristica caracteristica = Caracteristica.of(dto.getMarca(), dto.getDescripcion(),
                dto.getDtoTamano(), dto.getProveedor());

        return new DtoRespuesta<>(this.servicioGuardarCaracteristica.ejecutar(caracteristica));
    }*/
}
