package com.uco.myproject.aplicacion.servicio.producto;

import com.uco.myproject.aplicacion.dto.DtoProducto;
import com.uco.myproject.aplicacion.dto.respuesta.DtoRespuesta;
import com.uco.myproject.aplicacion.mapeo.impl.CaracteristicaMapperImpl;
import com.uco.myproject.aplicacion.mapeo.impl.UsuarioMapperImpl;
import com.uco.myproject.dominio.modelo.Producto;
import com.uco.myproject.dominio.servicio.producto.ServicioGuardarProducto;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionGuardarProducto {

    private final ServicioGuardarProducto servicioGuardarProducto;

    public ServicioAplicacionGuardarProducto(ServicioGuardarProducto servicioGuardarProducto) {
        this.servicioGuardarProducto = servicioGuardarProducto;
    }

    public DtoRespuesta<Long> ejecutar(DtoProducto dto) {
        Producto producto = Producto.of(dto.getNombre(),
                UsuarioMapperImpl.INSTANCIA.dtoUsuarioAUsuario(dto.getDtoUsuario()),
                CaracteristicaMapperImpl.INSTANCIA.dtoCaracteristicaACaracteristica(dto.getDtoCaracteristica()));

        return new DtoRespuesta<>(this.servicioGuardarProducto.ejecutar(producto));
    }
}
