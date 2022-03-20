package com.uco.myproject.dominio.servicio.caracteristica;

import com.uco.myproject.dominio.modelo.Caracteristica;
import com.uco.myproject.dominio.modelo.Producto;
import com.uco.myproject.dominio.puerto.RepositorioCaracteristica;
import com.uco.myproject.dominio.puerto.RepositorioProducto;
import com.uco.myproject.dominio.puerto.RepositorioUsuario;
import com.uco.myproject.dominio.servicio.producto.ServicioGuardarProducto;
import com.uco.myproject.dominio.servicio.usuario.ServicioGuardarUsuario;
import com.uco.myproject.dominio.testdatabuilder.CaracteristicaTestDataBuilder;
import com.uco.myproject.dominio.testdatabuilder.ProductoTestDataBuilder;
import com.uco.myproject.dominio.testdatabuilder.UsuarioTestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ServicioGuardarCaracteristicaTest {

    @Test
    void siNombreYaExisteDeberiaRetornarError() {

        //arrange
        var caracteristica = new CaracteristicaTestDataBuilder().build();

        var repositorio = Mockito.mock(RepositorioCaracteristica.class);
        var servicio = new ServicioGuardarCaracteristica(repositorio);

        Mockito.when(repositorio.existe(Mockito.any())).thenReturn(true);

        //act - assert
        Assertions.assertEquals("Ya existe una caracteristca con los datos ingresados",
                Assertions.assertThrows(IllegalStateException.class, () ->
                        servicio.ejecutar(caracteristica)
                ).getMessage());

    }

    @Test
    void guardarExitoso() {

        // arrange
        var caracteristica = new CaracteristicaTestDataBuilder().build();

        var repositorio = Mockito.mock(RepositorioCaracteristica.class);
        var servicio = new ServicioGuardarCaracteristica(repositorio);


        Mockito.when(repositorio.guardar(Mockito.any(Caracteristica.class))).thenReturn(1L);

        // act
        var id = servicio.ejecutar(caracteristica);

        // assert
        Mockito.verify(repositorio, Mockito.times(1)).guardar(caracteristica);
        Assertions.assertEquals(1L, id);

    }
}
