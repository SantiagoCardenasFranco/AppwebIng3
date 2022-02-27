package com.uco.myproject.infraestructura.adaptador.entidad;

import javax.persistence.*;

@Entity
@Table(name = "caracteristica")
public class EntidadCaracteristica {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String marca;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "tamano_id")
    private EntidadTamano entidadTamano;

    private String nombreProveedor;

    public EntidadCaracteristica() {}

    public EntidadCaracteristica(String marca, String descripcion,
                                 EntidadTamano entidadTamano, String nombreProveedor) {
        this.marca = marca;
        this.descripcion = descripcion;
        this.entidadTamano = entidadTamano;
        this.nombreProveedor = nombreProveedor;
    }

    public Long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public EntidadTamano getEntidadTamano() {
        return entidadTamano;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEntidadTamano(EntidadTamano entidadTamano) {
        this.entidadTamano = entidadTamano;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
}
