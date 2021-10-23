package edu.eci.arsw.socialneighborhood.controller;

import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.repository.tipoInmuebleRepository;
import edu.eci.arsw.socialneighborhood.services.adminServices;
import edu.eci.arsw.socialneighborhood.services.commonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "*", methods= {RequestMethod.OPTIONS})
public class adminController {
    @Autowired
    @Qualifier("adminServices")
    private adminServices adminServices;

    @Autowired
    @Qualifier("commonServices")
    private commonServices commonServices;

    @Autowired
    private tipoInmuebleRepository inmuebleRepository;

    @RequestMapping(value = "/TipoAgrupacionesGeneral",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoAgrupacion() {
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.getTipoAgrupacion(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/TipoInmueblesGeneral",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoInmuebles(){
        try {
            return new ResponseEntity<>(adminServices.getTipoInmueble(),HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/TipoAgrupacionesPropia",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoAgrupacionPropia(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.getTipoAgrupacionPropia(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/TipoInmueblesPropia",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoInmueblesPropia(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.getTipoInmueblesPropia(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/TipoAgrupacionById/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoAgrupacionById(@PathVariable("id") int id){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.getTipoAgrupacionById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/TipoInmuebleById/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoInmuebleById(@PathVariable("id") int id){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.getTipoInmuebleById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/newTipoAgrupacion",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> postTipoAgrupacion(@RequestBody tipoAgrupacionConjunto agrupacionConjunto){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.postTipoAgrupacion(agrupacionConjunto), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/newInmueble",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> postTipoInmueble(@RequestBody tipoInmuebleConjunto inmuebleConjunto){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.postTipoInmueble(inmuebleConjunto), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/UnidadDeVivinenda",method = RequestMethod.GET)
    public ResponseEntity<?> getUnidadDeVivinenda(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.getUnidadDeVivinenda(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/UnidadDeVivinendaById/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getUnidadDeVivinendaById(@PathVariable("id") int id){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.getUnidadDeVivinendaById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/updateUnidadDeVivinenda",method = RequestMethod.PUT)
    @ResponseBody
    public ResponseEntity<?> putUnidadDeVivinenda(@RequestBody unidadDeVivienda unidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.putUnidadDeVivinenda(unidadDeVivienda), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/newUnidadDeVivinenda",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> postUnidadDeVivinenda(@RequestBody unidadDeVivienda unidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.postUnidadDeVivinenda(unidadDeVivienda), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/Usuario",method = RequestMethod.GET)
    public ResponseEntity<?> getConjuntoUsuario(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.getConjuntoUsuario(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/UsuarioById/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getConjuntoUsuarioById(@PathVariable("id") int id){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.getUsuarioById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }


    @RequestMapping(value = "/newConjuntoUsuario",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> postConjuntoUsuario(@RequestBody conjuntoUsuario conjuntoUsuario){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.postConjuntoUsuario(conjuntoUsuario), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/zonaComun",method = RequestMethod.GET)
    public ResponseEntity<?> getzonaComun(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.getzonaComun(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/zonaComunConjunto",method = RequestMethod.GET)
    public ResponseEntity<?> getzonaComunConjunto(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.getzonaComunConjunto(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/updatezonaComunConjunto",method = RequestMethod.PUT)
    @ResponseBody
    public ResponseEntity<?> putzonaComunConjunto(@RequestBody zonaComunConjunto zonaComunConjunto){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.putzonaComunConjunto(zonaComunConjunto), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/newzonaComunConjunto",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> postzonaComunConjunto(@RequestBody zonaComunConjunto zonaComunConjunto){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.postzonaComunConjunto(zonaComunConjunto), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/Agrupacion",method = RequestMethod.GET)
    public ResponseEntity<?> getAgrupacion(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.getAgrupacion(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/newAgrupacion",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> postAgrupacion(@RequestBody agrupacion agrupacion){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.postAgrupacion(agrupacion), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/updateUnidadDeViviendaUsuario",method = RequestMethod.PUT)
    @ResponseBody
    public ResponseEntity<?> putUnidadDeViviendaUsuario(@RequestBody unidadDeViviendaUsuario unidadDeViviendaUsuario){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.putUnidadDeViviendaUsuario(unidadDeViviendaUsuario), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/newUnidadDeViviendaUsuario",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> postUnidadDeViviendaUsuario(@RequestBody unidadDeViviendaUsuario unidadDeViviendaUsuario){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.postUnidadDeViviendaUsuario(unidadDeViviendaUsuario), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

}
