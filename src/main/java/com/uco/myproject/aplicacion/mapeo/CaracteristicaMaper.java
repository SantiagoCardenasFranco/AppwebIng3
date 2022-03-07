package com.uco.myproject.aplicacion.mapeo;

import com.uco.myproject.aplicacion.dto.DtoCaracteristica;
import com.uco.myproject.dominio.modelo.Caracteristica;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadCaracteristica;
import org.mapstruct.factory.Mappers;

public interface CaracteristicaMaper {

    CaracteristicaMaper INSTANCIA = Mappers.getMapper(CaracteristicaMaper.class);

    DtoCaracteristica caracteristicaADtoCaracteristica (Caracteristica caracteristica);
    EntidadCaracteristica caracteristicaAEntidadCaracteristica (Caracteristica caracteristica);
    Caracteristica dtoCaracteristicaACaracteristica (DtoCaracteristica dtoCaracteristica);
    Caracteristica entidadCaracteristicaACaracteristica (EntidadCaracteristica entidadCaracteristica);
}
