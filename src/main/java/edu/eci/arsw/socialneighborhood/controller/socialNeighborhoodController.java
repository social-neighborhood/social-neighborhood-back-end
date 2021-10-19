package edu.eci.arsw.socialneighborhood.controller;

import edu.eci.arsw.socialneighborhood.services.socialNeighborhoodServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/admin")
public class socialNeighborhoodController {
    @Autowired
    @Qualifier("socialNeighborhoodServices")
    private socialNeighborhoodServices neighborhoodServices;

    @RequestMapping(value = "/conjuntosByUser/{email}",method = RequestMethod.GET)
    public ResponseEntity<?> getconjuntosByUser(@PathVariable("email") String email){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(socialNeighborhoodServices.getconjuntosByUser(email), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

}
