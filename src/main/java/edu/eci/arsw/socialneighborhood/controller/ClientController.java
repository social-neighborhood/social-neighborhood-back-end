package edu.eci.arsw.socialneighborhood.controller;

import edu.eci.arsw.socialneighborhood.cache.Cache;
import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.cache.cacheItem.CacheItemClient;
import edu.eci.arsw.socialneighborhood.services.ClientServices;
import edu.eci.arsw.socialneighborhood.services.CommonServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

    private SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

    private SimpleDateFormat formatoH = new SimpleDateFormat("yyyy-MM-dd H:mm");

    private DateTimeFormatter lformat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

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

    @RequestMapping(value = "/HorasFinAlquiler/{fechainicio}/{horainicio}/{idZonaComun}",method = RequestMethod.GET)
    public synchronized ResponseEntity<?> getHorasFinAlquiler(@PathVariable("fechainicio") String fechainicio, @PathVariable("horainicio") String horainicio,@PathVariable("idZonaComun") int idZonaComun){
        try {
            //obtener datos que se enviarán a través del API
            long fechai= formatoH.parse(fechainicio+" "+ horainicio).getTime();
            return new ResponseEntity<>(clientServices.getHorasFinAlquiler(fechai,fechainicio,horainicio,idZonaComun).toString(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/HorasInicioAlquiler/{fechainicio}/{idZonaComun}",method = RequestMethod.GET)
    public synchronized ResponseEntity<?> getHorasInicioAlquiler(@PathVariable("fechainicio") String fechainicio,@PathVariable("idZonaComun") int idZonaComun){
        try {
            //obtener datos que se enviarán a través del API
            long fechai= formato.parse(fechainicio).getTime();
            long fechaf= formato.parse((LocalDate.parse(fechainicio, lformat).plusDays(1)).toString()).getTime();
            long fecham= formato.parse((LocalDate.parse(fechainicio, lformat).plusDays(2)).toString()).getTime();
            return new ResponseEntity<>(clientServices.getHorasInicioAlquiler(fechai,fechaf,fecham,fechainicio,idZonaComun).toString(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/PostsDeAdmin/{idconjunto}",method = RequestMethod.GET)
    public ResponseEntity<?> getPostsDeAdmin(@PathVariable("idconjunto") int idconjunto){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.getPostDeAdmin(idconjunto), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/PostsDeClient/{idconjunto}",method = RequestMethod.GET)
    public ResponseEntity<?> getPostsDeClient(@PathVariable("idconjunto") int idconjunto){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.getPostDeClient(idconjunto), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/Alquileres/{idconjunto}/{idusuario}/{idUnidadDeVivienda}",method = RequestMethod.GET)
    public synchronized ResponseEntity<?> getAlquileres(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idUnidadDeVivienda") int idUnidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(getCacheItemClient(idconjunto, idusuario, idUnidadDeVivienda).getAlquileres(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/newAlquiler/{inicio}/{fin}/{idzonacomun}/{idconjunto}/{idusuario}/{idUnidadDeVivienda}",method = RequestMethod.POST)
    public synchronized ResponseEntity<?> postAlquiler(@PathVariable("inicio") long inicio,@PathVariable("fin") long fin, @PathVariable("idzonacomun") int idzonacomun, @PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idUnidadDeVivienda") int idUnidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(clientServices.postAlquiler(inicio,fin,idzonacomun,getCacheItemClient(idconjunto, idusuario, idUnidadDeVivienda).getUnidadDeViviendaUsuario().getId()), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/newPost",method = RequestMethod.POST)
    @ResponseBody
    public synchronized ResponseEntity<?> postPost(@RequestBody Posts posts){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(clientServices.postPostClient(posts), HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/updateUsuarioPropio",method = RequestMethod.PUT)
    @ResponseBody
    public synchronized ResponseEntity<?> putUsuarioPropio(@RequestBody Usuario usuario) {
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.putUsuarioPropio(usuario), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error", HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/cancelarAlquiler/{id}",method = RequestMethod.PUT)
    public synchronized ResponseEntity<?> putAlquiler(@PathVariable("id") int id) {
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(commonServices.putAlquiler(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error", HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/autorizadoClient/{idconjunto}/{idusuario}/{idUnidadDeVivienda}",method = RequestMethod.POST)
    public synchronized ResponseEntity<?> autorizadoClient(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idUnidadDeVivienda") int idUnidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            cache.loginClient(idconjunto,idusuario,idUnidadDeVivienda,commonServices,clientServices);
            return new ResponseEntity<>(cache, HttpStatus.OK);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

    private synchronized CacheItemClient getCacheItemClient(int idconjunto, int idusuario, int idUnidadDeVivienda) throws ParseException {
        cache.loginClient(idconjunto,idusuario,idUnidadDeVivienda,commonServices,clientServices);
        return cache.getClient(idconjunto, idusuario, idUnidadDeVivienda);
    }

    @RequestMapping(value = "/consulta/{idconjunto}/{idusuario}/{idUnidadDeVivienda}",method = RequestMethod.GET)
    public synchronized ResponseEntity<?> consulta(@PathVariable("idconjunto") int idconjunto, @PathVariable("idusuario") int idusuario, @PathVariable("idUnidadDeVivienda") int idUnidadDeVivienda){
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(cache.getClient(idconjunto, idusuario, idUnidadDeVivienda), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(SocialNeighborhoodController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }

}
