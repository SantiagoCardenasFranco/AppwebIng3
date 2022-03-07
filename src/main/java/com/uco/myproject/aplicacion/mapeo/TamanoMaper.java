package com.uco.myproject.aplicacion.mapeo;

import com.uco.myproject.aplicacion.dto.DtoCaracteristica;
import com.uco.myproject.aplicacion.dto.DtoTamano;
import com.uco.myproject.dominio.modelo.Caracteristica;
import com.uco.myproject.dominio.modelo.Tamano;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadCaracteristica;
import com.uco.myproject.infraestructura.adaptador.entidad.EntidadTamano;
import org.mapstruct.factory.Mappers;

public interface TamanoMaper {

    TamanoMaper INSTANCIA = Mappers.getMapper(TamanoMaper.class);

    DtoTamano tamanoADtoTamano (Tamano tamano);
    EntidadTamano tamanoAEntidadTamano (Tamano tamano);
    Tamano dtoTamanoATamano (DtoTamano dtoTamano);
    Tamano entidadTamanoATamano (EntidadTamano entidadTamano);
}
