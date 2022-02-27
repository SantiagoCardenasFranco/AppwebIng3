package com.uco.myproject.aplicacion.servicio.usuario;

import com.uco.myproject.aplicacion.dto.respuesta.DtoRespuesta;
import com.uco.myproject.aplicacion.dto.DtoUsuario;
import com.uco.myproject.dominio.modelo.Usuario;
import com.uco.myproject.dominio.servicio.usuario.ServicioActualizarUsuario;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionActualizarUsuario {

    private final ServicioActualizarUsuario servicioActualizarUsuario;

    public ServicioAplicacionActualizarUsuario(ServicioActualizarUsuario servicioActualizarUsuario) {
        this.servicioActualizarUsuario = servicioActualizarUsuario;
    }

    public DtoRespuesta<Boolean> ejecutar(Long id, DtoUsuario dto) {
        Usuario usuario = Usuario.of(dto.getNombre(), dto.getApellido(), dto.getCorreo(), dto.getPassword());
        return new DtoRespuesta<>(this.servicioActualizarUsuario.ejecutar(id,usuario));
    }
}
