package edu.eci.arsw.socialneighborhood.persistence.cache;

import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.services.adminServices;
import edu.eci.arsw.socialneighborhood.services.clientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cacheClient")
public class cacheClient extends cache{
    private int  idUnidadDeVivienda;
    private conjuntoUsuario conjuntoUsuario;
    private unidadDeVivienda unidadDeVivienda;
    private unidadDeViviendaUsuario unidadDeViviendaUsuario;
    private agrupacion agrupacion;
    private tipoAgrupacionConjunto tipoAgrupacionConjunto;
    private tipoInmuebleConjunto tipoInmuebleConjunto;
    private tipoAgrupacion tipoAgrupacion;
    private tipoInmueble tipoInmueble;
    private List<zonaComun> zonasComunes ;

    @Autowired
    @Qualifier("clientServices")
    protected clientServices clientServices = null;

    public cacheClient(){
        super();
    }

    public cacheClient(int idconjunto, int idusuario, int idUnidadDeVivienda) {
        super(idconjunto,idusuario);
        this.idUnidadDeVivienda=idUnidadDeVivienda;
        this.conjuntoUsuario = clientServices.getConjuntoUsuarioByConjuntoUsuario(idconjunto,idusuario);
        this.unidadDeVivienda = clientServices.getUnidadDeViviendaByID(idUnidadDeVivienda);
        this.unidadDeViviendaUsuario = clientServices.getUnidadDeVivendaUsuarioByID(idUnidadDeVivienda,conjuntoUsuario.getId());
        this.agrupacion = clientServices.getAgrupacionByID(unidadDeVivienda.getIdAgrupacion());
        this.tipoAgrupacionConjunto = clientServices.getTipoAgrupacionConjuntoByID(agrupacion.getIdtipoagrupacionconjunto());
        this.tipoInmuebleConjunto = clientServices.getTipoInmuebleConjuntoByID(unidadDeVivienda.getIdTipoInmuebleConjunto());
        this.tipoAgrupacion = clientServices.getTipoAgrupacionByID(tipoAgrupacionConjunto.getIdTipoAgrupacion());
        this.tipoInmueble = clientServices.getTipoinmuebleByID(tipoInmuebleConjunto.getIdTipoInmueble());
    }

    public void cacheClient(){
        this.zonasComunes = clientServices.getZonasComunesByZonasComunesConjunto(zonasComunesConjunto);
        super.cache();
    }

    public int getIdUnidadDeVivienda() {
        return idUnidadDeVivienda;
    }

    public conjuntoUsuario getConjuntoUsuario() {
        return conjuntoUsuario;
    }

    public unidadDeVivienda getUnidadDeVivienda() {
        return unidadDeVivienda;
    }

    public unidadDeViviendaUsuario getUnidadDeViviendaUsuario() {
        return unidadDeViviendaUsuario;
    }

    public agrupacion getAgrupacion() {
        return agrupacion;
    }

    public tipoAgrupacionConjunto getTipoAgrupacionConjunto() {
        return tipoAgrupacionConjunto;
    }

    public tipoInmuebleConjunto getTipoInmuebleConjunto() {
        return tipoInmuebleConjunto;
    }

    public tipoAgrupacion getTipoAgrupacion() {
        return tipoAgrupacion;
    }

    public tipoInmueble getTipoInmueble() {
        return tipoInmueble;
    }

    public List<zonaComun> getZonasComunes() {
        return zonasComunes;
    }
}
