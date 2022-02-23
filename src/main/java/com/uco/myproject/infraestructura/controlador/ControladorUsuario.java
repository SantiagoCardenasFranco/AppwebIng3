package com.uco.myproject.infraestructura.controlador;

import com.uco.myproject.aplicacion.servicio.ServicioAplicacionGuardarUsuario;
import com.uco.myproject.aplicacion.servicio.ServicioAplicacionListarUsuario;
import com.uco.myproject.aplicacion.dto.DtoUsuario;
import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.dominio.modelo.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class ControladorUsuario {

    private final ServicioAplicacionListarUsuario servicioAplicacionListarUsuario;
    private final ServicioAplicacionGuardarUsuario servicioAplicacionGuardarUsuario;

    public ControladorUsuario(ServicioAplicacionListarUsuario servicioAplicacionListarUsuario,
                              ServicioAplicacionGuardarUsuario servicioAplicacionGuardarUsuario) {
        this.servicioAplicacionListarUsuario = servicioAplicacionListarUsuario;
        this.servicioAplicacionGuardarUsuario = servicioAplicacionGuardarUsuario;
    }

    @GetMapping
    public List<Usuario> listar() {
        return servicioAplicacionListarUsuario.ejecutar();
    }

    @PostMapping
    public DtoRespuesta<Long> crear(@RequestBody DtoUsuario dto) {
        return this.servicioAplicacionGuardarUsuario.ejecutar(dto);
    }
}
