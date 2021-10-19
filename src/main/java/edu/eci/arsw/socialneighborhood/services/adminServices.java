package edu.eci.arsw.socialneighborhood.services;

import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.persistence.impl.socialNeighborhoodImpl;
import edu.eci.arsw.socialneighborhood.repository.tipoInmuebleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.sql.SQLException;

@Service("adminServices")
public class adminServices {

    @Autowired
    @Qualifier("socialNeighborhoodImpl")
    socialNeighborhoodImpl socialNeighborhood =null;

    public List<tipoAgrupacion> getTipoAgrupacion() throws SQLException {
        return socialNeighborhood.getTipoAgrupacion();
    }

    public List<tipoInmueble> getTipoInmueble() {
        return socialNeighborhood.getTipoInmueble();
    }

    public List<tipoAgrupacionConjunto> getTipoAgrupacionPropia() {
        return socialNeighborhood.getTipoAgrupacionPropia();
    }

    public List<tipoInmuebleConjunto> getTipoInmueblesPropia() {
        return socialNeighborhood.getTipoInmueblesPropia();
    }

    public List<unidadDeVivienda> getUnidadDeVivinenda() {
        return socialNeighborhood.getUnidadDeVivinenda();
    }

    public Object putTipoAgrupacion(tipoAgrupacionConjunto agrupacionConjunto) {
        return socialNeighborhood.putTipoAgrupacion(agrupacionConjunto);
    }

    public Object putTipoInmueble(tipoInmuebleConjunto inmuebleConjunto) {
        return socialNeighborhood.putTipoInmueble(inmuebleConjunto);
    }

    public Object postTipoAgrupacion(tipoAgrupacionConjunto agrupacionConjunto) {
        return socialNeighborhood.postTipoAgrupacion(agrupacionConjunto);
    }

    public Object postTipoInmueble(tipoInmuebleConjunto inmuebleConjunto) {
        return socialNeighborhood.postTipoInmueble(inmuebleConjunto);
    }

    public Object putUnidadDeVivinenda(unidadDeVivienda unidadDeVivienda) {
        return socialNeighborhood.putUnidadDeVivinenda(unidadDeVivienda);
    }

    public Object postUnidadDeVivinenda(unidadDeVivienda unidadDeVivienda) {
        return socialNeighborhood.postUnidadDeVivinenda(unidadDeVivienda);
    }

    public List<usuario> getUsuario() {
        return socialNeighborhood.getUsuario();
    }

    public Object putUsuario(usuario usuario) {
        return socialNeighborhood.putUsuario(usuario);
    }

    public Object postUsuario(usuario usuario) {
        return socialNeighborhood.postUsuario(usuario);
    }

    public Object putzonaComunConjunto(zonaComunConjunto zonaComunConjunto) {
        return socialNeighborhood.putzonaComunConjunto(zonaComunConjunto);
    }

    public Object postzonaComunConjunto(zonaComunConjunto zonaComunConjunto) {
        return socialNeighborhood.postzonaComunConjunto(zonaComunConjunto);
    }

    public List<agrupacion> getAgrupacion(){
        return socialNeighborhood.getAgrupacion();
    }

    public Object putAgrupacion(agrupacion agrupacion){
        return socialNeighborhood.putAgrupacion(agrupacion);
    }

    public Object postAgrupacion(agrupacion agrupacion){
        return socialNeighborhood.postAgrupacion(agrupacion);
    }

    public Object putUnidadDeViviendaUsuario(unidadDeViviendaUsuario unidadDeViviendaUsuario){
        return socialNeighborhood.putUnidadDeViviendaUsuario(unidadDeViviendaUsuario);
    }

    public Object postUnidadDeViviendaUsuario(unidadDeViviendaUsuario unidadDeViviendaUsuario){
        return socialNeighborhood.postUnidadDeViviendaUsuario(unidadDeViviendaUsuario);
    }

}
