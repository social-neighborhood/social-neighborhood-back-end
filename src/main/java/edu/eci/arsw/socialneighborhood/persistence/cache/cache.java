package edu.eci.arsw.socialneighborhood.persistence.cache;

import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.persistence.impl.socialNeighborhoodImpl;
import edu.eci.arsw.socialneighborhood.services.adminServices;
import edu.eci.arsw.socialneighborhood.services.clientServices;
import edu.eci.arsw.socialneighborhood.services.commonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("cache")
public abstract class cache {
    protected int idconjunto ;
    protected int idusuario;
    protected conjunto conjunto;
    protected usuario usuario;
    protected List<zonaComunConjunto> zonasComunesConjunto ;

    @Resource(name ="commonServices")
    commonServices commonServices;

    public cache(){}

    public cache(int idconjunto, int idusuario){
        this.idconjunto=idconjunto;
        this.idusuario=idusuario;
        System.out.println(idconjunto);
        this.conjunto = commonServices.getConjuntoById(idconjunto);
    }

    public void  actualizarCache(){
        this.usuario = commonServices.getUsuarioById(idusuario);
        this.zonasComunesConjunto = commonServices.getZonasComunesConjuntoByIdConjunto(idconjunto);
    }

    public conjunto getConjunto() {
        return conjunto;
    }

    public usuario getUsuario() {
        return usuario;
    }

    public List<zonaComunConjunto> getZonasComunesConjunto() {
        return zonasComunesConjunto;
    }

}
