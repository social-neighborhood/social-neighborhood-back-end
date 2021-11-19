package edu.eci.arsw.socialneighborhood.services;

import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.persistence.impl.SocialNeighborhoodImpl;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.List;

@Service("clientServices")
public class ClientServices {

    @Autowired
    @Qualifier("socialNeighborhoodImpl")
    SocialNeighborhoodImpl socialNeighborhood;

    public ConjuntoUsuario getConjuntoUsuarioByConjuntoUsuario(int idconjunto, int idusuario){
        return socialNeighborhood.getConjuntoUsuarioByConjuntoUsuario(idconjunto,idusuario);
    }

    public UnidadDeVivienda getUnidadDeViviendaByID(int id){
        return socialNeighborhood.getUnidadDeViviendaByID(id);
    }

    public UnidadDeViviendaUsuario getUnidadDeVivendaUsuarioByID(int idUnidadDeVivienda, int idConjuntoUsuario){
        return socialNeighborhood.getUnidadDeVivendaUsuarioByID(idUnidadDeVivienda,idConjuntoUsuario);
    }

    public Agrupacion getAgrupacionByID(int idAgrupacion){
        return socialNeighborhood.getAgrupacionByID(idAgrupacion);
    }

    public TipoAgrupacion getTipoAgrupacionByID(int idTipoAgrupacion){
        return socialNeighborhood.getTipoAgrupacionByID(idTipoAgrupacion);
    }

    public TipoInmueble getTipoinmuebleByID(int idTipoInmueble){
        return socialNeighborhood.getTipoinmuebleByID(idTipoInmueble);
    }

    public TipoAgrupacionConjunto getTipoAgrupacionConjuntoByID(int idTipoAgrupacionConjunto){
        return socialNeighborhood.getTipoAgrupacionConjuntoByID(idTipoAgrupacionConjunto);
    }

    public TipoInmuebleConjunto getTipoInmuebleConjuntoByID(int idTipoInmuebleConjunto){
        return socialNeighborhood.getTipoInmuebleConjuntoByID(idTipoInmuebleConjunto);
    }

    public List<ZonaComun> getZonasComunesByZonasComunesConjunto(List<ZonaComunConjunto> zonasComunesConjunto){
        return socialNeighborhood.getZonasComunesByZonasComunesConjunto(zonasComunesConjunto);
    }


    public JSONArray getHorasInicioAlquiler(long fechai, long fechaf, long fecham, String fechainicio,int idZonaComun) throws ParseException {
        return socialNeighborhood.getHorasInicioAlquiler(fechai,fechaf, fecham, fechainicio, idZonaComun);
    }
}
