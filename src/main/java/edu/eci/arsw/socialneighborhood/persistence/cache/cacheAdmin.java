package edu.eci.arsw.socialneighborhood.persistence.cache;


import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.services.adminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cacheAdmin")
public class cacheAdmin extends cache{


    private int idConjuntoAdministrador;
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
    private List<zonaComun> zonasComunes ;

    @Autowired
    @Qualifier("adminServices")
    protected adminServices adminServices = null;

    public cacheAdmin(){
        super();
    }

    public cacheAdmin(int idconjunto, int idusuario, int idConjuntoAdministrador) {
        super(idconjunto,idusuario);
        this.idConjuntoAdministrador=idConjuntoAdministrador;
        this.conjuntoAdministrador = adminServices.getCojuntoAdministradorByID(idConjuntoAdministrador);
        cacheAdmin();
    }

    public void cacheAdmin(){
        this.zonasComunes = adminServices.getZonasComunes();
        this.conjuntoUsuarios = adminServices.getConjuntoUsuarioByIDConjunto(idconjunto);
        this.usuarios=adminServices.getUsuariosByConjuntoUsuarios(conjuntoUsuarios);
        this.unidadesDeViviendaUsuarios=adminServices.getUnidadesDeViviendaUsuariosByConjuntoUsuarios(conjuntoUsuarios);
        this.unidadesDeVivienda=adminServices.getUnidadesDeViviendaByIdConjunto(idconjunto);
        this.agrupaciones=adminServices.getAgrupacionByIdConjunto(idconjunto);
        this.tipoInmueblesConjuntos = adminServices.getTipoInmuebleConjuntoByIdConjunto(idconjunto);
        this.tipoAgrupacionesConjunto = adminServices.getTipoAgrupacionConjuntoByIdConjunto(idconjunto);
        this.tipoAgrupaciones=adminServices.getTipoAgrupacion();
        this.tipoInmuebles=adminServices.getTipoInmueble();
        super.cache();
    }

    public conjuntoAdministrador getConjuntoAdministrador() {
        return conjuntoAdministrador;
    }

    public List<conjuntoUsuario> getConjuntoUsuarios() {
        return conjuntoUsuarios;
    }

    public conjuntoUsuario getConjuntoUsuarioById(int id) {
        for (conjuntoUsuario conjuntoUsuario: conjuntoUsuarios){
            if (conjuntoUsuario.getId().equals(id)){
                return conjuntoUsuario;
            }
        }
        return null;
    }

    public List<usuario> getUsuarios() {
        return usuarios;
    }

    public usuario getUsuarioById(int id) {
        for (usuario usuario: usuarios){
            if (usuario.getId().equals(id)){
                return usuario;
            }
        }
        return null;
    }

    public List<tipoAgrupacion> getTipoAgrupaciones() {
        return tipoAgrupaciones;
    }

    public List<tipoInmueble> getTipoInmuebles() {
        return tipoInmuebles;
    }

    public List<tipoAgrupacionConjunto> getTipoAgrupacionesConjunto() {
        return tipoAgrupacionesConjunto;
    }

    public List<tipoInmuebleConjunto> getTipoInmueblesConjuntos() {
        return tipoInmueblesConjuntos;
    }

    public tipoAgrupacionConjunto getTipoAgrupacionById(int id) {
        for (tipoAgrupacionConjunto tipoAgrupacionConjunto: tipoAgrupacionesConjunto){
            if (tipoAgrupacionConjunto.getId().equals(id)){
                return tipoAgrupacionConjunto;
            }
        }
        return null;
    }

    public tipoInmuebleConjunto getTipoInmuebleById(int id) {
        for (tipoInmuebleConjunto tipoInmuebleConjunto: tipoInmueblesConjuntos){
            if (tipoInmuebleConjunto.getId().equals(id)){
                return tipoInmuebleConjunto;
            }
        }
        return null;
    }

    public List<unidadDeVivienda> getUnidadesDeVivienda() {
        return unidadesDeVivienda;
    }

    public unidadDeVivienda getUnidadesDeViviendaById(int id) {
        for (unidadDeVivienda unidadDeVivienda: unidadesDeVivienda){
            if (unidadDeVivienda.getId().equals(id)){
                return unidadDeVivienda;
            }
        }
        return null;
    }

    public List<unidadDeViviendaUsuario> getUnidadesDeViviendaUsuarios() {
        return unidadesDeViviendaUsuarios;
    }

    public List<agrupacion> getAgrupaciones() {
        return agrupaciones;
    }

    @Override
    public conjunto getConjunto() {
        return super.getConjunto();
    }

    @Override
    public usuario getUsuario() {
        return super.getUsuario();
    }

    public List<zonaComun> getZonasComunes() {
        return zonasComunes;
    }

    @Override
    public List<zonaComunConjunto> getZonasComunesConjunto() {
        return super.getZonasComunesConjunto();
    }
}
