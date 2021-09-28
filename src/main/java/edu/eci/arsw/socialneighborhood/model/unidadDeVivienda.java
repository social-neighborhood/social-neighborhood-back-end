package edu.eci.arsw.socialneighborhood.model;

public class unidadDeVivienda {
    private Integer id;
    private Integer idAgrupacion;
    private Integer idTipoInmuebleConjunto;
    private String numInmueble;
    private Integer costoAdministracion;

    public unidadDeVivienda(Integer idAgrupacion, Integer idTipoInmuebleConjunto, String numInmueble, Integer costoAdministracion) {
        this.idAgrupacion = idAgrupacion;
        this.idTipoInmuebleConjunto = idTipoInmuebleConjunto;
        this.numInmueble = numInmueble;
        this.costoAdministracion = costoAdministracion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdAgrupacion() {
        return idAgrupacion;
    }

    public void setIdAgrupacion(Integer idAgrupacion) {
        this.idAgrupacion = idAgrupacion;
    }

    public Integer getIdTipoInmuebleConjunto() {
        return idTipoInmuebleConjunto;
    }

    public void setIdTipoInmuebleConjunto(Integer idTipoInmuebleConjunto) {
        this.idTipoInmuebleConjunto = idTipoInmuebleConjunto;
    }

    public String getNumInmueble() {
        return numInmueble;
    }

    public void setNumInmueble(String numInmueble) {
        this.numInmueble = numInmueble;
    }

    public Integer getCostoAdministracion() {
        return costoAdministracion;
    }

    public void setCostoAdministracion(Integer costoAdministracion) {
        this.costoAdministracion = costoAdministracion;
    }

    @Override
    public String toString() {
        return "unidadDeVivienda{" +
                "id=" + id +
                ", idAgrupacion=" + idAgrupacion +
                ", idTipoInmuebleConjunto=" + idTipoInmuebleConjunto +
                ", numInmueble='" + numInmueble + '\'' +
                ", costoAdministracion=" + costoAdministracion +
                '}';
    }
}
