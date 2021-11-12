package edu.eci.arsw.socialneighborhood.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conjuntousuario")
public class ConjuntoUsuario {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "idconjunto")
    private Integer idConjunto;
    @Column(name = "idusuario")
    private Integer idUsuario;

    public ConjuntoUsuario(){}
    public ConjuntoUsuario(Integer idConjunto, Integer idUsuario) {
        this.idConjunto = idConjunto;
        this.idUsuario = idUsuario;
    }

    public ConjuntoUsuario(Integer id, Integer idConjunto, Integer idUsuario) {
        this.id = id;
        this.idConjunto = idConjunto;
        this.idUsuario = idUsuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdConjunto() {
        return idConjunto;
    }

    public void setIdConjunto(Integer idConjunto) {
        this.idConjunto = idConjunto;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
}
