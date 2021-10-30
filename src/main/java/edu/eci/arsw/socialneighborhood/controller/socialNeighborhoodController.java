package edu.eci.arsw.socialneighborhood.controller;

import edu.eci.arsw.socialneighborhood.model.usuario;
import edu.eci.arsw.socialneighborhood.services.socialNeighborhoodServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/social")
public class socialNeighborhoodController {
    @Autowired
    @Qualifier("socialNeighborhoodServices")
    private socialNeighborhoodServices neighborhoodServices;

    @RequestMapping(value = "/userByEmail/{email}",method = RequestMethod.GET)
    public ResponseEntity<?> getconjuntosByEmail(@PathVariable("email") String email){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(neighborhoodServices.userByEmail(email), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }


    @RequestMapping(value = "/newUsuario",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> postUsuario(@RequestBody usuario usuario){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(neighborhoodServices.postUsuario(usuario), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/unidadesDeViviendaByEmail/{email}",method = RequestMethod.GET)
    public ResponseEntity<?> getUnidadesDeViviendaByEmail(@PathVariable("email") String email){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(neighborhoodServices.getUnidadesDeViviendaByEmail(email), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/agrupacion",method = RequestMethod.GET)
    public ResponseEntity<?> getAgrupacion(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(neighborhoodServices.getAgrupacion(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/tipoAgrupacionConjunto",method = RequestMethod.GET)
    public ResponseEntity<?> gettipoAgrupacionConjunto(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(neighborhoodServices.tipoAgrupacionConjunto(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/tipoInmuebleConjunto",method = RequestMethod.GET)
    public ResponseEntity<?> gettipoInmuebleConjunto(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(neighborhoodServices.tipoInmuebleConjunto(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/tipoAgrupacion",method = RequestMethod.GET)
    public ResponseEntity<?> gettipoAgrupacion(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(neighborhoodServices.tipoAgrupacion(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/tipoInmueble",method = RequestMethod.GET)
    public ResponseEntity<?> gettipoInmueble(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(neighborhoodServices.tipoInmueble(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/autorizado/{idconjunto}/{idusuario}/{idConjuntoUsuario}/{idUnidadDeVivienda}/{idUnidadDeViviendaUsuario}/{idAgrupacion}/{idTipoAgrupacionConjunto}/{idTipoInmuebleConjunto}/{idTipoAgrupacion}/{idTipoInmueble}",method = RequestMethod.POST)
    public ResponseEntity<?> autorizado(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoUsuario") int idConjuntoUsuario, @PathVariable("idUnidadDeVivienda") int idUnidadDeVivienda, @PathVariable("idUnidadDeViviendaUsuario") int idUnidadDeViviendaUsuario, @PathVariable("idAgrupacion") int idAgrupacion, @PathVariable("idTipoAgrupacionConjunto") int idTipoAgrupacionConjunto, @PathVariable("idTipoInmuebleConjunto") int idTipoInmuebleConjunto, @PathVariable("idTipoAgrupacion") int idTipoAgrupacion, @PathVariable("idTipoInmueble") int idTipoInmueble){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(neighborhoodServices.autorizado(idconjunto,idusuario,idConjuntoUsuario,idUnidadDeVivienda,idUnidadDeViviendaUsuario,idAgrupacion,idTipoAgrupacionConjunto,idTipoInmuebleConjunto,idTipoAgrupacion,idTipoInmueble), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

}
