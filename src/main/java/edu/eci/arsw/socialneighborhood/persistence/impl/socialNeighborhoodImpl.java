package edu.eci.arsw.socialneighborhood.persistence.impl;

import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.persistence.socialNeighborhood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import edu.eci.arsw.socialneighborhood.repository.*;

import java.util.ArrayList;
import java.util.List;

@Service("socialNeighborhoodImpl")
public class socialNeighborhoodImpl implements socialNeighborhood {

    @Autowired
    @Qualifier("tipoInmuebleRepository")
    tipoInmuebleRepository tipoInmuebleRepository;

    @Autowired
    @Qualifier("tipoAgrupacionRepository")
    tipoAgrupacionRepository tipoAgrupacionRepository;

    @Autowired
    @Qualifier("tipoAgrupacionConjuntoRepository")
    tipoAgrupacionConjuntoRepository tipoAgrupacionConjuntoRepository;

    @Autowired
    @Qualifier("tipoInmuebleConjuntoRepository")
    tipoInmuebleConjuntoRepository tipoInmuebleConjuntoRepository;

    @Autowired
    @Qualifier("unidadDeViviendaRepository")
    unidadDeViviendaRepository unidadDeViviendaRepository;

    @Autowired
    @Qualifier("usuarioRepository")
    usuarioRepository usuarioRepository;

    @Autowired
    @Qualifier("zonaComunConjuntoRepository")
    zonaComunConjuntoRepository zonaComunConjuntoRepository;

    @Autowired
    @Qualifier("agrupacionRepository")
    agrupacionRepository agrupacionRepository;

    @Autowired
    @Qualifier("unidadDeViviendaUsuarioRepository")
    unidadDeViviendaUsuarioRepository unidadDeViviendaUsuarioRepository;

    @Autowired
    @Qualifier("conjuntoUsuarioRepository")
    conjuntoUsuarioRepository conjuntoUsuarioRepository ;

    @Autowired
    @Qualifier("conjuntoRepository")
    conjuntoRepository conjuntoRepository ;

    @Autowired
    @Qualifier("zonaComunRepository")
    zonaComunRepository zonaComunRepository;

    @Autowired
    @Qualifier("conjuntoAdministradorRepository")
    conjuntoAdministradorRepository conjuntoAdministradorRepository;

    @Autowired
    @Qualifier("alquilerRepository")
    alquilerRepository alquilerRepository;

    @Override
    public List<tipoAgrupacion> getTipoAgrupacion() {
        return tipoAgrupacionRepository.findAll();
    }

    @Override
    public List<tipoInmueble> getTipoInmueble() {
        return  tipoInmuebleRepository.findAll();
    }

    @Override
    public List<tipoAgrupacionConjunto> getTipoAgrupacionPropia() {
        return tipoAgrupacionConjuntoRepository.findAll();
    }

    @Override
    public List<tipoInmuebleConjunto> getTipoInmueblesPropia() {
        return tipoInmuebleConjuntoRepository.findAll();
    }

    @Override
    public List<unidadDeVivienda> getUnidadDeVivinenda() {
        return unidadDeViviendaRepository.findAll();
    }


    @Override
    public List<conjuntoUsuario> getConjuntosByEmaill(String email) {
        List<usuario> usuarios=usuarioRepository.findAll();
        List<conjuntoUsuario> conjuntosUsuario = null;
        List<conjuntoUsuario> conjuntosUsuarioList= conjuntoUsuarioRepository.findAll();
        for (usuario usuario: usuarios){
            if(usuario.getEmail().equals(email)){
                for (conjuntoUsuario conjuntoUsuario: conjuntosUsuarioList){
                    if (conjuntoUsuario.getIdUsuario().equals(usuario.getId())){
                        conjuntosUsuario.add(conjuntoUsuario);
                    }
                }
                return conjuntosUsuario;
            }
        }
        return null;
    }

    @Override
    public List<conjunto> getConjuntos() {
        return conjuntoRepository.findAll();
    }

    @Override
    public List<usuario> getConjuntoUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public List<agrupacion> getAgrupacion() {
        System.out.println(Math.toIntExact(usuarioRepository.count()));
        return agrupacionRepository.findAll();
    }

    @Override
    public List<unidadDeVivienda> getUnidadDeVivinendaByEmail(String email) {
        List<usuario> usuarios = usuarioRepository.findAll();
        List<conjuntoUsuario> conjuntoUsuarios = conjuntoUsuarioRepository.findAll();
        List<unidadDeVivienda> unidadDeViviendas = new ArrayList<unidadDeVivienda>();
        List<unidadDeVivienda> unidadDeViviendaList = unidadDeViviendaRepository.findAll();
        List<unidadDeViviendaUsuario> unidadDeViviendaUsuarios = unidadDeViviendaUsuarioRepository.findAll();
        for (usuario usuario1:usuarios){
            if(usuario1.getEmail().equals(email)){
                for (conjuntoUsuario conjuntoUsuario: conjuntoUsuarios){
                    if (conjuntoUsuario.getIdUsuario().equals(usuario1.getId())){
                        for (unidadDeViviendaUsuario unidadDeViviendaUsuario:unidadDeViviendaUsuarios){
                            if (conjuntoUsuario.getId().equals(unidadDeViviendaUsuario.getIdConjuntoUsuario())){
                                for (unidadDeVivienda unidadDeVivienda: unidadDeViviendaList){
                                    if (unidadDeVivienda.getId().equals(unidadDeViviendaUsuario.getIdUnidadDeVivienda())){
                                        unidadDeViviendas.add(unidadDeVivienda);
                                    }
                                }
                            }
                        }
                    }
                }
                return unidadDeViviendas;
            }
        }

        return null;
    }

    @Override
    public conjunto getConjuntoById(int id) {
        return conjuntoRepository.getById(id);
    }

    @Override
    public usuario getUsuarioById(int id) {
        return usuarioRepository.getById(id);
    }

    @Override
    public conjuntoUsuario getConjuntoUsuarioByConjuntoUsuario(int idconjunto, int idusuario) {
        List<conjuntoUsuario> conjuntoUsuarioList=conjuntoUsuarioRepository.findAll();
        for (conjuntoUsuario conjuntoUsuario:conjuntoUsuarioList){
            if(conjuntoUsuario.getIdConjunto().equals(idconjunto) && conjuntoUsuario.getIdUsuario().equals(idusuario)){
                return conjuntoUsuario;
            }
        }
        return null;
    }

    @Override
    public unidadDeVivienda getUnidadDeViviendaByID(int id) {
        return unidadDeViviendaRepository.getById(id);
    }

    @Override
    public unidadDeViviendaUsuario getUnidadDeVivendaUsuarioByID(int idUnidadDeVivienda, int idConjuntoUsuario) {
        List<unidadDeViviendaUsuario> unidadDeViviendaUsuarios=unidadDeViviendaUsuarioRepository.findAll();
        for (unidadDeViviendaUsuario unidadDeViviendaUsuario:unidadDeViviendaUsuarios){
            if(unidadDeViviendaUsuario.getIdConjuntoUsuario().equals(idConjuntoUsuario) && unidadDeViviendaUsuario.getIdUnidadDeVivienda().equals(idUnidadDeVivienda)){
                return unidadDeViviendaUsuario;
            }
        }
        return null;
    }

    @Override
    public agrupacion getAgrupacionByID(int idAgrupacion) {
        return agrupacionRepository.getById(idAgrupacion);
    }

    @Override
    public tipoAgrupacion getTipoAgrupacionByID(int idTipoAgrupacion) {
        return tipoAgrupacionRepository.getById(idTipoAgrupacion);
    }

    @Override
    public tipoInmueble getTipoinmuebleByID(int idTipoInmueble) {
        return tipoInmuebleRepository.getById(idTipoInmueble);
    }

    @Override
    public tipoAgrupacionConjunto getTipoAgrupacionConjuntoByID(int idTipoAgrupacionConjunto) {
        return tipoAgrupacionConjuntoRepository.getById(idTipoAgrupacionConjunto);
    }

    @Override
    public tipoInmuebleConjunto getTipoInmuebleConjuntoByID(int idTipoInmuebleConjunto) {
        return tipoInmuebleConjuntoRepository.getById(idTipoInmuebleConjunto);
    }

    @Override
    public List<zonaComunConjunto> getZonasComunesConjuntoByIdConjunto(int idconjunto) {
        List<zonaComunConjunto> zonasComunesConjunto=null;
        List<zonaComunConjunto> zonaComunConjuntoList=zonaComunConjuntoRepository.findAll();
        for(zonaComunConjunto zonaComunConjunto:zonaComunConjuntoList){
            if (zonaComunConjunto.getIdConjunto().equals(idconjunto)){
                zonasComunesConjunto.add(zonaComunConjunto);
            }
        }
        return zonasComunesConjunto;
    }

    @Override
    public List<zonaComun> getZonasComunesByZonasComunesConjunto(List<zonaComunConjunto> zonasComunesConjunto) {
        List<zonaComun> zonasComunes= null;
        for (zonaComunConjunto zonaComunConjunto: zonasComunesConjunto){
            zonasComunes.add(zonaComunRepository.getById(zonaComunConjunto.getIdZonaComun()));
        }
        return zonasComunes;
    }

    @Override
    public conjuntoAdministrador getCojuntoAdministradorByID(int idConjuntoAdministrador) {
        return conjuntoAdministradorRepository.getById(idConjuntoAdministrador);
    }

    @Override
    public List<zonaComun> getZonasComunes() {
        return zonaComunRepository.findAll();
    }

    @Override
    public List<conjuntoUsuario> getConjuntoUsuarioByIDConjunto(int idconjunto) {
        List<conjuntoUsuario> conjuntoUsuarios=null;
        List<conjuntoUsuario> conjuntoUsuarioList=conjuntoUsuarioRepository.findAll();
        for(conjuntoUsuario conjuntoUsuario: conjuntoUsuarioList){
            if(conjuntoUsuario.getIdConjunto().equals(idconjunto)){
                conjuntoUsuarios.add(conjuntoUsuario);
            }
        }
        return conjuntoUsuarios;
    }

    @Override
    public List<usuario> getUsuariosByConjuntoUsuarios(List<conjuntoUsuario> conjuntoUsuarios) {
        List<usuario> usuarios=null;
        for (conjuntoUsuario conjuntoUsuario: conjuntoUsuarios){
            usuarios.add(usuarioRepository.getById(conjuntoUsuario.getIdUsuario()));
        }
        return usuarios;
    }

    @Override
    public List<unidadDeViviendaUsuario> getUnidadesDeViviendaUsuariosByConjuntoUsuarios(List<conjuntoUsuario> conjuntoUsuarios) {
        List<unidadDeViviendaUsuario> unidadesDeViviendaUsuarios=null;
        List<unidadDeViviendaUsuario> unidadDeViviendaUsuarioList=unidadDeViviendaUsuarioRepository.findAll();
        for (unidadDeViviendaUsuario unidadDeViviendaUsuario:unidadDeViviendaUsuarioList){
            for (conjuntoUsuario conjuntoUsuario: conjuntoUsuarios){
                if(unidadDeViviendaUsuario.getIdConjuntoUsuario().equals(conjuntoUsuario.getId())){
                    unidadesDeViviendaUsuarios.add(unidadDeViviendaUsuario);
                }
            }
        }
        return unidadesDeViviendaUsuarios;
    }

    @Override
    public List<unidadDeVivienda> getUnidadesDeViviendaByIdConjunto(int idconjunto) {
        List<unidadDeVivienda> unidadesDeVivienda=null;
        List<unidadDeVivienda> unidadDeViviendaList=unidadDeViviendaRepository.findAll();
        for(unidadDeVivienda unidadDeVivienda: unidadDeViviendaList){
            if (tipoInmuebleConjuntoRepository.getById(unidadDeVivienda.getIdTipoInmuebleConjunto()).getIdConjunto().equals(idconjunto)){
                unidadesDeVivienda.add(unidadDeVivienda);
            }
        }
        return unidadesDeVivienda;
    }

    @Override
    public List<agrupacion> getAgrupacionByIdConjunto(int idconjunto) {
        List<agrupacion> agrupaciones = null;
        List<agrupacion> agrupacionList = agrupacionRepository.findAll();
        for (agrupacion agrupacion: agrupacionList){
            if (tipoAgrupacionConjuntoRepository.getById(agrupacion.getIdtipoagrupacionconjunto()).getIdConjunto().equals(idconjunto)){
                agrupaciones.add(agrupacion);
            }
        }
        return agrupaciones;
    }

    @Override
    public List<tipoInmuebleConjunto> getTipoInmuebleConjuntoByIdConjunto(int idconjunto) {
        List<tipoInmuebleConjunto> tipoInmuebleConjuntos=null;
        List<tipoInmuebleConjunto> tipoInmuebleConjuntoList=tipoInmuebleConjuntoRepository.findAll();
        for (tipoInmuebleConjunto tipoInmuebleConjunto:tipoInmuebleConjuntoList){
            if (tipoInmuebleConjunto.getIdConjunto().equals(idconjunto)){
                tipoInmuebleConjuntos.add(tipoInmuebleConjunto);
            }
        }
        return tipoInmuebleConjuntos;
    }

    @Override
    public List<tipoAgrupacionConjunto> getTipoAgrupacionConjuntoByIdConjunto(int idconjunto) {
        List<tipoAgrupacionConjunto> tipoAgrupacionConjuntos=null;
        List<tipoAgrupacionConjunto> tipoAgrupacionConjuntoList=tipoAgrupacionConjuntoRepository.findAll();
        for (tipoAgrupacionConjunto tipoAgrupacionConjunto: tipoAgrupacionConjuntoList){
            if (tipoAgrupacionConjunto.getIdConjunto().equals(idconjunto)){
                tipoAgrupacionConjuntos.add(tipoAgrupacionConjunto);
            }
        }
        return tipoAgrupacionConjuntos;
    }

    @Override
    public List<alquiler> getAlquileres() {
        return alquilerRepository.findAll();
    }

    @Override
    public usuario userByEmail(String email) {
        List<usuario> usuarios = usuarioRepository.findAll();
        for (usuario usuario: usuarios){
            if(usuario.getEmail().equals(email)){
                return usuarioRepository.getById(usuario.getId());
            }
        }
        return null;
    }

    @Override
    public Object postAgrupacion(agrupacion agrupacion) {
        agrupacion.setId(Math.toIntExact(agrupacionRepository.count())+1);
        return agrupacionRepository.save(agrupacion);
    }

    @Override
    public Object postConjuntoUsuario(conjuntoUsuario conjuntoUsuario) {
        conjuntoUsuario.setId(Math.toIntExact(conjuntoUsuarioRepository.count()+1));
        return conjuntoUsuarioRepository.save(conjuntoUsuario);
    }

    @Override
    public Object postzonaComunConjunto(zonaComunConjunto zonaComunConjunto) {
        zonaComunConjunto.setId(Math.toIntExact(zonaComunConjuntoRepository.count()+1));
        return zonaComunConjuntoRepository.save(zonaComunConjunto);
    }

    @Override
    public Object postTipoAgrupacion(tipoAgrupacionConjunto agrupacionConjunto) {
        agrupacionConjunto.setId(Math.toIntExact(tipoAgrupacionConjuntoRepository.count()+1));
        return tipoAgrupacionConjuntoRepository.save(agrupacionConjunto);
    }

    @Override
    public Object postTipoInmueble(tipoInmuebleConjunto inmuebleConjunto) {
        inmuebleConjunto.setId(Math.toIntExact(tipoInmuebleConjuntoRepository.count()+1));
        return tipoInmuebleConjuntoRepository.save(inmuebleConjunto);
    }

    @Override
    public Object postUnidadDeVivinenda(unidadDeVivienda unidadDeVivienda) {
        unidadDeVivienda.setId(Math.toIntExact(unidadDeViviendaRepository.count()+1));
        return unidadDeViviendaRepository.save(unidadDeVivienda);
    }

    @Override
    public Object postUnidadDeViviendaUsuario(unidadDeViviendaUsuario unidadDeViviendaUsuario) {
        unidadDeViviendaUsuario.setId(Math.toIntExact(unidadDeViviendaUsuarioRepository.count())+1);
        return unidadDeViviendaUsuarioRepository.save(unidadDeViviendaUsuario);
    }

    @Override
    public Object postUsuario(usuario usuario) {
        usuario.setId(Math.toIntExact(usuarioRepository.count())+1);
        return usuarioRepository.save(usuario);
    }

    @Override
    public Object putUnidadDeVivinenda(unidadDeVivienda unidadDeVivienda) {
        unidadDeVivienda unidadDeViviendaDB = unidadDeViviendaRepository.getById(unidadDeVivienda.getId());
        unidadDeViviendaDB.setCostoAdministracion(unidadDeVivienda.getCostoAdministracion());
        return unidadDeViviendaRepository.save(unidadDeViviendaDB);
    }

    @Override
    public Object putzonaComunConjunto(zonaComunConjunto zonaComunConjunto) {
        zonaComunConjunto zonaComunConjuntoDB = zonaComunConjuntoRepository.getById(zonaComunConjunto.getId());
        zonaComunConjuntoDB.setCostoAlquiler(zonaComunConjunto.getCostoAlquiler());
        zonaComunConjuntoDB.setTiempoAlquilerCobro(zonaComunConjunto.getTiempoAlquilerCobro());
        zonaComunConjuntoDB.setDisponible(zonaComunConjunto.getDisponible());
        return zonaComunConjuntoRepository.save(zonaComunConjuntoDB);
    }

    @Override
    public Object putUnidadDeViviendaUsuario(unidadDeViviendaUsuario unidadDeViviendaUsuario) {
        unidadDeViviendaUsuario unidadDeViviendaUsuarioDB = unidadDeViviendaUsuarioRepository.getById(unidadDeViviendaUsuario.getId());
        unidadDeViviendaUsuarioDB.setDisponible(unidadDeViviendaUsuario.getDisponible());
        unidadDeViviendaUsuarioDB.setTipoHabitante(unidadDeViviendaUsuario.getTipoHabitante());
        return unidadDeViviendaUsuarioRepository.save(unidadDeViviendaUsuarioDB);
    }

    @Override
    public Object putUsuarioPropio(usuario usuario) {
        usuario usuario1=usuarioRepository.getById(usuario.getId());
        usuario1.setPassword(usuario.getPassword());
        return usuarioRepository.save(usuario1);
    }

}
