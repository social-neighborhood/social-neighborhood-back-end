package edu.eci.arsw.socialneighborhood.persistence.cache;

import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.services.adminServices;
import edu.eci.arsw.socialneighborhood.services.clientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.ZonedDateTime;
import java.util.List;

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
    private ZonedDateTime dateTime = ZonedDateTime.now();
    private ZonedDateTime dateTime1 = ZonedDateTime.now();

    @Resource(name ="clientServices")
    clientServices clientServices;

    public cacheClient(){super();}

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
        actualizaCacheClient();
    }

    public Object actualizaCacheClient(){
        this.zonasComunes = clientServices.getZonasComunesByZonasComunesConjunto(zonasComunesConjunto);
        super.actualizarCache();
        return null;
    }

    public int getIdUnidadDeVivienda() {
        actualizar();
        return idUnidadDeVivienda;
    }

    public conjuntoUsuario getConjuntoUsuario() {
        actualizar();
        return conjuntoUsuario;
    }

    public unidadDeVivienda getUnidadDeVivienda() {
        actualizar();
        return unidadDeVivienda;
    }

    public unidadDeViviendaUsuario getUnidadDeViviendaUsuario() {
        actualizar();
        return unidadDeViviendaUsuario;
    }

    public agrupacion getAgrupacion() {
        actualizar();
        return agrupacion;
    }

    public tipoAgrupacionConjunto getTipoAgrupacionConjunto() {
        actualizar();
        return tipoAgrupacionConjunto;
    }

    public tipoInmuebleConjunto getTipoInmuebleConjunto() {
        actualizar();
        return tipoInmuebleConjunto;
    }

    public tipoAgrupacion getTipoAgrupacion() {
        actualizar();
        return tipoAgrupacion;
    }

    public tipoInmueble getTipoInmueble() {
        actualizar();
        return tipoInmueble;
    }

    public List<zonaComun> getZonasComunes() {
        actualizar();
        return zonasComunes;
    }

    public void actualizar(){
        dateTime1 = ZonedDateTime.now();
        if (dateTime.plusMinutes(5).compareTo(dateTime1)==-1){
            dateTime = ZonedDateTime.now();
            actualizaCacheClient();
        }
    }
}
