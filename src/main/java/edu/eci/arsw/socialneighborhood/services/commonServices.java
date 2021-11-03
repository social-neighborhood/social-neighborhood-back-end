package edu.eci.arsw.socialneighborhood.services;

import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.persistence.impl.socialNeighborhoodImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("commonServices")
public class commonServices {

    @Autowired
    @Qualifier("socialNeighborhoodImpl")
    socialNeighborhoodImpl socialNeighborhood =null;

    public usuario getUsuarioById(int id){
        return socialNeighborhood.getUsuarioById(id);
    }

    public List<zonaComunConjunto> getZonasComunesConjuntoByIdConjunto(int idconjunto){
        return socialNeighborhood.getZonasComunesConjuntoByIdConjunto(idconjunto);
    }

    public Object putUsuarioPropio(usuario usuario) {
        return socialNeighborhood.putUsuarioPropio(usuario);
    }

    public conjunto getConjuntoById(int id){
        return socialNeighborhood.getConjuntoById(id);
    }

    public usuario userByEmail(String email) {
        return socialNeighborhood.userByEmail(email);
    }


    public agrupacion getAgrupacionById(int id) {
        return socialNeighborhood.getAgrupacionByID(id);
    }


    public tipoAgrupacionConjunto getTipoAgrupacionConjuntoById(int id) {
        return socialNeighborhood.getTipoAgrupacionConjuntoById(id);
    }

    public tipoInmuebleConjunto getTipoInmuebleConjuntoById(int id) {
        return socialNeighborhood.getTipoInmuebleConjuntoById(id);
    }

    public tipoAgrupacion getTipoAgrupacionById(int id) {
        return socialNeighborhood.getTipoAgrupacionById(id);
    }

    public tipoInmueble getTipoInmuebleById(int id) {
        return socialNeighborhood.getTipoInmuebleById(id);
    }
}
