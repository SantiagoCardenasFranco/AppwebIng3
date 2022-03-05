package com.uco.myproject.dominio.servicio;

import com.uco.myproject.dominio.modelo.Tamano;
import com.uco.myproject.dominio.modelo.Usuario;
import com.uco.myproject.dominio.puerto.RepositorioTamano;
import com.uco.myproject.dominio.puerto.RepositorioUsuario;
import com.uco.myproject.dominio.servicio.tamano.ServicioGuardarTamano;
import com.uco.myproject.dominio.servicio.usuario.ServicioGuardarUsuario;
import com.uco.myproject.dominio.testdatabuilder.TamanoTestDataBuilder;
import com.uco.myproject.dominio.testdatabuilder.UsuarioTestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ServicioGuardarTamanoTest {

    @Test
    void siNombreYaExisteDeberiaRetornarError() {

        //arrange
        var tamano = new TamanoTestDataBuilder().build();

        var repositorio = Mockito.mock(RepositorioTamano.class);
        var servicio = new ServicioGuardarTamano(repositorio);

        Mockito.when(repositorio.existe(Mockito.any())).thenReturn(true);

        //act - assert
        Assertions.assertEquals("Ya existe el tamanño con los datos ingresados",
                Assertions.assertThrows(IllegalStateException.class, () ->
            servicio.ejecutar(tamano)
        ).getMessage());

    }

    @Test
    void guardarExitoso() {

        // arrange
        var tamano = new TamanoTestDataBuilder().build();

        var repositorio = Mockito.mock(RepositorioTamano.class);
        var servicio = new ServicioGuardarTamano(repositorio);


        Mockito.when(repositorio.guardar(Mockito.any(Tamano.class))).thenReturn(1L);

        // act
        var id = servicio.ejecutar(tamano);

        // assert
        Mockito.verify(repositorio, Mockito.times(1)).guardar(tamano);
        Assertions.assertEquals(1L, id);

    }
}
