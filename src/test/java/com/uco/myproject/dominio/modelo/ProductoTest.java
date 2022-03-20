package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductoTest {

    @Test
    void validarCreacionExitosa() {
        //patron 3a

        //arrange (prepara todos los datos para la prueba)
        String nombre = "ProductoUno";
        Usuario usuario = Usuario.of("Santiago", "Cárdenas",
                "santicarfranco8@gmmail.com","w3Unpo<code>t0d0");

        Caracteristica caracteristica = Caracteristica.of("LG", "Fundada en algún año",
                Tamano.of("Grande", "Va desde 32cm a 52cm"), "Gerente de LG");

        //act (ejecuta el metodo a probar)
        Producto producto = Producto.of(nombre, usuario, caracteristica);

        //assert se valida el resultado

        Assertions.assertEquals("ProductoUno", producto.getNombre());
        Assertions.assertEquals("Santiago", producto.getUsuario().getNombre());
        Assertions.assertEquals("LG", producto.getCaracteristica().getMarca());
    }

    @Test
    void validarCamposFaltantes() {
        //patron 3a

        //arrange (prepara todos los datos para la prueba)
        String nombre = null;
        Usuario usuario = Usuario.of("Santiago", "Cárdenas",
                "santicarfranco8@gmmail.com","w3Unpo<code>t0d0");
        Caracteristica caracteristica = Caracteristica.of("LG", "Fundada en algún año",
                Tamano.of("Grande", "Va desde 32cm a 52cm"), "Gerente de LG");

        //act - assert (ejecuta el metodo a probar)

        Assertions.assertEquals("El nombre no puede ser vacio",Assertions.assertThrows(IllegalArgumentException.class, () ->
                Producto.of(nombre, usuario, caracteristica)
        ).getMessage());
    }

    @Test
    void validarCamposVacios() {
        //patron 3a

        //arrange (prepara todos los datos para la prueba)
        String nombre = "";
        Usuario usuario = Usuario.of("Santiago", "Cárdenas",
                "santicarfranco8@gmmail.com","w3Unpo<code>t0d0");
        Caracteristica caracteristica = Caracteristica.of("LG", "Fundada en algún año",
                Tamano.of("Grande", "Va desde 32cm a 52cm"), "Gerente de LG");

        //act - assert (ejecuta el metodo a probar)

        Assertions.assertEquals("El nombre no puede ser vacio",Assertions.assertThrows(IllegalArgumentException.class, () ->
                Producto.of(nombre, usuario, caracteristica)
        ).getMessage());
    }
}
