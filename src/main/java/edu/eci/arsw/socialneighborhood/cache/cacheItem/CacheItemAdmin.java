package edu.eci.arsw.socialneighborhood.cache.cacheItem;


import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.services.AdminServices;
import edu.eci.arsw.socialneighborhood.services.CommonServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class CacheItemAdmin extends CacheItem {

    private int idConjuntoAdministrador;
    private ConjuntoAdministrador conjuntoAdministrador;
    private List<ConjuntoUsuario> ConjuntoUsuarios;
    private List<Usuario> Usuarios;
    private List<TipoAgrupacion> tipoAgrupaciones;
    private List<TipoInmueble> TipoInmuebles;
    private List<TipoAgrupacionConjunto> tipoAgrupacionesConjunto;
    private List<TipoInmuebleConjunto> tipoInmueblesConjuntos;
    private List<UnidadDeVivienda> unidadesDeVivienda;
    private List<UnidadDeViviendaUsuario> unidadesDeViviendaUsuarios;
    private List<Agrupacion> agrupaciones;
    private List<ZonaComun> zonasComunes ;
    private List<Alquiler> alquileres ;

    @Resource(name ="adminServices")
    AdminServices adminServices;




    public CacheItemAdmin(){super();}

    public CacheItemAdmin(int idconjunto, int idusuario, int idConjuntoAdministrador, CommonServices commonServices, AdminServices adminServices) throws ParseException {
        super(idconjunto,idusuario,commonServices);
        this.adminServices=adminServices;
        this.idConjuntoAdministrador=idConjuntoAdministrador;
        this.conjuntoAdministrador = adminServices.getCojuntoAdministradorByID(idConjuntoAdministrador);
        actualizaCacheAdmin();
    }

    public Object actualizaCacheAdmin(){
        super.actualizarCache();
        this.zonasComunes = adminServices.getZonasComunes();
        this.ConjuntoUsuarios = adminServices.getConjuntoUsuarioByIDConjunto(idconjunto);
        this.Usuarios =adminServices.getUsuariosByConjuntoUsuarios(ConjuntoUsuarios);
        this.unidadesDeViviendaUsuarios=adminServices.getUnidadesDeViviendaUsuariosByConjuntoUsuarios(ConjuntoUsuarios);
        this.unidadesDeVivienda=adminServices.getUnidadesDeViviendaByIdConjunto(idconjunto);
        this.agrupaciones=adminServices.getAgrupacionByIdConjunto(idconjunto);
        this.tipoInmueblesConjuntos = adminServices.getTipoInmuebleConjuntoByIdConjunto(idconjunto);
        this.tipoAgrupacionesConjunto = adminServices.getTipoAgrupacionConjuntoByIdConjunto(idconjunto);
        this.tipoAgrupaciones=adminServices.getTipoAgrupacion();
        this.TipoInmuebles =adminServices.getTipoInmueble();
        this.alquileres=adminServices.getAlquileres(zonasComunesConjunto);

        return null;
    }

    public ConjuntoAdministrador getConjuntoAdministrador() {
        return conjuntoAdministrador;
    }

    public List<ConjuntoUsuario> getConjuntoUsuarios() {
        return ConjuntoUsuarios;
    }

    public ConjuntoUsuario getConjuntoUsuarioById(int id) {
        for (ConjuntoUsuario conjuntoUsuario: ConjuntoUsuarios){
            if (conjuntoUsuario.getId().equals(id)){
                return conjuntoUsuario;
            }
        }
        return null;
    }

    public List<Usuario> getUsuarios() {
        return Usuarios;
    }

    public Usuario getUsuarioById(int id) {
        for (Usuario usuario: Usuarios){
            if (usuario.getId().equals(id)){
                return usuario;
            }
        }
        return null;
    }

    public List<TipoAgrupacion> getTipoAgrupaciones() {
        return tipoAgrupaciones;
    }

    public List<TipoInmueble> getTipoInmuebles() {
        return TipoInmuebles;
    }

    public List<TipoAgrupacionConjunto> getTipoAgrupacionesConjunto() {
        return tipoAgrupacionesConjunto;
    }

    public List<TipoInmuebleConjunto> getTipoInmueblesConjuntos() {
        return tipoInmueblesConjuntos;
    }

    public TipoAgrupacionConjunto getTipoAgrupacionById(int id) {
        for (TipoAgrupacionConjunto tipoAgrupacionConjunto: tipoAgrupacionesConjunto){
            if (tipoAgrupacionConjunto.getId().equals(id)){
                return tipoAgrupacionConjunto;
            }
        }
        return null;
    }

    public TipoInmuebleConjunto getTipoInmuebleById(int id) {
        for (TipoInmuebleConjunto tipoInmuebleConjunto: tipoInmueblesConjuntos){
            if (tipoInmuebleConjunto.getId().equals(id)){
                return tipoInmuebleConjunto;
            }
        }
        return null;
    }

    public List<UnidadDeVivienda> getUnidadesDeVivienda() {
        return unidadesDeVivienda;
    }

    public UnidadDeVivienda getUnidadesDeViviendaById(int id) {
        for (UnidadDeVivienda unidadDeVivienda: unidadesDeVivienda){
            if (unidadDeVivienda.getId().equals(id)){
                return unidadDeVivienda;
            }
        }
        return null;
    }

    public List<UnidadDeViviendaUsuario> getUnidadesDeViviendaUsuarios() {
        return unidadesDeViviendaUsuarios;
    }

    public List<Agrupacion> getAgrupaciones() {
        return agrupaciones;
    }

    @Override
    public Conjunto getConjunto() {
        return super.getConjunto();
    }

    @Override
    public Usuario getUsuario() {
        return super.getUsuario();
    }

    public List<ZonaComun> getZonasComunes() {
        return zonasComunes;
    }

    @Override
    public List<ZonaComunConjunto> getZonasComunesConjunto() {
        return super.getZonasComunesConjunto();
    }

    public List<Alquiler> getAlquileres(){
        return alquileres;
    }

    public Agrupacion getAgrupacionById(int id) {
        for (Agrupacion agrupacion: agrupaciones){
            if (agrupacion.getId().equals(id)){
                return agrupacion;
            }
        }
        return null;
    }

    public TipoAgrupacionConjunto getTipoAgrupacionConjuntoById(int id) {
        for (TipoAgrupacionConjunto tipoAgrupacionConjunto: tipoAgrupacionesConjunto){
            if (tipoAgrupacionConjunto.getId().equals(id)){
                return tipoAgrupacionConjunto;
            }
        }
        return null;
    }

    public TipoInmuebleConjunto getTipoInmuebleConjuntoById(int id) {
        for (TipoInmuebleConjunto tipoInmuebleConjunto: tipoInmueblesConjuntos){
            if (tipoInmuebleConjunto.getId().equals(id)){
                return tipoInmuebleConjunto;
            }
        }
        return null;
    }

    public Usuario userByEmail(String email) {
        for (Usuario usuario:Usuarios){
            if(usuario.getEmail().equals(email)){
                return usuario;
            }
        }
        return null;
    }
}
