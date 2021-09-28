package edu.eci.arsw.socialneighborhood.model;

public class tipoAgrupacionConjunto {
    private Integer id;
    private Integer idTipoAgrupacion;
    private String nombre;

    public tipoAgrupacionConjunto(Integer idTipoAgrupacion, String nombre) {
        this.idTipoAgrupacion = idTipoAgrupacion;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdTipoAgrupacion() {
        return idTipoAgrupacion;
    }

    public void setIdTipoAgrupacion(Integer idTipoAgrupacion) {
        this.idTipoAgrupacion = idTipoAgrupacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "tipoAgrupacionConjunto{" +
                "id=" + id +
                ", idTipoAgrupacion=" + idTipoAgrupacion +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
