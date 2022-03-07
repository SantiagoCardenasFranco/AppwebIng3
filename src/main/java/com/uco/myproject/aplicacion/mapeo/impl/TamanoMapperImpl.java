package com.uco.myproject.aplicacion.mapeo.impl;

import com.uco.myproject.aplicacion.dto.DtoTamano;
import com.uco.myproject.aplicacion.mapeo.TamanoMaper;
import com.uco.myproject.dominio.modelo.Tamano;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadTamano;

public class TamanoMapperImpl implements TamanoMaper {

    @Override
    public DtoTamano tamanoADtoTamano(Tamano tamano) {
        if(tamano == null){
            return null;
        }
        DtoTamano dtoTamano = new DtoTamano();
        dtoTamano.setNombre(tamano.getNombre());
        dtoTamano.setEspecificacion(tamano.getEspecificacion());
        return dtoTamano;
    }

    @Override
    public EntidadTamano tamanoAEntidadTamano(Tamano tamano) {
        if(tamano == null){
            return null;
        }

        EntidadTamano entidadTamano = new EntidadTamano();

        entidadTamano.setNombre(tamano.getNombre());
        entidadTamano.setEspecificacion(tamano.getEspecificacion());
        return entidadTamano;
    }

    @Override
    public Tamano dtoTamanoATamano(DtoTamano dtoTamano) {
        if(dtoTamano == null){
            return null;
        }
        return Tamano.of(dtoTamano.getNombre(), dtoTamano.getEspecificacion());
    }

    @Override
    public Tamano entidadTamanoATamano(EntidadTamano entidadTamano) {
        if(entidadTamano == null){
            return null;
        }
        return Tamano.of(entidadTamano.getNombre(), entidadTamano.getEspecificacion());
    }
}
