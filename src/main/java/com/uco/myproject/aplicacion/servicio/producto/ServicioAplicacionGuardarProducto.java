package com.uco.myproject.aplicacion.servicio.producto;

import com.uco.myproject.aplicacion.dto.DtoProducto;
import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.aplicacion.dto.DtoUsuario;
import com.uco.myproject.dominio.modelo.Producto;
import com.uco.myproject.dominio.modelo.Usuario;
import com.uco.myproject.dominio.servicio.ServicioGuardarProducto;
import com.uco.myproject.dominio.servicio.ServicioGuardarUsuario;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionGuardarProducto {

/*    private final ServicioGuardarProducto servicioGuardarProducto;

    public ServicioAplicacionGuardarProducto(ServicioGuardarProducto servicioGuardarProducto) {
        this.servicioGuardarProducto = servicioGuardarProducto;
    }

    public DtoRespuesta<Long> ejecutar(DtoProducto dto) {

        Producto producto = Producto.of(dto.getNombre(), dto.getUsuario());

        return new DtoRespuesta<>(this.servicioGuardarProducto.ejecutar(producto));
    }*/
}
