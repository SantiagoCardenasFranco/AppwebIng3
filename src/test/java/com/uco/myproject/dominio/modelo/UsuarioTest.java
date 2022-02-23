package com.uco.myproject.dominio.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UsuarioTest {

    @Test
    void validarCreacionExitosa() {
        //patron 3a

        //arrange (prepara todos los datos para la prueba)
        String nombre = "juan";
        String apellido = "castaño";
        String correo = "jrsbjhfd";
        String password = "jydfbdsjhb";

        //act (ejecuta el metodo a probar)
        Usuario usuario = Usuario.of(nombre, apellido, correo, password);

        //assert se valida el resultado

        Assertions.assertEquals("juan", usuario.getNombre());
        Assertions.assertEquals("castaño", usuario.getApellido());
    }

    @Test
    void validarCamposFaltantes() {
        //patron 3a

        //arrange (prepara todos los datos para la prueba)
        String nombre = null;
        String apellido = "castaño";
        String correo = "jrsbjhfd";
        String password = "jydfbdsjhb";

        //act - assert (ejecuta el metodo a probar)

        Assertions.assertEquals("El nombre no puede ser vacio",Assertions.assertThrows(IllegalArgumentException.class, () ->
            Usuario.of(nombre, apellido, correo, password)
        ).getMessage());
    }

    @Test
    void validarCamposVacios() {
        //patron 3a

        //arrange (prepara todos los datos para la prueba)
        String nombre = "";
        String apellido = "castaño";
        String correo = "jrsbjhfd";
        String password = "jydfbdsjhb";

        //act - assert (ejecuta el metodo a probar)

        Assertions.assertEquals("El nombre no puede ser vacio",Assertions.assertThrows(IllegalArgumentException.class, () ->
                Usuario.of(nombre, apellido, correo, password)
        ).getMessage());
    }
}
