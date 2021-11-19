package edu.eci.arsw.socialneighborhood.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name = "alquiler")
public class Alquiler {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "idzonacomun")
    private Integer idzonacomun;

    @Column(name = "idunidaddeviviendausuario")
    private Integer idunidaddeviviendausuario;

    @Column(name = "iniciodealquiler")
    private long iniciodealquiler;

    @Column(name = "findealquiler")
    private long findealquiler;

    @Column(name = "costo")
    private int costo;

    @Column(name = "pagado")
    private boolean pagado;

    @Column(name = "cancelado")
    private  boolean cancelado;



    public Alquiler(){

    }

    public Alquiler(Integer idzonacomun, Integer idunidaddeviviendausuario, long iniciodealquiler, long findealquiler, int costo, boolean pagado) {
        this.idzonacomun = idzonacomun;
        this.idunidaddeviviendausuario = idunidaddeviviendausuario;
        this.iniciodealquiler = iniciodealquiler;
        this.findealquiler = findealquiler;
        this.costo=costo;
        this.pagado=pagado;
    }

    public Alquiler(Integer id, Integer idzonacomun, Integer idunidaddeviviendausuario, long iniciodealquiler, long findealquiler, int costo, boolean pagado) {
        this.id = id;
        this.idzonacomun = idzonacomun;
        this.idunidaddeviviendausuario = idunidaddeviviendausuario;
        this.iniciodealquiler = iniciodealquiler;
        this.findealquiler = findealquiler;
        this.costo=costo;
        this.pagado=pagado;
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

    public long getIniciodealquiler() {
        return iniciodealquiler;
    }

    public void setIniciodealquiler(long iniciodealquiler) {
        this.iniciodealquiler = iniciodealquiler;
    }

    public long getFindealquiler() {
        return findealquiler;
    }

    public void setFindealquiler(long findealquiler) {
        this.findealquiler = findealquiler;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }
}
