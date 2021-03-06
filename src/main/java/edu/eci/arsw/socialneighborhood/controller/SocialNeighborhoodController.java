package edu.eci.arsw.socialneighborhood.controller;

import edu.eci.arsw.socialneighborhood.model.Usuario;
import edu.eci.arsw.socialneighborhood.services.CommonServices;
import edu.eci.arsw.socialneighborhood.services.SocialNeighborhoodServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/social")
public class SocialNeighborhoodController {

    @Resource(name = "socialNeighborhoodServices")
    SocialNeighborhoodServices neighborhoodServices;

    @Resource(name = "commonServices")
    CommonServices commonServices;

    @RequestMapping(value = "/userByEmail/{email}",method = RequestMethod.GET)
    public ResponseEntity<?> getuserByEmail(@PathVariable("email") String email){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.userByEmail(email), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @RequestMapping(value = "/newUsuario",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> postUsuario(@RequestBody Usuario usuario){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(neighborhoodServices.postUsuario(usuario), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/unidadesDeViviendaByEmail/{email}",method = RequestMethod.GET)
    public ResponseEntity<?> getUnidadesDeViviendaByEmail(@PathVariable("email") String email){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(neighborhoodServices.getUnidadesDeViviendaByEmail(email).toString(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/conjuntosByEmail/{email}",method = RequestMethod.GET)
    public ResponseEntity<?> getConjuntosByEmaill(@PathVariable("email") String email){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(neighborhoodServices.getConjuntosByEmaill(email), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/conjuntos",method = RequestMethod.GET)
    public ResponseEntity<?> getConjuntos(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(neighborhoodServices.getConjuntos(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/conjuntoById/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getConjuntoById(@PathVariable("id") int id){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.getConjuntoById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/agrupacion",method = RequestMethod.GET)
    public ResponseEntity<?> getAgrupacion(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(neighborhoodServices.getAgrupacion(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/tipoAgrupacionConjunto",method = RequestMethod.GET)
    public ResponseEntity<?> gettipoAgrupacionConjunto(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(neighborhoodServices.tipoAgrupacionConjunto(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/tipoInmuebleConjunto",method = RequestMethod.GET)
    public ResponseEntity<?> gettipoInmuebleConjunto(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(neighborhoodServices.tipoInmuebleConjunto(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/tipoAgrupacion",method = RequestMethod.GET)
    public ResponseEntity<?> gettipoAgrupacion(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(neighborhoodServices.tipoAgrupacion(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/tipoInmueble",method = RequestMethod.GET)
    public ResponseEntity<?> gettipoInmueble(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(neighborhoodServices.tipoInmueble(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/agrupacionById/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getAgrupacionById(@PathVariable("id") int id){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.getAgrupacionById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/tipoAgrupacionConjuntoById/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoAgrupacionConjuntoById(@PathVariable("id") int id){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.getTipoAgrupacionConjuntoById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/tipoInmuebleConjuntoById/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoInmuebleConjuntoById(@PathVariable("id") int id){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.getTipoInmuebleConjuntoById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/tipoAgrupacionById/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoAgrupacionById(@PathVariable("id") int id){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.getTipoAgrupacionById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/tipoInmuebleById/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> gettipoInmuebleById(@PathVariable("id") int id){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.getTipoInmuebleById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
