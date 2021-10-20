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

}
