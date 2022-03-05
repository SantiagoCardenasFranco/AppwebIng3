package com.uco.myproject.infraestructura.controlador;

import com.uco.myproject.aplicacion.dto.DtoTamano;
import com.uco.myproject.aplicacion.dto.respuesta.DtoRespuesta;
import com.uco.myproject.aplicacion.servicio.producto.ServicioAplicacionGuardarProducto;
import com.uco.myproject.aplicacion.servicio.producto.ServicioAplicacionListarProducto;
import com.uco.myproject.aplicacion.servicio.tamano.ServicioAplicacionGuardarTamano;
import com.uco.myproject.aplicacion.servicio.tamano.ServicioAplicacionListarTamano;
import com.uco.myproject.dominio.modelo.Producto;
import com.uco.myproject.dominio.modelo.Tamano;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ControladorProducto {

    private final ServicioAplicacionGuardarProducto servicioAplicacionGuardarProducto;
    private final ServicioAplicacionListarProducto servicioAplicacionListarProducto;

    public ControladorProducto(ServicioAplicacionGuardarProducto servicioAplicacionGuardarProducto,
                               ServicioAplicacionListarProducto servicioAplicacionListarProducto) {
        this.servicioAplicacionGuardarProducto = servicioAplicacionGuardarProducto;
        this.servicioAplicacionListarProducto = servicioAplicacionListarProducto;
    }

    @GetMapping
    public List<Producto> listar() {
        return servicioAplicacionListarProducto.ejecutar();
    }

/*    @PostMapping
    public DtoRespuesta<Long> crear(@RequestBody DtoProducto dto) {
        return this.servicioAplicacionGuardarProducto.ejecutar(dto);
    }*/
}
