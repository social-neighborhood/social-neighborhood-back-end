package edu.eci.arsw.socialneighborhood.model;

public class tipoInmuebleConjunto {
    private Integer id;
    private Integer idTipoInmueble;
    private String nombre;

    public tipoInmuebleConjunto(Integer idTipoInmueble, String nombre) {
        this.idTipoInmueble = idTipoInmueble;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdTipoInmueble() {
        return idTipoInmueble;
    }

    public void setIdTipoInmueble(Integer idTipoInmueble) {
        this.idTipoInmueble = idTipoInmueble;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "tipoInmuebleConjunto{" +
                "id=" + id +
                ", idTipoInmueble=" + idTipoInmueble +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
