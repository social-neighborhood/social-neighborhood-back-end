package edu.eci.arsw.socialneighborhood;


import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.persistence.impl.socialNeighborhoodImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class cache {

    private conjunto conjunto;
    private usuario usuario;
    private conjuntoUsuario conjuntoUsuario;
    private unidadDeVivienda unidadDeVivienda;
    private unidadDeViviendaUsuario unidadDeViviendaUsuario;
    private agrupacion agrupacion;
    private tipoAgrupacionConjunto tipoAgrupacionConjunto;
    private tipoInmuebleConjunto tipoInmuebleConjunto;
    private tipoAgrupacion tipoAgrupacion;
    private tipoInmueble tipoInmueble;
    private conjuntoAdministrador conjuntoAdministrador;
    private List<conjuntoUsuario> conjuntoUsuarios;
    private List<usuario> usuarios;
    private List<tipoAgrupacion> tipoAgrupaciones;
    private List<tipoInmueble> tipoInmuebles;
    private List<tipoAgrupacionConjunto> tipoAgrupacionesConjunto;
    private List<tipoInmuebleConjunto> tipoInmueblesConjuntos;
    private List<unidadDeVivienda> unidadesDeVivienda;
    private List<unidadDeViviendaUsuario> unidadesDeViviendaUsuarios;
    private List<agrupacion> agrupaciones;
    private List<zonaComun> zonasComunes;
    private List<zonaComunConjunto> zonasComunesConjunto;

    @Autowired
    @Qualifier("socialNeighborhoodImpl")
    socialNeighborhoodImpl socialNeighborhood;

    public cache(int idconjunto, int idusuario, int idConjuntoUsuario, int idUnidadDeVivienda, int idUnidadDeViviendaUsuario, int idAgrupacion, int idTipoAgrupacionConjunto, int idTipoInmuebleConjunto, int idTipoAgrupacion, int idTipoInmueble) {
        this.conjunto = socialNeighborhood.getConjuntoById(idconjunto);
        this.usuario = socialNeighborhood.getUsuarioById(idusuario);
        this.conjuntoUsuario = socialNeighborhood.getConjuntoUsuarioByID(idConjuntoUsuario);
        this.unidadDeVivienda = socialNeighborhood.getUnidadDeViviendaByID(idUnidadDeVivienda);
        this.unidadDeViviendaUsuario = socialNeighborhood.getUnidadDeVivendaUsuarioByID(idUnidadDeViviendaUsuario);
        this.agrupacion = socialNeighborhood.getAgrupacionByID(idAgrupacion);
        this.tipoAgrupacion = socialNeighborhood.getTipoAgrupacionByID(idTipoAgrupacion);
        this.tipoInmueble = socialNeighborhood.getTipoinmuebleByID(idTipoInmueble);
        this.tipoAgrupacionConjunto = socialNeighborhood.getTipoAgrupacionConjuntoByID(idTipoAgrupacionConjunto);
        this.tipoInmuebleConjunto = socialNeighborhood.getTipoInmuebleConjuntoByID(idTipoInmuebleConjunto);
        this.zonasComunesConjunto = socialNeighborhood.getZonasComunesConjuntoByIdConjunto(idconjunto);
        this.zonasComunes = socialNeighborhood.getZonasComunesByZonasComunesConjunto(zonasComunesConjunto);
    }

    public cache(int idconjunto, int idusuario, int idConjuntoAdministrador) {
        this.conjunto = socialNeighborhood.getConjuntoById(idconjunto);
        this.usuario = socialNeighborhood.getUsuarioById(idusuario);
        this.conjuntoAdministrador = socialNeighborhood.getCojuntoAdministradorByID(idConjuntoAdministrador);
        this.zonasComunesConjunto = socialNeighborhood.getZonasComunesConjuntoByIdConjunto(idconjunto);
        this.zonasComunes = socialNeighborhood.getZonasComunes();
        this.conjuntoUsuarios = socialNeighborhood.getConjuntoUsuarioByIDConjunto(idconjunto);
        this.usuarios=socialNeighborhood.getUsuariosByConjuntoUsuarios(conjuntoUsuarios);
        this.unidadesDeViviendaUsuarios=socialNeighborhood.getUnidadesDeViviendaUsuariosByConjuntoUsuarios(conjuntoUsuarios);
        this.unidadesDeVivienda=socialNeighborhood.getUnidadesDeViviendaByUnidadesDeViviendaUsuario(unidadesDeViviendaUsuarios);
        this.agrupaciones=socialNeighborhood.getAgrupacionByUnidadDeVivienda(unidadesDeVivienda);
        this.tipoInmueblesConjuntos = socialNeighborhood.getTipoInmuebleConjuntoByIdConjunto(idconjunto);
        this.tipoAgrupacionesConjunto = socialNeighborhood.getTipoAgrupacionConjuntoByIdConjunto(idconjunto);
    }


}
