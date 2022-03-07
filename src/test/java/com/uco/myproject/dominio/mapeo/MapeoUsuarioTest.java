package com.uco.myproject.dominio.mapeo;

import com.uco.myproject.aplicacion.dto.DtoUsuario;
import com.uco.myproject.aplicacion.mapeo.UsuarioMaper;
import com.uco.myproject.dominio.modelo.Usuario;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MapeoUsuarioTest {

    //@Test
     void mapeoTest(){
        Usuario usuario = Usuario.of("Santiago", "Cárdenas Franco",
                "hsdgahsdbjs", "skhdbcsjhb");

        DtoUsuario dtoUsuario = UsuarioMaper.INSTANCIA.usuarioAUsuarioDto(usuario);

        assertEquals("Santiago", dtoUsuario.getNombre());
        assertEquals("Cárdenas Franco", dtoUsuario.getApellido());
        assertEquals("hsdgahsdbjs", dtoUsuario.getCorreo());
        assertEquals("skhdbcsjhb", dtoUsuario.getPassword());
    }
}
