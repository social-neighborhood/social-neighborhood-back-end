package edu.eci.arsw.socialneighborhood.model;

public class TipoAgrupacion {
    private Integer id;
    private String nombre;

    public TipoAgrupacion(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "TipoAgrupacion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
