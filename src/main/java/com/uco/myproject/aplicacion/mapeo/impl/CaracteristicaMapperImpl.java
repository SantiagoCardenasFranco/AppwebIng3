package com.uco.myproject.aplicacion.mapeo.impl;

import com.uco.myproject.aplicacion.dto.DtoCaracteristica;
import com.uco.myproject.aplicacion.mapeo.CaracteristicaMaper;
import com.uco.myproject.dominio.modelo.Caracteristica;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadCaracteristica;

public class CaracteristicaMapperImpl implements CaracteristicaMaper {
    @Override
    public DtoCaracteristica caracteristicaADtoCaracteristica(Caracteristica caracteristica) {
        if(caracteristica == null){
            return null;
        }
        DtoCaracteristica dtoCaracteristica = new DtoCaracteristica();
        dtoCaracteristica.setMarca(caracteristica.getMarca());
        dtoCaracteristica.setDescripcion(caracteristica.getDescripcion());
        dtoCaracteristica.setDtoTamano(TamanoMapperImpl.INSTANCIA.tamanoADtoTamano(caracteristica.getTamano()));
        dtoCaracteristica.setProveedor(caracteristica.getProveedor());
        return dtoCaracteristica;
    }

    @Override
    public EntidadCaracteristica caracteristicaAEntidadCaracteristica(Caracteristica caracteristica) {
        if(caracteristica == null){
            return null;
        }
        EntidadCaracteristica entidadCaracteristica = new EntidadCaracteristica();
        entidadCaracteristica.setMarca(caracteristica.getMarca());
        entidadCaracteristica.setDescripcion(caracteristica.getDescripcion());
        entidadCaracteristica.setEntidadTamano(TamanoMapperImpl.INSTANCIA.tamanoAEntidadTamano(caracteristica.getTamano()));
        entidadCaracteristica.setNombreProveedor(caracteristica.getProveedor());
        return entidadCaracteristica;
    }

    @Override
    public Caracteristica dtoCaracteristicaACaracteristica(DtoCaracteristica dtoCaracteristica) {
        if(dtoCaracteristica == null){
            return null;
        }
        return Caracteristica.of(dtoCaracteristica.getMarca(),
                dtoCaracteristica.getDescripcion(),
                TamanoMapperImpl.INSTANCIA.dtoTamanoATamano(dtoCaracteristica.getDtoTamano()),
                dtoCaracteristica.getProveedor());
    }

    @Override
    public Caracteristica entidadCaracteristicaACaracteristica(EntidadCaracteristica entidadCaracteristica) {
        if(entidadCaracteristica == null){
            return null;
        }
        return Caracteristica.of(entidadCaracteristica.getMarca(),
                entidadCaracteristica.getDescripcion(),
                TamanoMapperImpl.INSTANCIA.entidadTamanoATamano(entidadCaracteristica.getEntidadTamano()),
                entidadCaracteristica.getNombreProveedor());
    }
}
