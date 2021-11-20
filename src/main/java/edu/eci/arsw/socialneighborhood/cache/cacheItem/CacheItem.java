package edu.eci.arsw.socialneighborhood.cache.cacheItem;

import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.services.CommonServices;

import javax.annotation.Resource;
import java.util.List;

public abstract class CacheItem {
    protected int idconjunto ;
    protected int idusuario;
    protected Conjunto conjunto;
    protected Usuario usuario;
    protected List<ZonaComunConjunto> zonasComunesConjunto ;

    @Resource(name ="commonServices")
    CommonServices commonServices;

    public CacheItem(){}

    public CacheItem(int idconjunto, int idusuario, CommonServices commonServices){
        this.commonServices=commonServices;
        this.idconjunto=idconjunto;
        this.idusuario=idusuario;
        this.conjunto = commonServices.getConjuntoById(idconjunto);
    }

    public void  actualizarCache(){
        this.usuario = commonServices.getUsuarioById(idusuario);
        this.zonasComunesConjunto = commonServices.getZonasComunesConjuntoByIdConjunto(idconjunto);
    }

    public Conjunto getConjunto() {
        return conjunto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<ZonaComunConjunto> getZonasComunesConjunto() {
        return zonasComunesConjunto;
    }

}
