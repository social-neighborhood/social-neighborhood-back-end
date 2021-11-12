package edu.eci.arsw.socialneighborhood.services;

import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.persistence.impl.SocialNeighborhoodImpl;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adminServices")
public class AdminServices {

    @Autowired
    @Qualifier("socialNeighborhoodImpl")
    SocialNeighborhoodImpl socialNeighborhood;

    public List<TipoAgrupacion> getTipoAgrupacion(){
        return socialNeighborhood.getTipoAgrupacion();
    }

    public List<TipoInmueble> getTipoInmueble(){
        return socialNeighborhood.getTipoInmueble();
    }

    public List<TipoAgrupacionConjunto> getTipoAgrupacionPropia(){
        return socialNeighborhood.getTipoAgrupacionPropia();
    }

    public List<TipoInmuebleConjunto> getTipoInmueblesPropia(){
        return socialNeighborhood.getTipoInmueblesPropia();
    }

    public List<UnidadDeVivienda> getUnidadDeVivinenda(){
        return socialNeighborhood.getUnidadDeVivinenda();
    }

    public List<Usuario> getConjuntoUsuario(){
        return socialNeighborhood.getConjuntoUsuario();
    }

    public List<Agrupacion> getAgrupacion(){
        return socialNeighborhood.getAgrupacion();
    }

    public Object userByEmail(String email){
        return socialNeighborhood.userByEmail(email);
    }

    public JSONArray getUnidadDeVivinendaByEmail(String email){
        return socialNeighborhood.getUnidadDeVivinendaByEmail(email);
    }

    public ConjuntoAdministrador getCojuntoAdministradorByID(int idConjuntoAdministrador){
        return socialNeighborhood.getCojuntoAdministradorByID(idConjuntoAdministrador);
    }

    public List<ZonaComun> getZonasComunes(){
        return socialNeighborhood.getZonasComunes();
    }

    public List<ConjuntoUsuario> getConjuntoUsuarioByIDConjunto(int idconjunto){
        return socialNeighborhood.getConjuntoUsuarioByIDConjunto(idconjunto);
    }

    public List<Usuario> getUsuariosByConjuntoUsuarios(List<ConjuntoUsuario> ConjuntoUsuarios){
        return socialNeighborhood.getUsuariosByConjuntoUsuarios(ConjuntoUsuarios);
    }

    public List<UnidadDeViviendaUsuario> getUnidadesDeViviendaUsuariosByConjuntoUsuarios(List<ConjuntoUsuario> ConjuntoUsuarios){
        return socialNeighborhood.getUnidadesDeViviendaUsuariosByConjuntoUsuarios(ConjuntoUsuarios);
    }

    public List<UnidadDeVivienda> getUnidadesDeViviendaByIdConjunto(int idconjunto){
        return socialNeighborhood.getUnidadesDeViviendaByIdConjunto(idconjunto);
    }

    public List<Agrupacion> getAgrupacionByIdConjunto(int idconjunto){
        return socialNeighborhood.getAgrupacionByIdConjunto(idconjunto);
    }

    public List<TipoInmuebleConjunto> getTipoInmuebleConjuntoByIdConjunto(int idconjunto){
        return socialNeighborhood.getTipoInmuebleConjuntoByIdConjunto(idconjunto);
    }

    public List<TipoAgrupacionConjunto> getTipoAgrupacionConjuntoByIdConjunto(int idconjunto){
        return socialNeighborhood.getTipoAgrupacionConjuntoByIdConjunto(idconjunto);
    }

    public List<Alquiler> getAlquileres(List<ZonaComunConjunto> zonascomunes) {
        return socialNeighborhood.getAlquileres(zonascomunes);
    }

    public Object postConjuntoUsuarios(ConjuntoUsuario conjuntoUsuario) {
        return socialNeighborhood.postConjuntoUsuario(conjuntoUsuario);
    }

    public Object postTipoAgrupacionesConjunto(TipoAgrupacionConjunto tipoAgrupacionConjunto) {
        return socialNeighborhood.postTipoAgrupacion(tipoAgrupacionConjunto);
    }

    public Object postTipoInmueblesConjuntos(TipoInmuebleConjunto tipoInmuebleConjunto) {
        return socialNeighborhood.postTipoInmueble(tipoInmuebleConjunto);
    }

    public Object postUnidadesDeVivienda(UnidadDeVivienda unidadDeVivienda) {
        return socialNeighborhood.postUnidadDeVivinenda(unidadDeVivienda);
    }

    public Object postUnidadesDeViviendaUsuarios(UnidadDeViviendaUsuario unidadDeViviendaUsuario) {
        return socialNeighborhood.postUnidadDeViviendaUsuario(unidadDeViviendaUsuario);
    }

    public Object postAgrupaciones(Agrupacion agrupacion) {
        return socialNeighborhood.postAgrupacion(agrupacion);
    }

    public Object postZonasComunesConjunto(ZonaComunConjunto zonaComunConjunto) {
        return socialNeighborhood.postzonaComunConjunto(zonaComunConjunto);
    }

    public Object putUnidadesDeVivienda(UnidadDeVivienda unidadDeVivienda) {
        return socialNeighborhood.putUnidadDeVivinenda(unidadDeVivienda);
    }

    public Object putUnidadesDeViviendaUsuarios(UnidadDeViviendaUsuario unidadDeViviendaUsuario) {
        return socialNeighborhood.putUnidadDeViviendaUsuario(unidadDeViviendaUsuario);
    }

    public Object putUsuarioPropio(Usuario usuario) {
        return socialNeighborhood.putUsuarioPropio(usuario);
    }

    public Object putZonasComunesConjunto(ZonaComunConjunto zonaComunConjunto) {
        return socialNeighborhood.putzonaComunConjunto(zonaComunConjunto);
    }


}
