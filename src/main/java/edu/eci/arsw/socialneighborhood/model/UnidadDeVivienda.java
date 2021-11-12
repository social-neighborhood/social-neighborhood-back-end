package edu.eci.arsw.socialneighborhood.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "unidaddevivienda")
public class UnidadDeVivienda {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "idagrupacion")
    private Integer idAgrupacion;
    @Column(name = "idtipoinmuebleconjunto")
    private Integer idTipoInmuebleConjunto;
    @Column(name = "numinmueble")
    private String numInmueble;
    @Column(name = "costoadministracion")
    private Integer costoAdministracion;

    public UnidadDeVivienda(){}
    public UnidadDeVivienda(Integer idAgrupacion, Integer idTipoInmuebleConjunto, String numInmueble, Integer costoAdministracion) {
        this.idAgrupacion = idAgrupacion;
        this.idTipoInmuebleConjunto = idTipoInmuebleConjunto;
        this.numInmueble = numInmueble;
        this.costoAdministracion = costoAdministracion;
    }

    public UnidadDeVivienda(Integer id, Integer idAgrupacion, Integer idTipoInmuebleConjunto, String numInmueble, Integer costoAdministracion) {
        this.id = id;
        this.idAgrupacion = idAgrupacion;
        this.idTipoInmuebleConjunto = idTipoInmuebleConjunto;
        this.numInmueble = numInmueble;
        this.costoAdministracion = costoAdministracion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdAgrupacion() {
        return idAgrupacion;
    }

    public void setIdAgrupacion(Integer idAgrupacion) {
        this.idAgrupacion = idAgrupacion;
    }

    public Integer getIdTipoInmuebleConjunto() {
        return idTipoInmuebleConjunto;
    }

    public void setIdTipoInmuebleConjunto(Integer idTipoInmuebleConjunto) {
        this.idTipoInmuebleConjunto = idTipoInmuebleConjunto;
    }

    public String getNumInmueble() {
        return numInmueble;
    }

    public void setNumInmueble(String numInmueble) {
        this.numInmueble = numInmueble;
    }

    public Integer getCostoAdministracion() {
        return costoAdministracion;
    }

    public void setCostoAdministracion(Integer costoAdministracion) {
        this.costoAdministracion = costoAdministracion;
    }

    @Override
    public String toString() {
        return "unidadDeVivienda{" +
                "id=" + id +
                ", idAgrupacion=" + idAgrupacion +
                ", idTipoInmuebleConjunto=" + idTipoInmuebleConjunto +
                ", numInmueble='" + numInmueble + '\'' +
                ", costoAdministracion=" + costoAdministracion +
                '}';
    }
}
