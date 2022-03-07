package com.uco.myproject.infraestructura.controlador;

import com.uco.myproject.aplicacion.dto.DtoCaracteristica;
import com.uco.myproject.aplicacion.dto.respuesta.DtoRespuesta;
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

    public ControladorCaracteristica(ServicioAplicacionListarCaracteristica servicioAplicacionListarCaracteristica, ServicioAplicacionGuardarCaracteristica servicioAplicacionGuardarCaracteristica) {
        this.servicioAplicacionListarCaracteristica = servicioAplicacionListarCaracteristica;
        this.servicioAplicacionGuardarCaracteristica = servicioAplicacionGuardarCaracteristica;
    }

    @GetMapping
    public List<Caracteristica> listar() {
        return servicioAplicacionListarCaracteristica.ejecutar();
    }

   @PostMapping
    public DtoRespuesta<Long> crear(@RequestBody DtoCaracteristica dto) {
        return this.servicioAplicacionGuardarCaracteristica.ejecutar(dto);
    }
}
