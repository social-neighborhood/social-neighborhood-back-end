package edu.eci.arsw.socialneighborhood.controller;

import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.persistence.cache.cacheClient;
import edu.eci.arsw.socialneighborhood.services.clientServices;
import edu.eci.arsw.socialneighborhood.services.commonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/client")
public class clientController {

    @Resource(name ="clientServices")
    clientServices clientServices;

    @Resource(name ="commonServices")
    commonServices commonServices;

    cacheClient cache;

    @RequestMapping(value = "/UnidadDeVivienda",method = RequestMethod.GET)
    public ResponseEntity<?> getUnidadDeViviendaByID(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getUnidadDeVivienda(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/UnidadDeVivendaUsuario",method = RequestMethod.GET)
    public ResponseEntity<?> getUnidadDeVivendaUsuarioByID(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getUnidadDeViviendaUsuario(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/Agrupacion",method = RequestMethod.GET)
    public ResponseEntity<?> getAgrupacionByID(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getAgrupacion(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/TipoAgrupacion",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoAgrupacionByID(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getTipoAgrupacion(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/Tipoinmueble",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoinmuebleByID(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getTipoInmueble(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/TipoAgrupacionConjunto",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoAgrupacionConjuntoByID(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getTipoAgrupacionConjunto(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/conjuntoUsuario",method = RequestMethod.GET)
    public ResponseEntity<?> getConjuntoUsuario(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getConjuntoUsuario(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/TipoInmuebleConjunto",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoInmuebleConjuntoByID(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getTipoInmuebleConjunto(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/ZonasComunesConjunto",method = RequestMethod.GET)
    public ResponseEntity<?> getZonasComunesConjunto(List<zonaComunConjunto> zonasComunesConjunto){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getZonasComunesConjunto(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/ZonasComunesByZonasComunesConjunto",method = RequestMethod.GET)
    public ResponseEntity<?> getZonasComunesByZonasComunesConjunto(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getZonasComunes(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/updateUsuarioPropio",method = RequestMethod.PUT)
    @ResponseBody
    public ResponseEntity<?> putUsuarioPropio(@RequestBody usuario usuario) {
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.putUsuarioPropio(usuario), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error", HttpStatus.NOT_FOUND);
        }
    }



    @RequestMapping(value = "/actualiza",method = RequestMethod.POST)
    public ResponseEntity<?> putUsuarioPropio() {
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.actualizaCacheClient(), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error", HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/autorizadoClient/{idconjunto}/{idusuario}/{idUnidadDeVivienda}",method = RequestMethod.POST)
    public ResponseEntity<?> autorizadoClient(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idUnidadDeVivienda") int idUnidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            cache=new cacheClient(idconjunto,idusuario,idUnidadDeVivienda,commonServices,clientServices);
            return new ResponseEntity<>(cache, HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(socialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

}
