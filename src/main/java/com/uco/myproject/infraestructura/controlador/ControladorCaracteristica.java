package com.uco.myproject.infraestructura.controlador;

import com.uco.myproject.aplicacion.dto.DtoCaracteristica;
import com.uco.myproject.aplicacion.dto.respuesta.DtoRespuesta;
import com.uco.myproject.aplicacion.servicio.caracteristica.ServicioAplicacionActualizarCaracteristica;
import com.uco.myproject.aplicacion.servicio.caracteristica.ServicioAplicacionEliminarCaracteristica;
import com.uco.myproject.aplicacion.servicio.caracteristica.ServicioAplicacionGuardarCaracteristica;
import com.uco.myproject.aplicacion.servicio.caracteristica.ServicioAplicacionListarCaracteristica;
import com.uco.myproject.dominio.modelo.Caracteristica;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/caracteristicas")
public class ControladorCaracteristica {

    private final ServicioAplicacionListarCaracteristica servicioAplicacionListarCaracteristica;
    private final ServicioAplicacionGuardarCaracteristica servicioAplicacionGuardarCaracteristica;
    private final ServicioAplicacionEliminarCaracteristica servicioAplicacionEliminarCaracteristica;
    private final ServicioAplicacionActualizarCaracteristica servicioAplicacionActualizarCaracteristica;

    public ControladorCaracteristica(ServicioAplicacionListarCaracteristica servicioAplicacionListarCaracteristica, ServicioAplicacionGuardarCaracteristica servicioAplicacionGuardarCaracteristica, ServicioAplicacionEliminarCaracteristica servicioAplicacionEliminarCaracteristica, ServicioAplicacionActualizarCaracteristica servicioAplicacionActualizarCaracteristica) {
        this.servicioAplicacionListarCaracteristica = servicioAplicacionListarCaracteristica;
        this.servicioAplicacionGuardarCaracteristica = servicioAplicacionGuardarCaracteristica;
        this.servicioAplicacionEliminarCaracteristica = servicioAplicacionEliminarCaracteristica;
        this.servicioAplicacionActualizarCaracteristica = servicioAplicacionActualizarCaracteristica;
    }

    @GetMapping
    public List<Caracteristica> listar() {
        return servicioAplicacionListarCaracteristica.ejecutar();
    }

   @PostMapping
    public DtoRespuesta<Long> crear(@RequestBody DtoCaracteristica dto) {
        return this.servicioAplicacionGuardarCaracteristica.ejecutar(dto);
    }

    @DeleteMapping(value = "/{id}")
    public DtoRespuesta<Boolean> eliminar(@PathVariable Long id) {
        return this.servicioAplicacionEliminarCaracteristica.ejecutar(id);
    }

    @PutMapping(value = "/{id}")
    public DtoRespuesta<Boolean> actualizar(@PathVariable Long id, @RequestBody DtoCaracteristica dto){
        return this.servicioAplicacionActualizarCaracteristica.ejecutar(id,dto);
    }
}
