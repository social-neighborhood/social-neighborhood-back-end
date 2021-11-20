package edu.eci.arsw.socialneighborhood.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Posts {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "mensaje")
    private String mensaje;

    @Column(name = "foto")
    private String foto;

    @Column(name = "iduserconjunto")
    private int iduserconjunto;

    @Column(name = "fechapublicacion")
    private String fechapublicacion;

    @Column(name = "fechaactualizacion")
    private String fechaactualizacion;

    @Column(name = "idconjunto")
    private int idconjunto;

    public Posts(){

    }

    public Posts(String mensaje, String foto, int iduserconjunto, String fechapublicacion, String fechaactualizacion, int idconjunto) {
        this.mensaje = mensaje;
        this.foto = foto;
        this.iduserconjunto = iduserconjunto;
        this.fechapublicacion = fechapublicacion;
        this.fechaactualizacion = fechaactualizacion;
        this.idconjunto=idconjunto;
    }

    public Posts(String id, String mensaje, String foto, int iduserconjunto, String fechapublicacion, String fechaactualizacion, int idconjunto) {
        this.id = id;
        this.mensaje = mensaje;
        this.foto = foto;
        this.iduserconjunto = iduserconjunto;
        this.fechapublicacion = fechapublicacion;
        this.fechaactualizacion = fechaactualizacion;
        this.idconjunto=idconjunto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getIduserconjunto() {
        return iduserconjunto;
    }

    public void setIduserconjuntoo(int iduserconjunto) {this.iduserconjunto = iduserconjunto;}

    public String getFechapublicacion() {
        return fechapublicacion;
    }

    public void setFechapublicacion(String fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }

    public String getFechaactualizacion() {
        return fechaactualizacion;
    }

    public void setFechaactualizacion(String fechaactualizacion) {
        this.fechaactualizacion = fechaactualizacion;
    }

    public void setIduserconjunto(int iduserconjunto) {
        this.iduserconjunto = iduserconjunto;
    }

    public int getIdconjunto() {
        return idconjunto;
    }

    public void setIdconjunto(int idconjunto) {
        this.idconjunto = idconjunto;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "id=" + id +
                ", mensaje='" + mensaje + '\'' +
                ", foto='" + foto + '\'' +
                ", iduserconjunto=" + iduserconjunto +
                ", fechapublicacion='" + fechapublicacion + '\'' +
                ", fechaactualizacion='" + fechaactualizacion + '\'' +
                ", iduserconjunto='" + idconjunto + + '\'' +
                '}';
    }
}
