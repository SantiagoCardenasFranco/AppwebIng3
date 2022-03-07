package com.uco.myproject.dominio.mapeo;

import com.uco.myproject.aplicacion.dto.DtoTamano;
import com.uco.myproject.aplicacion.mapeo.impl.TamanoMapperImpl;
import com.uco.myproject.dominio.modelo.Tamano;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapeoTamanoTest {

    //@Test
    public void mapeoTest(){
        Tamano tamano = Tamano.of("Grande", "Va desde 30 a 50 cm");

        DtoTamano dtoTamano = TamanoMapperImpl.INSTANCIA.tamanoADtoTamano(tamano);

        assertEquals("Grande", dtoTamano.getNombre());
        assertEquals("Va desde 30 a 50 cm", dtoTamano.getEspecificacion());
    }
}
