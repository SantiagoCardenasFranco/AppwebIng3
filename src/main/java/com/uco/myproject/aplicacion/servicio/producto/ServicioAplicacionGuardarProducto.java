package com.uco.myproject.aplicacion.servicio.producto;

import com.uco.myproject.aplicacion.dto.DtoProducto;
import com.uco.myproject.aplicacion.dto.respuesta.DtoRespuesta;
import com.uco.myproject.dominio.modelo.Caracteristica;
import com.uco.myproject.dominio.modelo.Producto;
import com.uco.myproject.dominio.modelo.Tamano;
import com.uco.myproject.dominio.modelo.Usuario;
import com.uco.myproject.dominio.servicio.producto.ServicioGuardarProducto;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionGuardarProducto {

    private final ServicioGuardarProducto servicioGuardarProducto;

    public ServicioAplicacionGuardarProducto(ServicioGuardarProducto servicioGuardarProducto) {
        this.servicioGuardarProducto = servicioGuardarProducto;
    }

    public DtoRespuesta<Long> ejecutar(DtoProducto dto) {
        Usuario usuario = Usuario.of(dto.getDtoUsuario().getNombre(),
                dto.getDtoUsuario().getApellido(),
                dto.getDtoUsuario().getCorreo(),
                dto.getDtoUsuario().getPassword());
        Tamano tamano = Tamano.of(dto.getDtoCaracteristica().getDtoTamano().getNombre(),
                dto.getDtoCaracteristica().getDtoTamano().getEspecificacion());
        Caracteristica caracteristica = Caracteristica.of(dto.getDtoCaracteristica().getMarca(),
                dto.getDtoCaracteristica().getDescripcion(),
                tamano, dto.getDtoCaracteristica().getProveedor());
        Producto producto = Producto.of(dto.getNombre(),usuario, caracteristica);
        return new DtoRespuesta<>(this.servicioGuardarProducto.ejecutar(producto));
    }
}
