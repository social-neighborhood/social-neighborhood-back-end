package edu.eci.arsw.socialneighborhood.services;

import edu.eci.arsw.socialneighborhood.persistence.cache.cache;
import edu.eci.arsw.socialneighborhood.persistence.cache.cacheAdmin;
import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.persistence.cache.cacheClient;
import edu.eci.arsw.socialneighborhood.persistence.impl.socialNeighborhoodImpl;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("socialNeighborhoodServices")
public class socialNeighborhoodServices {
    @Autowired
    @Qualifier("socialNeighborhoodImpl")
    socialNeighborhoodImpl socialNeighborhood;

    public JSONArray getUnidadesDeViviendaByEmail(String email){
        return socialNeighborhood.getUnidadDeVivinendaByEmail(email);
    }

    public Object postUsuario(usuario usuario){
        return socialNeighborhood.postUsuario(usuario);
    }

    public List<agrupacion> getAgrupacion() {
        return socialNeighborhood.getAgrupacion();
    }

    public List<tipoAgrupacionConjunto> tipoAgrupacionConjunto() {
        return socialNeighborhood.getTipoAgrupacionPropia();
    }

    public List<tipoInmuebleConjunto> tipoInmuebleConjunto() {
        return socialNeighborhood.getTipoInmueblesPropia();
    }

    public List<tipoAgrupacion> tipoAgrupacion() {
        return socialNeighborhood.getTipoAgrupacion();
    }

    public List<tipoInmueble> tipoInmueble() {
        return socialNeighborhood.getTipoInmueble();
    }

    public conjuntoAdministrador getConjuntosByEmaill(String email) {
        return socialNeighborhood.getConjuntosByEmaill(email);
    }

    public List<conjunto> getConjuntos() {
        return socialNeighborhood.getConjuntos();
    }

    public conjunto getConjuntoById(int id) {
        return socialNeighborhood.getConjuntoById(id);
    }
}
