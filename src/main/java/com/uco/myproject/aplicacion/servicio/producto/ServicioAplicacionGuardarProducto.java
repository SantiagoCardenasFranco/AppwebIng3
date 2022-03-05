package com.uco.myproject.aplicacion.servicio.producto;

import com.uco.myproject.aplicacion.dto.DtoProducto;
import com.uco.myproject.aplicacion.dto.DtoUsuario;
import com.uco.myproject.aplicacion.dto.respuesta.DtoRespuesta;
import com.uco.myproject.aplicacion.mapeo.UsuarioMaper;
import com.uco.myproject.aplicacion.mapeo.impl.UsuarioMapperImpl;
import com.uco.myproject.dominio.modelo.Producto;
import com.uco.myproject.dominio.modelo.Usuario;
import com.uco.myproject.dominio.servicio.producto.ServicioGuardarProducto;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadProducto;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionGuardarProducto {

    private final ServicioGuardarProducto servicioGuardarProducto;

    public ServicioAplicacionGuardarProducto(ServicioGuardarProducto servicioGuardarProducto) {
        this.servicioGuardarProducto = servicioGuardarProducto;
    }

    public DtoRespuesta<Long> ejecutar(EntidadProducto dto) {

        /*DtoUsuario dtoUsuario = new DtoUsuario();
        DtoUsuario dtoUsuario = UsuarioMaper.INSTANCIA.dtoUsuarioAUsuario(new DtoUsuario());*/
        EntidadProducto entidadProducto = new EntidadProducto(dto.getNombre(),
                dto.getEntidadUsuario(), dto.getEntidadCaracteristica());
        //Producto producto = Producto.of(dto.getNombre(), dto.getUsuario(), dto.getCaracteristica());

        return new DtoRespuesta<>(this.servicioGuardarProducto.ejecutar(entidadProducto));
    }
}
