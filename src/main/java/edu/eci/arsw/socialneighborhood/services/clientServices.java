package edu.eci.arsw.socialneighborhood.services;

import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.persistence.cache.cacheClient;
import edu.eci.arsw.socialneighborhood.persistence.impl.socialNeighborhoodImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("clientServices")
public class clientServices {

    @Autowired
    @Qualifier("socialNeighborhoodImpl")
    socialNeighborhoodImpl socialNeighborhood;

    public conjuntoUsuario getConjuntoUsuarioByConjuntoUsuario(int idconjunto, int idusuario){
        return socialNeighborhood.getConjuntoUsuarioByConjuntoUsuario(idconjunto,idusuario);
    }

    public unidadDeVivienda getUnidadDeViviendaByID(int id){
        return socialNeighborhood.getUnidadDeViviendaByID(id);
    }

    public unidadDeViviendaUsuario getUnidadDeVivendaUsuarioByID(int idUnidadDeVivienda, int idConjuntoUsuario){
        return socialNeighborhood.getUnidadDeVivendaUsuarioByID(idUnidadDeVivienda,idConjuntoUsuario);
    }

    public agrupacion getAgrupacionByID(int idAgrupacion){
        return socialNeighborhood.getAgrupacionByID(idAgrupacion);
    }

    public tipoAgrupacion getTipoAgrupacionByID(int idTipoAgrupacion){
        return socialNeighborhood.getTipoAgrupacionByID(idTipoAgrupacion);
    }

    public tipoInmueble getTipoinmuebleByID(int idTipoInmueble){
        return socialNeighborhood.getTipoinmuebleByID(idTipoInmueble);
    }

    public tipoAgrupacionConjunto getTipoAgrupacionConjuntoByID(int idTipoAgrupacionConjunto){
        return socialNeighborhood.getTipoAgrupacionConjuntoByID(idTipoAgrupacionConjunto);
    }

    public tipoInmuebleConjunto getTipoInmuebleConjuntoByID(int idTipoInmuebleConjunto){
        return socialNeighborhood.getTipoInmuebleConjuntoByID(idTipoInmuebleConjunto);
    }

    public List<zonaComun> getZonasComunesByZonasComunesConjunto(List<zonaComunConjunto> zonasComunesConjunto){
        return socialNeighborhood.getZonasComunesByZonasComunesConjunto(zonasComunesConjunto);
    }

}
