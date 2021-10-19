package edu.eci.arsw.socialneighborhood.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipoagrupacionconjunto")
public class tipoAgrupacionConjunto {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "idtipoagrupacion")
    private Integer idTipoAgrupacion;
    @Column(name = "idconjunto")
    private Integer idConjunto;


    public tipoAgrupacionConjunto(Integer idTipoAgrupacion, Integer idConjunto) {
        this.idTipoAgrupacion = idTipoAgrupacion;
        this.idConjunto = idConjunto;
    }

    public tipoAgrupacionConjunto(Integer id, Integer idTipoAgrupacion, Integer idConjunto) {
        this.id = id;
        this.idTipoAgrupacion = idTipoAgrupacion;
        this.idConjunto = idConjunto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdTipoAgrupacion() {
        return idTipoAgrupacion;
    }

    public void setIdTipoAgrupacion(Integer idTipoAgrupacion) {
        this.idTipoAgrupacion = idTipoAgrupacion;
    }

    public Integer getNombre() {
        return idConjunto;
    }

    public void setNombre(Integer idConjunto) {
        this.idConjunto = idConjunto;
    }

    @Override
    public String toString() {
        return "tipoAgrupacionConjunto{" +
                "id=" + id +
                ", idTipoAgrupacion=" + idTipoAgrupacion +
                ", idConjunto='" + idConjunto + '\'' +
                '}';
    }
}
