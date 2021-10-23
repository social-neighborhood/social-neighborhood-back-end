package edu.eci.arsw.socialneighborhood;

import edu.eci.arsw.socialneighborhood.model.*;
import org.springframework.stereotype.Service;

@Service("cache")
public class cache {

    private int idconjunto;
    private int idusuario;
    private int idConjuntoUsuario;
    private int idUnidadDeVivienda;
    private int idUnidadDeViviendaUsuario;

    public cache(int idconjunto, int idusuario, int idConjuntoUsuario, int idUnidadDeVivienda, int idUnidadDeViviendaUsuario) {
        this.idconjunto = idconjunto;
        this.idusuario = idusuario;
        this.idConjuntoUsuario = idConjuntoUsuario;
        this.idUnidadDeVivienda = idUnidadDeVivienda;
        this.idUnidadDeViviendaUsuario = idUnidadDeViviendaUsuario;
    }

    public int getConjunto() {
        return idconjunto;
    }

    public void setConjunto(int idconjunto) {
        this.idconjunto = idconjunto;
    }

    public int getUsuario() {
        return idusuario;
    }

    public void setUsuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdConjuntoUsuario() {
        return idConjuntoUsuario;
    }

    public void setIdConjuntoUsuario(int idConjuntoUsuario) {
        this.idConjuntoUsuario = idConjuntoUsuario;
    }

    public int getIdUnidadDeVivienda() {
        return idUnidadDeVivienda;
    }

    public void setIdUnidadDeVivienda(int idUnidadDeVivienda) {
        this.idUnidadDeVivienda = idUnidadDeVivienda;
    }

    public int getIdUnidadDeViviendaUsuario() {
        return idUnidadDeViviendaUsuario;
    }

    public void setIdUnidadDeViviendaUsuario(int idUnidadDeViviendaUsuario) {
        this.idUnidadDeViviendaUsuario = idUnidadDeViviendaUsuario;
    }
}
