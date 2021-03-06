package edu.eci.arsw.socialneighborhood.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipoinmuebleconjunto")
public class TipoInmuebleConjunto {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "idtipoinmueble")
    private Integer idTipoInmueble;
    @Column(name = "idconjunto")
    private Integer idConjunto;

    public TipoInmuebleConjunto(){}
    public TipoInmuebleConjunto(Integer idTipoInmueble, Integer idConjunto) {
        this.idTipoInmueble = idTipoInmueble;
        this.idConjunto = idConjunto;
    }

    public TipoInmuebleConjunto(Integer id, Integer idTipoInmueble, Integer idConjunto) {
        this.id = id;
        this.idTipoInmueble = idTipoInmueble;
        this.idConjunto = idConjunto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdTipoInmueble() {
        return idTipoInmueble;
    }

    public void setIdTipoInmueble(Integer idTipoInmueble) {
        this.idTipoInmueble = idTipoInmueble;
    }

    public Integer getIdConjunto() {
        return idConjunto;
    }

    public void setIdConjunto(Integer idConjunto) {
        this.idConjunto = idConjunto;
    }

    @Override
    public String toString() {
        return "tipoInmuebleConjunto{" +
                "id=" + id +
                ", idTipoInmueble=" + idTipoInmueble +
                ", idConjunto='" + idConjunto + '\'' +
                '}';
    }
}
