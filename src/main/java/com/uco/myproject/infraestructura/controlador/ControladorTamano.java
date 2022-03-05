package com.uco.myproject.infraestructura.controlador;

import com.uco.myproject.aplicacion.dto.DtoTamano;
import com.uco.myproject.aplicacion.dto.DtoUsuario;
import com.uco.myproject.aplicacion.dto.respuesta.DtoRespuesta;
import com.uco.myproject.aplicacion.servicio.tamano.ServicioAplicacionGuardarTamano;
import com.uco.myproject.dominio.modelo.Tamano;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tamanos")
public class ControladorTamano {

    private final ServicioAplicacionGuardarTamano servicioAplicacionGuardarTamano;

    public ControladorTamano(ServicioAplicacionGuardarTamano servicioAplicacionGuardarTamano) {
        this.servicioAplicacionGuardarTamano = servicioAplicacionGuardarTamano;
    }

    /*@GetMapping
    public List<Tamano> listar() {
        return servicioAplicacionGuardarTamano.ejecutar();
    }*/

    @PostMapping
    public DtoRespuesta<Long> crear(@RequestBody DtoTamano dto) {
        return this.servicioAplicacionGuardarTamano.ejecutar(dto);
    }
}
