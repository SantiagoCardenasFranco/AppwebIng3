package com.uco.myproject.infraestructura.adaptador.entidad;

import com.uco.myproject.dominio.modelo.Usuario;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class EntidadProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idProducto;

    private String nombre;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private EntidadUsuario entidadUsuario;

    public EntidadProducto() {
    }

    public EntidadProducto(String nombre, EntidadUsuario entidadUsuario) {
        this.nombre = nombre;
        this.entidadUsuario = entidadUsuario;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public EntidadUsuario getEntidadUsuario() {
        return entidadUsuario;
    }
}
