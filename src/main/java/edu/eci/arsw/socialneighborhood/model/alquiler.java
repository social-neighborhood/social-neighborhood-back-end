package edu.eci.arsw.socialneighborhood.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "alquiler")
public class alquiler {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "idzonacomun")
    private Integer idzonacomun;

    @Column(name = "idunidaddeviviendausuario")
    private Integer idunidaddeviviendausuario;

    @Column(name = "fechainiciodealquiler")
    private Date fechadealquiler;

    @Column(name = "horadeinicio")
    private Timestamp horadeinicio;

    @Column(name = "horadefin")
    private Timestamp horadefin;

    @Column(name = "fechafinalquiler")
    private Date fechafinalquiler;

    public alquiler(){

    }

    public alquiler(Integer idzonacomun, Integer idunidaddeviviendausuario, Date fechadealquiler, Timestamp horadeinicio, Timestamp horadefin) {
        this.idzonacomun = idzonacomun;
        this.idunidaddeviviendausuario = idunidaddeviviendausuario;
        this.fechadealquiler = fechadealquiler;
        this.horadeinicio = horadeinicio;
        this.horadefin = horadefin;
    }

    public alquiler(Integer id, Integer idzonacomun, Integer idunidaddeviviendausuario, Date fechadealquiler, Timestamp horadeinicio, Timestamp horadefin) {
        this.id = id;
        this.idzonacomun = idzonacomun;
        this.idunidaddeviviendausuario = idunidaddeviviendausuario;
        this.fechadealquiler = fechadealquiler;
        this.horadeinicio = horadeinicio;
        this.horadefin = horadefin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdzonacomun() {
        return idzonacomun;
    }

    public void setIdzonacomun(Integer idzonacomun) {
        this.idzonacomun = idzonacomun;
    }

    public Integer getIdunidaddeviviendausuario() {
        return idunidaddeviviendausuario;
    }

    public void setIdunidaddeviviendausuario(Integer idunidaddeviviendausuario) {
        this.idunidaddeviviendausuario = idunidaddeviviendausuario;
    }

    public Date getFechadealquiler() {
        return fechadealquiler;
    }

    public void setFechadealquiler(Date fechadealquiler) {
        this.fechadealquiler = fechadealquiler;
    }

    public Timestamp getHoradeinicio() {
        return horadeinicio;
    }

    public void setHoradeinicio(Timestamp horadeinicio) {
        this.horadeinicio = horadeinicio;
    }

    public Timestamp getHoradefin() {
        return horadefin;
    }

    public void setHoradefin(Timestamp horadefin) {
        this.horadefin = horadefin;
    }
}
