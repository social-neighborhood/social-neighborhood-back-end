package edu.eci.arsw.socialneighborhood.controller;

import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.persistence.cache.cache;
import edu.eci.arsw.socialneighborhood.persistence.cache.cacheAdmin;
import edu.eci.arsw.socialneighborhood.services.adminServices;
import edu.eci.arsw.socialneighborhood.services.commonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/admin")
public class adminController {

    @Resource(name ="adminServices")
    adminServices adminServices;


    @Resource(name ="commonServices")
    commonServices commonServices;

    @Resource(name = "cacheAdmin")
    cacheAdmin cache;

    public cache getCache() {
        return cache;
    }

    public void setCache(cacheAdmin cache) {
        this.cache = cache;
    }

    @RequestMapping(value = "/TipoAgrupacionesGeneral",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoAgrupacion() {
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getTipoAgrupaciones(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/TipoInmueblesGeneral",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoInmuebles(){
        try {
            return new ResponseEntity<>(cache.getTipoInmuebles(),HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/TipoAgrupacionesPropia",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoAgrupacionPropia(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getTipoAgrupacionesConjunto(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/TipoInmueblesPropia",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoInmueblesPropia(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getTipoInmueblesConjuntos(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }


    @RequestMapping(value = "/UnidadDeVivienda",method = RequestMethod.GET)
    public ResponseEntity<?> getUnidadDeVivienda(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getUnidadesDeVivienda(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/UnidadDeViviendaById/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getUnidadDeViviendaById(@PathVariable("id") int id){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getUnidadesDeViviendaById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/conjuntoUsuario",method = RequestMethod.GET)
    public ResponseEntity<?> getConjuntoUsuario(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getConjuntoUsuarios(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/conjuntoUsuarioById/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getConjuntoUsuarioById(@PathVariable("id") int id){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.getConjuntoUsuarioByIDConjunto(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/Usuario",method = RequestMethod.GET)
    public ResponseEntity<?> getUsuarios(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getUsuarios(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/UsuarioById/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getUsuarioById(@PathVariable("id") int id){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getUsuarioById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/zonaComun",method = RequestMethod.GET)
    public ResponseEntity<?> getzonaComun(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getZonasComunes(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/zonaComunConjunto",method = RequestMethod.GET)
    public ResponseEntity<?> getzonaComunConjunto(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getZonasComunesConjunto(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/Agrupacion",method = RequestMethod.GET)
    public ResponseEntity<?> getAgrupacion(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getAgrupaciones(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/unidadDeViviendaUsuario",method = RequestMethod.GET)
    public ResponseEntity<?> getunidadDeViviendaUsuario(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getUnidadesDeViviendaUsuarios(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/conjuntoAdministrador",method = RequestMethod.GET)
    public ResponseEntity<?> getConjuntoAdministrador(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getConjuntoAdministrador(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/alquileres",method = RequestMethod.GET)
    public ResponseEntity<?> getAlquileres(){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.getAlquileres(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/agrupacionById/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getAgrupacionById(@PathVariable("id") int id){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getAgrupacionById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/tipoAgrupacionConjuntoById/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoAgrupacionConjuntoById(@PathVariable("id") int id){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getTipoAgrupacionConjuntoById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/tipoInmuebleConjuntoById/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoInmuebleConjuntoById(@PathVariable("id") int id){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getTipoInmuebleConjuntoById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/tipoAgrupacionById/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoAgrupacionById(@PathVariable("id") int id){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getTipoAgrupacionById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/tipoInmuebleById/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> gettipoInmuebleById(@PathVariable("id") int id){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getTipoInmuebleById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/userByEmail/{email}",method = RequestMethod.GET)
    public ResponseEntity<?> getuserByEmail(@PathVariable("email") String email){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.userByEmail(email), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/newUnidadDeVivienda",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> postUnidadDeVivienda(@RequestBody unidadDeVivienda unidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.postUnidadesDeVivienda(unidadDeVivienda), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/newConjuntoUsuario",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> postConjuntoUsuario(@RequestBody conjuntoUsuario conjuntoUsuario){
        try {
            conjuntoUsuario.setIdConjunto(cache.getConjunto().getId());
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.postConjuntoUsuarios(conjuntoUsuario), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/newzonaComunConjunto",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> postzonaComunConjunto(@RequestBody zonaComunConjunto zonaComunConjunto){
        try {
            zonaComunConjunto.setIdConjunto(cache.getConjunto().getId());
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.postZonasComunesConjunto(zonaComunConjunto), HttpStatus.OK);
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
            return new ResponseEntity<>(adminServices.postAgrupaciones(agrupacion), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/newUnidadDeViviendaUsuario",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> postUnidadDeViviendaUsuario(@RequestBody unidadDeViviendaUsuario unidadDeViviendaUsuario){
        try {
            unidadDeViviendaUsuario.setDisponible(true);
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.postUnidadesDeViviendaUsuarios(unidadDeViviendaUsuario), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/newTipoAgrupacion",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> postTipoAgrupacion(@RequestBody tipoAgrupacionConjunto agrupacionConjunto){
        try {
            agrupacionConjunto.setIdConjunto(cache.getConjunto().getId());
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.postTipoAgrupacionesConjunto(agrupacionConjunto), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/newInmueble",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> postTipoInmueble(@RequestBody tipoInmuebleConjunto inmuebleConjunto){
        try {
            inmuebleConjunto.setIdConjunto(cache.getConjunto().getId());
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.postTipoInmueblesConjuntos(inmuebleConjunto), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/updateUnidadDeVivienda",method = RequestMethod.PUT)
    @ResponseBody
    public ResponseEntity<?> putUnidadDeVivienda(@RequestBody unidadDeVivienda unidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.putUnidadesDeVivienda(unidadDeVivienda), HttpStatus.ACCEPTED);
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
            return new ResponseEntity<>(adminServices.putZonasComunesConjunto(zonaComunConjunto), HttpStatus.ACCEPTED);
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
            return new ResponseEntity<>(adminServices.putUnidadesDeViviendaUsuarios(unidadDeViviendaUsuario), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/updateUsuarioPropio",method = RequestMethod.PUT)
    @ResponseBody
    public ResponseEntity<?> putUsuarioPropio(@RequestBody usuario usuario){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.putUsuarioPropio(usuario), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/actualiza",method = RequestMethod.POST)
    public ResponseEntity<?> putUsuarioPropio() {
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.actualizaCacheAdmin(), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(adminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error", HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/autorizadoAdmin/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> autorizadoAdmin(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            cache=new cacheAdmin(idconjunto,idusuario,idConjuntoAdministrador,commonServices,adminServices);
            return new ResponseEntity<>(cache, HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(socialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }


}
