package com.uco.myproject.dominio.servicio.tamano;

import com.uco.myproject.dominio.modelo.Tamano;
import com.uco.myproject.dominio.puerto.RepositorioTamano;
import com.uco.myproject.dominio.servicio.tamano.ServicioGuardarTamano;
import com.uco.myproject.dominio.testdatabuilder.TamanoTestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ServicioGuardarTamanoTest {

    @Test
    void guardarExitoso() {

        // arrange
        var tamano = new TamanoTestDataBuilder().build();

        var repositorio = Mockito.mock(RepositorioTamano.class);
        var servicio = new ServicioGuardarTamano(repositorio);


        Mockito.when(repositorio.guardar(Mockito.any(Tamano.class))).thenReturn(1l);

        // act
        var id = servicio.ejecutar(tamano);

        // assert
        Mockito.verify(repositorio, Mockito.times(1)).guardar(tamano);
        Assertions.assertEquals(1l, id);

    }
}
