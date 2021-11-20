package edu.eci.arsw.socialneighborhood.services;

import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.persistence.impl.SocialNeighborhoodImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("commonServices")
public class CommonServices {

    @Autowired
    @Qualifier("socialNeighborhoodImpl")
    SocialNeighborhoodImpl socialNeighborhood;

    public Usuario getUsuarioById(int id){
        return socialNeighborhood.getUsuarioById(id);
    }

    public List<ZonaComunConjunto> getZonasComunesConjuntoByIdConjunto(int idconjunto){
        return socialNeighborhood.getZonasComunesConjuntoByIdConjunto(idconjunto);
    }

    public Object putUsuarioPropio(Usuario usuario) {
        return socialNeighborhood.putUsuarioPropio(usuario);
    }

    public Conjunto getConjuntoById(int id){
        return socialNeighborhood.getConjuntoById(id);
    }

    public Usuario userByEmail(String email) {
        return socialNeighborhood.userByEmail(email);
    }


    public Agrupacion getAgrupacionById(int id) {
        return socialNeighborhood.getAgrupacionByID(id);
    }


    public TipoAgrupacionConjunto getTipoAgrupacionConjuntoById(int id) {
        return socialNeighborhood.getTipoAgrupacionConjuntoById(id);
    }

    public TipoInmuebleConjunto getTipoInmuebleConjuntoById(int id) {
        return socialNeighborhood.getTipoInmuebleConjuntoById(id);
    }

    public TipoAgrupacion getTipoAgrupacionById(int id) {
        return socialNeighborhood.getTipoAgrupacionById(id);
    }

    public TipoInmueble getTipoInmuebleById(int id) {
        return socialNeighborhood.getTipoInmuebleById(id);
    }

    public Object putAlquiler(int id) {
        return socialNeighborhood.putAlquiler(id);
    }

    public List<Posts> getPostDeAdmin(int idconjunto) {
        return socialNeighborhood.getPostDeAdmin(idconjunto);
    }

    public Object getPostDeClient(int idconjunto) {
        return socialNeighborhood.getPostDeClient(idconjunto);
    }
}
