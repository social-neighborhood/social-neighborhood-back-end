package edu.eci.arsw.socialneighborhood.controller;

import edu.eci.arsw.socialneighborhood.cache.Cache;
import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.cache.cacheItem.CacheItemAdmin;
import edu.eci.arsw.socialneighborhood.services.AdminServices;
import edu.eci.arsw.socialneighborhood.services.CommonServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource(name ="adminServices")
    AdminServices adminServices;


    @Resource(name ="commonServices")
    CommonServices commonServices;

    @Resource(name = "cache")
    Cache cache;

    @RequestMapping(value = "/TipoAgrupacionesGeneral/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoAgrupacion(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador) {
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getTipoAgrupaciones(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/TipoInmueblesGeneral/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoInmuebles(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getTipoInmuebles(),HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/TipoAgrupacionesPropia/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoAgrupacionPropia(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getTipoAgrupacionesConjunto(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/TipoInmueblesPropia/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoInmueblesPropia(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getTipoInmueblesConjuntos(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @RequestMapping(value = "/UnidadDeVivienda/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getUnidadDeVivienda(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getUnidadesDeVivienda(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/UnidadDeViviendaById/{id}/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getUnidadDeViviendaById(@PathVariable("id") int id, @PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getUnidadesDeViviendaById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/conjuntoUsuario/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getConjuntoUsuario(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getConjuntoUsuarios(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/conjuntoUsuarioById/{id}/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getConjuntoUsuarioById(@PathVariable("id") int id, @PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getConjuntoUsuarioById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/Usuario/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getUsuarios(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getUsuarios(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/UsuarioById/{id}/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getUsuarioById(@PathVariable("id") int id, @PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getUsuarioById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/zonaComun/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getzonaComun(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getZonasComunes(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/zonaComunConjunto/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getzonaComunConjunto(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getZonasComunesConjunto(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/Agrupacion/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getAgrupacion(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getAgrupaciones(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/unidadDeViviendaUsuario/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getunidadDeViviendaUsuario(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getUnidadesDeViviendaUsuarios(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/unidadesDeViviendaConjuto/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getunidadesDeViviendaConjuto(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).unidadesDeViviendaConjuto().toString(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/conjuntoAdministrador/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getConjuntoAdministrador(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getConjuntoAdministrador(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/alquileres/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getAlquileres(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getAlquileres(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/agrupacionById/{id}/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getAgrupacionById(@PathVariable("id") int id, @PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getAgrupacionById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/tipoAgrupacionConjuntoById/{id}/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoAgrupacionConjuntoById(@PathVariable("id") int id, @PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getTipoAgrupacionConjuntoById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/tipoInmuebleConjuntoById/{id}/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoInmuebleConjuntoById(@PathVariable("id") int id, @PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getTipoInmuebleConjuntoById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/tipoAgrupacionById/{id}/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getTipoAgrupacionById(@PathVariable("id") int id, @PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getTipoAgrupacionById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/tipoInmuebleById/{id}/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> gettipoInmuebleById(@PathVariable("id") int id, @PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getTipoInmuebleById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/userByEmail/{email}/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public ResponseEntity<?> getuserByEmail(@PathVariable("email") String email, @PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).userByEmail(email), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/PostsDeAdmin/{idconjunto}",method = RequestMethod.GET)
    public ResponseEntity<?> getPostsDeAdmin(@PathVariable("idconjunto") int idconjunto){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.getPostDeAdmin(idconjunto), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/PostsDeClient/{idconjunto}",method = RequestMethod.GET)
    public ResponseEntity<?> getPostsDeClient(@PathVariable("idconjunto") int idconjunto){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.getPostDeClient(idconjunto), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/newUnidadDeVivienda",method = RequestMethod.POST)
    @ResponseBody
    public synchronized ResponseEntity<?> postUnidadDeVivienda(@RequestBody UnidadDeVivienda unidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.postUnidadesDeVivienda(unidadDeVivienda), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/newConjuntoUsuario/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.POST)
    @ResponseBody
    public synchronized ResponseEntity<?> postConjuntoUsuario(@RequestBody ConjuntoUsuario conjuntoUsuario,@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            conjuntoUsuario.setIdConjunto(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getConjunto().getId());
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.postConjuntoUsuarios(conjuntoUsuario), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/newzonaComunConjunto/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.POST)
    @ResponseBody
    public synchronized ResponseEntity<?> postzonaComunConjunto(@RequestBody ZonaComunConjunto zonaComunConjunto, @PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.postZonasComunesConjunto(zonaComunConjunto), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/newAgrupacion",method = RequestMethod.POST)
    @ResponseBody
    public synchronized ResponseEntity<?> postAgrupacion(@RequestBody Agrupacion agrupacion){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.postAgrupaciones(agrupacion), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/newUnidadDeViviendaUsuario",method = RequestMethod.POST)
    @ResponseBody
    public synchronized ResponseEntity<?> postUnidadDeViviendaUsuario(@RequestBody UnidadDeViviendaUsuario unidadDeViviendaUsuario){
        try {
            unidadDeViviendaUsuario.setDisponible(true);
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.postUnidadesDeViviendaUsuarios(unidadDeViviendaUsuario), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/newTipoAgrupacion/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.POST)
    @ResponseBody
    public synchronized ResponseEntity<?> postTipoAgrupacion(@RequestBody TipoAgrupacionConjunto agrupacionConjunto, @PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            agrupacionConjunto.setIdConjunto(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getConjunto().getId());
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.postTipoAgrupacionesConjunto(agrupacionConjunto), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/newInmueble/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.POST)
    @ResponseBody
    public synchronized ResponseEntity<?> postTipoInmueble(@RequestBody TipoInmuebleConjunto inmuebleConjunto, @PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            inmuebleConjunto.setIdConjunto(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador).getConjunto().getId());
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.postTipoInmueblesConjuntos(inmuebleConjunto), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/updateUnidadDeVivienda",method = RequestMethod.PUT)
    @ResponseBody
    public synchronized ResponseEntity<?> putUnidadDeVivienda(@RequestBody UnidadDeVivienda unidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.putUnidadesDeVivienda(unidadDeVivienda), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/updatezonaComunConjunto",method = RequestMethod.PUT)
    @ResponseBody
    public synchronized ResponseEntity<?> putzonaComunConjunto(@RequestBody ZonaComunConjunto zonaComunConjunto){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.putZonasComunesConjunto(zonaComunConjunto), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/updateUnidadDeViviendaUsuario",method = RequestMethod.PUT)
    @ResponseBody
    public synchronized ResponseEntity<?> putUnidadDeViviendaUsuario(@RequestBody UnidadDeViviendaUsuario unidadDeViviendaUsuario){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.putUnidadesDeViviendaUsuarios(unidadDeViviendaUsuario), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/newPost",method = RequestMethod.POST)
    @ResponseBody
    public synchronized ResponseEntity<?> postPost(@RequestBody Posts posts){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.postPostAdmin(posts), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/registrarUsuario",method = RequestMethod.POST)
    @ResponseBody
    public synchronized ResponseEntity<?> registrarUsuario(@RequestBody ConjuntoUsuario conjuntoUsuario){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(adminServices.registrarUsuario(conjuntoUsuario), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/updateUsuarioPropio",method = RequestMethod.PUT)
    @ResponseBody
    public synchronized ResponseEntity<?> putUsuarioPropio(@RequestBody Usuario usuario){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.putUsuarioPropio(usuario), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/autorizadoAdmin/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.POST)
    public synchronized ResponseEntity<?> autorizadoAdmin(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            cache.loginAdmin(idconjunto, idusuario, idConjuntoAdministrador,commonServices,adminServices);
            return new ResponseEntity<>(getCacheItemAdmin(idconjunto, idusuario, idConjuntoAdministrador), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private synchronized CacheItemAdmin getCacheItemAdmin(int idconjunto, int idusuario, int idConjuntoAdministrador) throws ParseException {
        return cache.getAdmin(idconjunto, idusuario, idConjuntoAdministrador, commonServices, adminServices);
    }

    @RequestMapping(value = "/consulta/{idconjunto}/{idusuario}/{idConjuntoadministrador}",method = RequestMethod.GET)
    public synchronized ResponseEntity<?> consulta(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idConjuntoadministrador") int idConjuntoAdministrador){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getAdmin(idconjunto, idusuario, idConjuntoAdministrador, commonServices, adminServices), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
