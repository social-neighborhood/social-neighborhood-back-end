package edu.eci.arsw.socialneighborhood.model;

import org.junit.Test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zonacomunconjunto")
public class ZonaComunConjunto {
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
    private int costoAlquiler;
    @Column(name = "disponible")
    private Boolean Disponible;
    @Column(name = "tiempodeespera")
    private int tiempodeespera;
    @Column(name = "tiempomaximoalquiler")
    private int tiempomaximoalquiler;

    public ZonaComunConjunto(){}

    public ZonaComunConjunto(Integer idZonaComun, Integer idConjunto, Integer tiempoAlquilerCobro, int costoAlquiler, Boolean disponible, int tiempodeespera,int tiempomaximoalquiler) {
        this.idZonaComun = idZonaComun;
        this.idConjunto = idConjunto;
        this.tiempoAlquilerCobro = tiempoAlquilerCobro;
        this.costoAlquiler = costoAlquiler;
        this.Disponible = disponible;
        this.tiempodeespera =tiempodeespera;
        this.tiempomaximoalquiler=tiempomaximoalquiler;
    }

    public ZonaComunConjunto(Integer id, Integer idZonaComun, Integer idConjunto, Integer tiempoAlquilerCobro, int costoAlquiler, Boolean disponible, int tiempodeespera,int tiempomaximoalquiler) {
        this.id = id;
        this.idZonaComun = idZonaComun;
        this.idConjunto = idConjunto;
        this.tiempoAlquilerCobro = tiempoAlquilerCobro;
        this.costoAlquiler = costoAlquiler;
        this.Disponible = disponible;
        this.tiempodeespera = tiempodeespera;
        this.tiempomaximoalquiler=tiempomaximoalquiler;
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

    public int getCostoAlquiler() {
        return costoAlquiler;
    }

    public void setCostoAlquiler(int costoAlquiler) {
        this.costoAlquiler = costoAlquiler;
    }

    public Boolean getDisponible() {
        return Disponible;
    }

    public void setDisponible(Boolean disponible) {
        Disponible = disponible;
    }

    public int getTiempodeespera() {
        return tiempodeespera;
    }

    public void setTiempodeespera(int tiempodeespera) {
        this.tiempodeespera = tiempodeespera;
    }

    public int getTiempomaximoalquiler() {
        return tiempomaximoalquiler;
    }

    public void setTiempomaximoalquiler(int tiempomaximoalquiler) {
        this.tiempomaximoalquiler = tiempomaximoalquiler;
    }

    @Override
    public String toString() {
        return "ZonaComunConjunto{" +
                "id=" + id +
                ", idZonaComun=" + idZonaComun +
                ", idConjunto=" + idConjunto +
                ", tiempoAlquilerCobro=" + tiempoAlquilerCobro +
                ", costoAlquiler=" + costoAlquiler +
                ", Disponible=" + Disponible +
                ", tiempodeespera=" + tiempodeespera +
                ", tiempomaximoalquiler=" + tiempomaximoalquiler +
                '}';
    }
}


