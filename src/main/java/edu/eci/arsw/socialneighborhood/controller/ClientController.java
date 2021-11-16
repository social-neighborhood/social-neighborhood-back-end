package edu.eci.arsw.socialneighborhood.controller;

import edu.eci.arsw.socialneighborhood.cache.Cache;
import edu.eci.arsw.socialneighborhood.cache.cacheItem.CacheItemAdmin;
import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.cache.cacheItem.CacheItemClient;
import edu.eci.arsw.socialneighborhood.services.ClientServices;
import edu.eci.arsw.socialneighborhood.services.CommonServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Resource(name ="clientServices")
    ClientServices clientServices;

    @Resource(name ="commonServices")
    CommonServices commonServices;

    @Resource(name = "cache")
    Cache cache;

    @RequestMapping(value = "/UnidadDeVivienda/{idconjunto}/{idusuario}/{idUnidadDeVivienda}",method = RequestMethod.GET)
    public ResponseEntity<?> getUnidadDeViviendaByID(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idUnidadDeVivienda") int idUnidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemClient(idconjunto, idusuario, idUnidadDeVivienda).getUnidadDeVivienda(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/UnidadDeVivendaUsuario/{idconjunto}/{idusuario}/{idUnidadDeVivienda}",method = RequestMethod.GET)
    public ResponseEntity<?> getUnidadDeVivendaUsuarioByID(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idUnidadDeVivienda") int idUnidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemClient(idconjunto, idusuario, idUnidadDeVivienda).getUnidadDeViviendaUsuario(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/Agrupacion/{idconjunto}/{idusuario}/{idUnidadDeVivienda}",method = RequestMethod.GET)
    public ResponseEntity<?> getAgrupacionByID(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idUnidadDeVivienda") int idUnidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemClient(idconjunto, idusuario, idUnidadDeVivienda).getAgrupacion(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/TipoAgrupacion/{idconjunto}/{idusuario}/{idUnidadDeVivienda}",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoAgrupacionByID(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idUnidadDeVivienda") int idUnidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemClient(idconjunto, idusuario, idUnidadDeVivienda).getTipoAgrupacion(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/Tipoinmueble/{idconjunto}/{idusuario}/{idUnidadDeVivienda}",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoinmuebleByID(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idUnidadDeVivienda") int idUnidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemClient(idconjunto, idusuario, idUnidadDeVivienda).getTipoInmueble(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/TipoAgrupacionConjunto/{idconjunto}/{idusuario}/{idUnidadDeVivienda}",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoAgrupacionConjuntoByID(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idUnidadDeVivienda") int idUnidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemClient(idconjunto, idusuario, idUnidadDeVivienda).getTipoAgrupacionConjunto(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/conjuntoUsuario/{idconjunto}/{idusuario}/{idUnidadDeVivienda}",method = RequestMethod.GET)
    public ResponseEntity<?> getConjuntoUsuario(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idUnidadDeVivienda") int idUnidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemClient(idconjunto, idusuario, idUnidadDeVivienda).getConjuntoUsuario(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/TipoInmuebleConjunto/{idconjunto}/{idusuario}/{idUnidadDeVivienda}",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoInmuebleConjuntoByID(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idUnidadDeVivienda") int idUnidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemClient(idconjunto, idusuario, idUnidadDeVivienda).getTipoInmuebleConjunto(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/ZonasComunesConjunto/{idconjunto}/{idusuario}/{idUnidadDeVivienda}",method = RequestMethod.GET)
    public ResponseEntity<?> getZonasComunesConjunto(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idUnidadDeVivienda") int idUnidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemClient(idconjunto, idusuario, idUnidadDeVivienda).getZonasComunesConjunto(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/ZonasComunesByZonasComunesConjunto/{idconjunto}/{idusuario}/{idUnidadDeVivienda}",method = RequestMethod.GET)
    public ResponseEntity<?> getZonasComunesByZonasComunesConjunto(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idUnidadDeVivienda") int idUnidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemClient(idconjunto, idusuario, idUnidadDeVivienda).getZonasComunes(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/updateUsuarioPropio",method = RequestMethod.PUT)
    @ResponseBody
    public ResponseEntity<?> putUsuarioPropio(@RequestBody Usuario usuario) {
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.putUsuarioPropio(usuario), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error", HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/autorizadoClient/{idconjunto}/{idusuario}/{idUnidadDeVivienda}",method = RequestMethod.POST)
    public ResponseEntity<?> autorizadoClient(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idUnidadDeVivienda") int idUnidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            cache.loginClient(idconjunto,idusuario,idUnidadDeVivienda,commonServices,clientServices);
            return new ResponseEntity<>(cache, HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    private CacheItemClient getCacheItemClient(int idconjunto, int idusuario, int idUnidadDeVivienda) throws ParseException {
        cache.loginClient(idconjunto,idusuario,idUnidadDeVivienda,commonServices,clientServices);
        return cache.getClient(idconjunto, idusuario, idUnidadDeVivienda);
    }

    @RequestMapping(value = "/consulta/{idconjunto}/{idusuario}/{idUnidadDeVivienda}",method = RequestMethod.GET)
    public ResponseEntity<?> consulta(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idUnidadDeVivienda") int idUnidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getClient(idconjunto, idusuario, idUnidadDeVivienda), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

}
