package edu.eci.arsw.socialneighborhood.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "unidaddeviviendausuario")
public class unidadDeViviendaUsuario {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "idconjuntousuario")
    private Integer idConjuntoUsuario;
    @Column(name = "idunidaddevivienda")
    private Integer idUnidadDeVivienda;
    @Column(name = "tipohabitante")
    private String tipoHabitante;
    @Column(name = "disponible")
    private Boolean disponible;

    public unidadDeViviendaUsuario(){}
    public unidadDeViviendaUsuario(Integer idConjuntoUsuario, Integer idUnidadDeVivienda, String tipoHabitante, Boolean disponible) {
        this.idConjuntoUsuario = idConjuntoUsuario;
        this.idUnidadDeVivienda = idUnidadDeVivienda;
        this.tipoHabitante = tipoHabitante;
        this.disponible = disponible;
    }

    public unidadDeViviendaUsuario(Integer id, Integer idConjuntoUsuario, Integer idUnidadDeVivienda, String tipoHabitante, Boolean disponible) {
        this.id = id;
        this.idConjuntoUsuario = idConjuntoUsuario;
        this.idUnidadDeVivienda = idUnidadDeVivienda;
        this.tipoHabitante = tipoHabitante;
        this.disponible = disponible;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdConjuntoUsuario() {
        return idConjuntoUsuario;
    }

    public void setIdConjuntoUsuario(Integer idConjuntoUsuario) {
        this.idConjuntoUsuario = idConjuntoUsuario;
    }

    public Integer getIdUnidadDeVivienda() {
        return idUnidadDeVivienda;
    }

    public void setIdUnidadDeVivienda(Integer idUnidadDeVivienda) {
        this.idUnidadDeVivienda = idUnidadDeVivienda;
    }

    public String getTipoHabitante() {
        return tipoHabitante;
    }

    public void setTipoHabitante(String tipoHabitante) {
        this.tipoHabitante = tipoHabitante;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
}
