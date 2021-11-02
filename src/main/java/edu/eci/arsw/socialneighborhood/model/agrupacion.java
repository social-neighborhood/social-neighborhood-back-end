package edu.eci.arsw.socialneighborhood.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agrupacion")
public class agrupacion {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "idtipoagrupacionconjunto")
    private Integer idtipoagrupacionconjunto;
    @Column(name = "numagrupacion")
    private String numero;

    public agrupacion(){}
    public agrupacion(Integer idtipoagrupacionconjunto, String numero) {
        this.idtipoagrupacionconjunto = idtipoagrupacionconjunto;
        this.numero = numero;
    }

    public agrupacion(Integer id, Integer idtipoagrupacionconjunto, String numero) {
        this.id=id;
        this.idtipoagrupacionconjunto = idtipoagrupacionconjunto;
        this.numero = numero;
    }

    public Integer getIdtipoagrupacionconjunto() {
        return idtipoagrupacionconjunto;
    }

    public void setIdtipoagrupacionconjunto(Integer idtipoagrupacionconjunto) {
        this.idtipoagrupacionconjunto = idtipoagrupacionconjunto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Agrupacion{" +
                "id=" + id +
                ", idtipoagrupacionconjunto=" + idtipoagrupacionconjunto +
                ", numero='" + numero + '\'' +
                '}';
    }
}
