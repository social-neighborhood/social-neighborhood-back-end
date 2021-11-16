package edu.eci.arsw.socialneighborhood.cache.cacheItem;

import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.services.ClientServices;
import edu.eci.arsw.socialneighborhood.services.CommonServices;

import javax.annotation.Resource;
import java.time.ZonedDateTime;
import java.util.List;

public class CacheItemClient extends CacheItem {
    private int  idUnidadDeVivienda;
    private ConjuntoUsuario conjuntoUsuario;
    private UnidadDeVivienda unidadDeVivienda;
    private UnidadDeViviendaUsuario unidadDeViviendaUsuario;
    private Agrupacion agrupacion;
    private TipoAgrupacionConjunto tipoAgrupacionConjunto;
    private TipoInmuebleConjunto tipoInmuebleConjunto;
    private TipoAgrupacion tipoAgrupacion;
    private TipoInmueble tipoInmueble;
    private List<ZonaComun> zonasComunes ;

    @Resource(name ="clientServices")
    ClientServices clientServices;

    public CacheItemClient(){super();}

    public CacheItemClient(int idconjunto, int idusuario, int idUnidadDeVivienda, CommonServices commonServices, ClientServices clientServices) {
        super(idconjunto,idusuario,commonServices);
        this.clientServices=clientServices;
        this.idUnidadDeVivienda=idUnidadDeVivienda;
        this.conjuntoUsuario = clientServices.getConjuntoUsuarioByConjuntoUsuario(idconjunto,idusuario);
        this.unidadDeVivienda = clientServices.getUnidadDeViviendaByID(idUnidadDeVivienda);
        this.unidadDeViviendaUsuario = clientServices.getUnidadDeVivendaUsuarioByID(idUnidadDeVivienda,conjuntoUsuario.getId());
        this.agrupacion = clientServices.getAgrupacionByID(unidadDeVivienda.getIdAgrupacion());
        this.tipoAgrupacionConjunto = clientServices.getTipoAgrupacionConjuntoByID(agrupacion.getIdtipoagrupacionconjunto());
        this.tipoInmuebleConjunto = clientServices.getTipoInmuebleConjuntoByID(unidadDeVivienda.getIdTipoInmuebleConjunto());
        this.tipoAgrupacion = clientServices.getTipoAgrupacionByID(tipoAgrupacionConjunto.getIdTipoAgrupacion());
        this.tipoInmueble = clientServices.getTipoinmuebleByID(tipoInmuebleConjunto.getIdTipoInmueble());
        actualizaCacheClient();
        System.out.println("item");
    }

    public Object actualizaCacheClient(){
        super.actualizarCache();
        this.zonasComunes = clientServices.getZonasComunesByZonasComunesConjunto(zonasComunesConjunto);

        return null;
    }

    public int getIdUnidadDeVivienda() {
        return idUnidadDeVivienda;
    }

    public ConjuntoUsuario getConjuntoUsuario() {
        return conjuntoUsuario;
    }

    public UnidadDeVivienda getUnidadDeVivienda() {
        return unidadDeVivienda;
    }

    public UnidadDeViviendaUsuario getUnidadDeViviendaUsuario() {
        return unidadDeViviendaUsuario;
    }

    public Agrupacion getAgrupacion() {
        return agrupacion;
    }

    public TipoAgrupacionConjunto getTipoAgrupacionConjunto() {
        return tipoAgrupacionConjunto;
    }

    public TipoInmuebleConjunto getTipoInmuebleConjunto() {
        return tipoInmuebleConjunto;
    }

    public TipoAgrupacion getTipoAgrupacion() {
        return tipoAgrupacion;
    }

    public TipoInmueble getTipoInmueble() {
        return tipoInmueble;
    }

    public List<ZonaComun> getZonasComunes() {
        return zonasComunes;
    }

}
