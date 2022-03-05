package com.uco.myproject.infraestructura.controlador;

import com.uco.myproject.aplicacion.dto.DtoTamano;
import com.uco.myproject.aplicacion.dto.respuesta.DtoRespuesta;
import com.uco.myproject.aplicacion.servicio.tamano.ServicioAplicacionGuardarTamano;
import com.uco.myproject.aplicacion.servicio.tamano.ServicioAplicacionListarTamano;
import com.uco.myproject.dominio.modelo.Tamano;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tamanos")
public class ControladorTamano {

    private final ServicioAplicacionGuardarTamano servicioAplicacionGuardarTamano;
    private final ServicioAplicacionListarTamano servicioAplicacionListarTamano;

    public ControladorTamano(ServicioAplicacionGuardarTamano servicioAplicacionGuardarTamano, ServicioAplicacionListarTamano servicioAplicacionListarTamano) {
        this.servicioAplicacionGuardarTamano = servicioAplicacionGuardarTamano;
        this.servicioAplicacionListarTamano = servicioAplicacionListarTamano;
    }

    @GetMapping
    public List<Tamano> listar() {
        return servicioAplicacionListarTamano.ejecutar();
    }

    @PostMapping
    public DtoRespuesta<Long> crear(@RequestBody DtoTamano dto) {
        return this.servicioAplicacionGuardarTamano.ejecutar(dto);
    }
}
