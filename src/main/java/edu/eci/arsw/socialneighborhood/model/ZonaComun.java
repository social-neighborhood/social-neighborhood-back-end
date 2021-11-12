package edu.eci.arsw.socialneighborhood.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zonacomun")
public class ZonaComun {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;

    public ZonaComun(){}
    public ZonaComun(String nombre) {
        this.nombre = nombre;
    }

    public ZonaComun(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
}
