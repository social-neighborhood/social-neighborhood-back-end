package edu.eci.arsw.socialneighborhood.persistence.cache;


import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.services.adminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
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
    private List<alquiler> alquileres ;
    private ZonedDateTime dateTime = ZonedDateTime.now();
    private ZonedDateTime dateTime1 = ZonedDateTime.now();

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
        actualizaCacheAdmin();
    }

    public Object actualizaCacheAdmin(){
        dateTime = ZonedDateTime.now();
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
        //this.alquileres=adminServices.getAlquileres(zonasComunesConjunto);
        super.actualizarCache();
        return null;
    }

    public conjuntoAdministrador getConjuntoAdministrador() {
        actualizar();
        return conjuntoAdministrador;
    }

    public List<conjuntoUsuario> getConjuntoUsuarios() {
        actualizar();
        return conjuntoUsuarios;
    }

    public conjuntoUsuario getConjuntoUsuarioById(int id) {
        actualizar();
        for (conjuntoUsuario conjuntoUsuario: conjuntoUsuarios){
            if (conjuntoUsuario.getId().equals(id)){
                return conjuntoUsuario;
            }
        }
        return null;
    }

    public List<usuario> getUsuarios() {
        actualizar();
        return usuarios;
    }

    public usuario getUsuarioById(int id) {
        actualizar();
        for (usuario usuario: usuarios){
            if (usuario.getId().equals(id)){
                return usuario;
            }
        }
        return null;
    }

    public List<tipoAgrupacion> getTipoAgrupaciones() {
        actualizar();
        return tipoAgrupaciones;
    }

    public List<tipoInmueble> getTipoInmuebles() {
        actualizar();
        return tipoInmuebles;
    }

    public List<tipoAgrupacionConjunto> getTipoAgrupacionesConjunto() {
        actualizar();
        return tipoAgrupacionesConjunto;
    }

    public List<tipoInmuebleConjunto> getTipoInmueblesConjuntos() {
        actualizar();
        return tipoInmueblesConjuntos;
    }

    public tipoAgrupacionConjunto getTipoAgrupacionById(int id) {
        actualizar();
        for (tipoAgrupacionConjunto tipoAgrupacionConjunto: tipoAgrupacionesConjunto){
            if (tipoAgrupacionConjunto.getId().equals(id)){
                return tipoAgrupacionConjunto;
            }
        }
        return null;
    }

    public tipoInmuebleConjunto getTipoInmuebleById(int id) {
        actualizar();
        for (tipoInmuebleConjunto tipoInmuebleConjunto: tipoInmueblesConjuntos){
            if (tipoInmuebleConjunto.getId().equals(id)){
                return tipoInmuebleConjunto;
            }
        }
        return null;
    }

    public List<unidadDeVivienda> getUnidadesDeVivienda() {
        actualizar();
        return unidadesDeVivienda;
    }

    public unidadDeVivienda getUnidadesDeViviendaById(int id) {
        actualizar();
        for (unidadDeVivienda unidadDeVivienda: unidadesDeVivienda){
            if (unidadDeVivienda.getId().equals(id)){
                return unidadDeVivienda;
            }
        }
        return null;
    }

    public List<unidadDeViviendaUsuario> getUnidadesDeViviendaUsuarios() {
        actualizar();
        return unidadesDeViviendaUsuarios;
    }

    public List<agrupacion> getAgrupaciones() {
        actualizar();
        return agrupaciones;
    }

    @Override
    public conjunto getConjunto() {
        actualizar();
        return super.getConjunto();
    }

    @Override
    public usuario getUsuario() {
        actualizar();
        return super.getUsuario();
    }

    public List<zonaComun> getZonasComunes() {
        actualizar();
        return zonasComunes;
    }

    @Override
    public List<zonaComunConjunto> getZonasComunesConjunto() {
        actualizar();
        return super.getZonasComunesConjunto();
    }

    public List<alquiler> getAlquileres(){
        actualizar();
        return alquileres;
    }

    public void actualizar(){
        dateTime1 = ZonedDateTime.now();
        if (dateTime.plusMinutes(5).compareTo(dateTime1)==-1){
            actualizaCacheAdmin();
        }
    }

}
