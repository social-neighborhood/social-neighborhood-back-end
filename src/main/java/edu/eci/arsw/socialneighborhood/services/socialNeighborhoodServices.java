package edu.eci.arsw.socialneighborhood.services;

import edu.eci.arsw.socialneighborhood.cache;
import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.persistence.impl.socialNeighborhoodImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("socialNeighborhoodServices")
public class socialNeighborhoodServices {
    @Autowired
    @Qualifier("socialNeighborhoodImpl")
    socialNeighborhoodImpl socialNeighborhood =null;

    edu.eci.arsw.socialneighborhood.cache cache;

    public usuario userByEmail(String email) {
        return socialNeighborhood.userByEmail(email);
    }

    public List<unidadDeVivienda> getUnidadesDeViviendaByEmail(String email){
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

    public Object autorizado(int idconjunto, int idusuario, int idConjuntoUsuario, int idUnidadDeVivienda, int idUnidadDeViviendaUsuario, int idAgrupacion, int idTipoAgrupacionConjunto, int idTipoInmuebleConjunto, int idTipoAgrupacion, int idTipoInmueble) {
        cache = new cache(idconjunto,idusuario,idConjuntoUsuario,idUnidadDeVivienda,idUnidadDeViviendaUsuario,idAgrupacion,idTipoAgrupacionConjunto,idTipoInmuebleConjunto,idTipoAgrupacion,idTipoInmueble);
        return null;
    }
}
