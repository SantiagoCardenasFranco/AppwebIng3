package com.uco.myproject.infraestructura.controlador;

import com.uco.myproject.aplicacion.servicio.caracteristica.ServicioAplicacionListarCaracteristica;
import com.uco.myproject.aplicacion.servicio.producto.ServicioAplicacionGuardarProducto;
import com.uco.myproject.aplicacion.servicio.producto.ServicioAplicacionListarProducto;
import com.uco.myproject.dominio.modelo.Caracteristica;
import com.uco.myproject.dominio.modelo.Producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/caracteristicas")
public class ControladorCaracteristica {

    private final ServicioAplicacionListarCaracteristica servicioAplicacionListarCaracteristica;

    public ControladorCaracteristica(ServicioAplicacionListarCaracteristica servicioAplicacionListarCaracteristica) {
        this.servicioAplicacionListarCaracteristica = servicioAplicacionListarCaracteristica;
    }

    @GetMapping
    public List<Caracteristica> listar() {
        return servicioAplicacionListarCaracteristica.ejecutar();
    }

   /*@PostMapping
    public DtoRespuesta<Long> crear(@RequestBody DtoProducto dto) {
       //UsuarioMapperImpl.INSTANCIA.DtoUsuarioAEntidadUsuario(dto);
        return this.servicioAplicacionGuardarProducto.ejecutar(dto);
    }*/
}
