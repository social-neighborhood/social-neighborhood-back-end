package edu.eci.arsw.socialneighborhood.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipoinmueble")
public class tipoInmueble {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;

    public tipoInmueble(String nombre) {
        this.nombre = nombre;
    }

    public tipoInmueble(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public tipoInmueble(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "TipoInmueble{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
