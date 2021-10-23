package edu.eci.arsw.socialneighborhood.model;

import org.junit.Test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zonacomunconjunto")
public class zonaComunConjunto {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "idzonacomun")
    private Integer idZonaComun;
    @Column(name = "idconjunto")
    private Integer idConjunto;
    @Column(name = "tiempoalquilercobro")
    private Integer tiempoAlquilerCobro;
    @Column(name = "costoalquilerportiempo")
    private Double costoAlquiler;
    @Column(name = "disponible")
    private Boolean Disponible;

    public zonaComunConjunto(){}

    public zonaComunConjunto(Integer idZonaComun, Integer idConjunto, Integer tiempoAlquilerCobro, Double costoAlquiler, Boolean disponible) {
        this.idZonaComun = idZonaComun;
        this.idConjunto = idConjunto;
        this.tiempoAlquilerCobro = tiempoAlquilerCobro;
        this.costoAlquiler = costoAlquiler;
        Disponible = disponible;
    }

    public zonaComunConjunto(Integer id, Integer idZonaComun, Integer idConjunto, Integer tiempoAlquilerCobro, Double costoAlquiler, Boolean disponible) {
        this.id = id;
        this.idZonaComun = idZonaComun;
        this.idConjunto = idConjunto;
        this.tiempoAlquilerCobro = tiempoAlquilerCobro;
        this.costoAlquiler = costoAlquiler;
        Disponible = disponible;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdZonaComun() {
        return idZonaComun;
    }

    public void setIdZonaComun(Integer idZonaComun) {
        this.idZonaComun = idZonaComun;
    }

    public Integer getIdConjunto() {
        return idConjunto;
    }

    public void setIdConjunto(Integer idConjunto) {
        this.idConjunto = idConjunto;
    }

    public Integer getTiempoAlquilerCobro() {
        return tiempoAlquilerCobro;
    }

    public void setTiempoAlquilerCobro(Integer tiempoAlquilerCobro) {
        this.tiempoAlquilerCobro = tiempoAlquilerCobro;
    }

    public Double getCostoAlquiler() {
        return costoAlquiler;
    }

    public void setCostoAlquiler(Double costoAlquiler) {
        this.costoAlquiler = costoAlquiler;
    }

    public Boolean getDisponible() {
        return Disponible;
    }

    public void setDisponible(Boolean disponible) {
        Disponible = disponible;
    }
}

