package edu.eci.arsw.socialneighborhood.services;

import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.persistence.impl.socialNeighborhoodImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adminServices")
public class adminServices {

    @Autowired
    @Qualifier("socialNeighborhoodImpl")
    socialNeighborhoodImpl socialNeighborhood =null;

    public List<tipoAgrupacion> getTipoAgrupacion(){
        return socialNeighborhood.getTipoAgrupacion();
    }

    public List<tipoInmueble> getTipoInmueble(){
        return socialNeighborhood.getTipoInmueble();
    }

    public List<tipoAgrupacionConjunto> getTipoAgrupacionPropia(){
        return socialNeighborhood.getTipoAgrupacionPropia();
    }

    public List<tipoInmuebleConjunto> getTipoInmueblesPropia(){
        return socialNeighborhood.getTipoInmueblesPropia();
    }

    public List<unidadDeVivienda> getUnidadDeVivinenda(){
        return socialNeighborhood.getUnidadDeVivinenda();
    }

    public List<usuario> getConjuntoUsuario(){
        return socialNeighborhood.getConjuntoUsuario();
    }

    public List<agrupacion> getAgrupacion(){
        return socialNeighborhood.getAgrupacion();
    }

    public Object userByEmail(String email){
        return socialNeighborhood.userByEmail(email);
    }

    public List<unidadDeVivienda> getUnidadDeVivinendaByEmail(String email){
        return socialNeighborhood.getUnidadDeVivinendaByEmail(email);
    }

    public conjuntoAdministrador getCojuntoAdministradorByID(int idConjuntoAdministrador){
        return socialNeighborhood.getCojuntoAdministradorByID(idConjuntoAdministrador);
    }

    public List<zonaComun> getZonasComunes(){
        return socialNeighborhood.getZonasComunes();
    }

    public List<conjuntoUsuario> getConjuntoUsuarioByIDConjunto(int idconjunto){
        return socialNeighborhood.getConjuntoUsuarioByIDConjunto(idconjunto);
    }

    public List<usuario> getUsuariosByConjuntoUsuarios(List<conjuntoUsuario> conjuntoUsuarios){
        return socialNeighborhood.getUsuariosByConjuntoUsuarios(conjuntoUsuarios);
    }

    public List<unidadDeViviendaUsuario> getUnidadesDeViviendaUsuariosByConjuntoUsuarios(List<conjuntoUsuario> conjuntoUsuarios){
        return socialNeighborhood.getUnidadesDeViviendaUsuariosByConjuntoUsuarios(conjuntoUsuarios);
    }

    public List<unidadDeVivienda> getUnidadesDeViviendaByIdConjunto(int idconjunto){
        return socialNeighborhood.getUnidadesDeViviendaByIdConjunto(idconjunto);
    }

    public List<agrupacion> getAgrupacionByIdConjunto(int idconjunto){
        return socialNeighborhood.getAgrupacionByIdConjunto(idconjunto);
    }

    public List<tipoInmuebleConjunto> getTipoInmuebleConjuntoByIdConjunto(int idconjunto){
        return socialNeighborhood.getTipoInmuebleConjuntoByIdConjunto(idconjunto);
    }

    public List<tipoAgrupacionConjunto> getTipoAgrupacionConjuntoByIdConjunto(int idconjunto){
        return socialNeighborhood.getTipoAgrupacionConjuntoByIdConjunto(idconjunto);
    }

    public Object postConjuntoUsuarios(conjuntoUsuario conjuntoUsuario) {
        return socialNeighborhood.postConjuntoUsuario(conjuntoUsuario);
    }

    public Object postTipoAgrupacionesConjunto(tipoAgrupacionConjunto tipoAgrupacionConjunto) {
        return socialNeighborhood.postTipoAgrupacion(tipoAgrupacionConjunto);
    }

    public Object postTipoInmueblesConjuntos(tipoInmuebleConjunto tipoInmuebleConjunto) {
        return socialNeighborhood.postTipoInmueble(tipoInmuebleConjunto);
    }

    public Object postUnidadesDeVivienda(unidadDeVivienda unidadDeVivienda) {
        return socialNeighborhood.postUnidadDeVivinenda(unidadDeVivienda);
    }

    public Object postUnidadesDeViviendaUsuarios(unidadDeViviendaUsuario unidadDeViviendaUsuario) {
        return socialNeighborhood.postUnidadDeViviendaUsuario(unidadDeViviendaUsuario);
    }

    public Object postAgrupaciones(agrupacion agrupacion) {
        return socialNeighborhood.postAgrupacion(agrupacion);
    }

    public Object postZonasComunesConjunto(zonaComunConjunto zonaComunConjunto) {
        return socialNeighborhood.postzonaComunConjunto(zonaComunConjunto);
    }

    public Object putUnidadesDeVivienda(unidadDeVivienda unidadDeVivienda) {
        return socialNeighborhood.putUnidadDeVivinenda(unidadDeVivienda);
    }

    public Object putUnidadesDeViviendaUsuarios(unidadDeViviendaUsuario unidadDeViviendaUsuario) {
        return socialNeighborhood.putUnidadDeViviendaUsuario(unidadDeViviendaUsuario);
    }

    public Object putUsuarioPropio(usuario usuario) {
        return socialNeighborhood.putUsuarioPropio(usuario);
    }

    public Object putZonasComunesConjunto(zonaComunConjunto zonaComunConjunto) {
        return socialNeighborhood.putzonaComunConjunto(zonaComunConjunto);
    }


}
