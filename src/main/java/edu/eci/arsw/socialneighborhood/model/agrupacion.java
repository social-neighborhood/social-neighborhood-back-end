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
    private Integer idtipoInmuebleConjunto;
    @Column(name = "numagrupacion")
    private String numero;

    public agrupacion(Integer idtipoInmuebleConjunto, String numero) {
        this.idtipoInmuebleConjunto = idtipoInmuebleConjunto;
        this.numero = numero;
    }

    public agrupacion(Integer id, Integer idtipoInmuebleConjunto, String numero) {
        this.id=id;
        this.idtipoInmuebleConjunto = idtipoInmuebleConjunto;
        this.numero = numero;
    }

    public Integer getIdtipoInmuebleConjunto() {
        return idtipoInmuebleConjunto;
    }

    public void setIdtipoInmuebleConjunto(Integer idtipoInmuebleConjunto) {
        this.idtipoInmuebleConjunto = idtipoInmuebleConjunto;
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
                ", idtipoInmuebleConjunto=" + idtipoInmuebleConjunto +
                ", numero='" + numero + '\'' +
                '}';
    }
}
