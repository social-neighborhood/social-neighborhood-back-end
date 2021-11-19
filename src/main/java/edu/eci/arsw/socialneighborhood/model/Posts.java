package edu.eci.arsw.socialneighborhood.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Posts {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "mensaje")
    private String mensaje;

    @Column(name = "foto")
    private String foto;

    @Column(name = "idunidaddeviviendausuario")
    private int idunidaddeviviendausuario;

    @Column(name = "idconjuntoadministrador")
    private int idconjuntoadministrador;

    @Column(name = "fechapublicacion")
    private String fechapublicacion;

    @Column(name = "fechaactualizacion")
    private String fechaactualizacion;

    public Posts(){

    }

    public Posts(String mensaje, String foto, int idunidaddeviviendausuario, int idconjuntoadministrador, String fechapublicacion, String fechaactualizacion) {
        this.mensaje = mensaje;
        this.foto = foto;
        this.idunidaddeviviendausuario = idunidaddeviviendausuario;
        this.idconjuntoadministrador = idconjuntoadministrador;
        this.fechapublicacion = fechapublicacion;
        this.fechaactualizacion = fechaactualizacion;
    }

    public Posts(int id, String mensaje, String foto, int idunidaddeviviendausuario, int idconjuntoadministrador, String fechapublicacion, String fechaactualizacion) {
        this.id = id;
        this.mensaje = mensaje;
        this.foto = foto;
        this.idunidaddeviviendausuario = idunidaddeviviendausuario;
        this.idconjuntoadministrador = idconjuntoadministrador;
        this.fechapublicacion = fechapublicacion;
        this.fechaactualizacion = fechaactualizacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getIdunidaddeviviendausuario() {
        return idunidaddeviviendausuario;
    }

    public void setIdunidaddeviviendausuario(int idunidaddeviviendausuario) {
        this.idunidaddeviviendausuario = idunidaddeviviendausuario;
    }

    public int getIdconjuntoadministrador() {
        return idconjuntoadministrador;
    }

    public void setIdconjuntoadministrador(int idconjuntoadministrador) {
        this.idconjuntoadministrador = idconjuntoadministrador;
    }

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

    @Override
    public String toString() {
        return "Posts{" +
                "id=" + id +
                ", mensaje='" + mensaje + '\'' +
                ", foto='" + foto + '\'' +
                ", idunidaddeviviendausuario=" + idunidaddeviviendausuario +
                ", idconjuntoadministrador=" + idconjuntoadministrador +
                ", fechapublicacion='" + fechapublicacion + '\'' +
                ", fechaactualizacion='" + fechaactualizacion + '\'' +
                '}';
    }
}
