package edu.eci.arsw.socialneighborhood.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conjuntoadministrador")
public class ConjuntoAdministrador {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "idconjunto")
    private int idconjunto;
    @Column(name = "idusuarioadministrador")
    private int idusuarioadministrador;

    public ConjuntoAdministrador(){}

    public ConjuntoAdministrador(int idconjunto, int idusuarioadministrador){
        this.idconjunto=idconjunto;
        this.idusuarioadministrador=idusuarioadministrador;
    }
    public ConjuntoAdministrador(int id, int idconjunto, int idusuarioadministrador){
        this.id=id;
        this.idconjunto=idconjunto;
        this.idusuarioadministrador=idusuarioadministrador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdconjunto() {
        return idconjunto;
    }

    public void setIdconjunto(int idconjunto) {
        this.idconjunto = idconjunto;
    }

    public int getIdusuarioadministrador() {
        return idusuarioadministrador;
    }

    public void setIdusuarioadministrador(int idusuarioadministrador) {
        this.idusuarioadministrador = idusuarioadministrador;
    }
}
