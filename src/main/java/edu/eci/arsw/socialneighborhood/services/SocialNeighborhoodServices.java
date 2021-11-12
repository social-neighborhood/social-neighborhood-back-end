package edu.eci.arsw.socialneighborhood.services;

import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.persistence.impl.SocialNeighborhoodImpl;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("socialNeighborhoodServices")
public class SocialNeighborhoodServices {
    @Autowired
    @Qualifier("socialNeighborhoodImpl")
    SocialNeighborhoodImpl socialNeighborhood;

    public JSONArray getUnidadesDeViviendaByEmail(String email){
        return socialNeighborhood.getUnidadDeVivinendaByEmail(email);
    }

    public Object postUsuario(Usuario usuario){
        return socialNeighborhood.postUsuario(usuario);
    }

    public List<Agrupacion> getAgrupacion() {
        return socialNeighborhood.getAgrupacion();
    }

    public List<TipoAgrupacionConjunto> tipoAgrupacionConjunto() {
        return socialNeighborhood.getTipoAgrupacionPropia();
    }

    public List<TipoInmuebleConjunto> tipoInmuebleConjunto() {
        return socialNeighborhood.getTipoInmueblesPropia();
    }

    public List<TipoAgrupacion> tipoAgrupacion() {
        return socialNeighborhood.getTipoAgrupacion();
    }

    public List<TipoInmueble> tipoInmueble() {
        return socialNeighborhood.getTipoInmueble();
    }

    public ConjuntoAdministrador getConjuntosByEmaill(String email) {
        return socialNeighborhood.getConjuntosByEmaill(email);
    }

    public List<Conjunto> getConjuntos() {
        return socialNeighborhood.getConjuntos();
    }

    public Conjunto getConjuntoById(int id) {
        return socialNeighborhood.getConjuntoById(id);
    }
}
