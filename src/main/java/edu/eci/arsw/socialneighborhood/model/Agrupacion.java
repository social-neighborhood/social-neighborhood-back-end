package edu.eci.arsw.socialneighborhood.model;

public class Agrupacion {
    private Integer id;
    private Integer idtipoInmuebleConjunto;
    private String numero;

    public Agrupacion(Integer idtipoInmuebleConjunto, String numero) {
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
