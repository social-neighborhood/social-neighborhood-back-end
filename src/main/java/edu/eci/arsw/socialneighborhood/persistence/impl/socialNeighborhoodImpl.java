package edu.eci.arsw.socialneighborhood.persistence.impl;

import edu.eci.arsw.socialneighborhood.cache;
import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.persistence.socialNeighborhood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import edu.eci.arsw.socialneighborhood.repository.*;

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

    cache cache;

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
    public Object postTipoAgrupacion(tipoAgrupacionConjunto agrupacionConjunto) {
        agrupacionConjunto.setIdConjunto(cache.getConjunto());
        agrupacionConjunto.setId(Math.toIntExact(tipoAgrupacionConjuntoRepository.count()+1));
        return tipoAgrupacionConjuntoRepository.save(agrupacionConjunto);
    }

    @Override
    public Object postTipoInmueble(tipoInmuebleConjunto inmuebleConjunto) {
        inmuebleConjunto.setIdConjunto(cache.getConjunto());
        inmuebleConjunto.setId(Math.toIntExact(tipoInmuebleConjuntoRepository.count()+1));
        return tipoInmuebleConjuntoRepository.save(inmuebleConjunto);
    }

    @Override
    public Object putUnidadDeVivinenda(unidadDeVivienda unidadDeVivienda) {
        unidadDeVivienda unidadDeViviendaDB = unidadDeViviendaRepository.getById(unidadDeVivienda.getId());
        unidadDeViviendaDB.setCostoAdministracion(unidadDeVivienda.getCostoAdministracion());
        return unidadDeViviendaRepository.save(unidadDeViviendaDB);
    }

    @Override
    public Object postUnidadDeVivinenda(unidadDeVivienda unidadDeVivienda) {
        unidadDeVivienda.setId(Math.toIntExact(unidadDeViviendaRepository.count()+1));
        return unidadDeViviendaRepository.save(unidadDeVivienda);
    }

    @Override
    public List<usuario> getConjuntoUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public Object postConjuntoUsuario(conjuntoUsuario conjuntoUsuario) {
        conjuntoUsuario.setIdConjunto(cache.getConjunto());
        conjuntoUsuario.setId(Math.toIntExact(conjuntoUsuarioRepository.count()+1));
        return conjuntoUsuarioRepository.save(conjuntoUsuario);
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
    public Object postzonaComunConjunto(zonaComunConjunto zonaComunConjunto) {
        zonaComunConjunto.setIdConjunto(cache.getConjunto());
        zonaComunConjunto.setId(Math.toIntExact(zonaComunConjuntoRepository.count()+1));
        return zonaComunConjuntoRepository.save(zonaComunConjunto);
    }

    @Override
    public List<agrupacion> getAgrupacion() {
        System.out.println(Math.toIntExact(usuarioRepository.count()));
        return agrupacionRepository.findAll();
    }

    @Override
    public Object postAgrupacion(agrupacion agrupacion) {
        agrupacion.setId(Math.toIntExact(agrupacionRepository.count())+1);
        return agrupacionRepository.save(agrupacion);
    }

    @Override
    public Object putUnidadDeViviendaUsuario(unidadDeViviendaUsuario unidadDeViviendaUsuario) {
        unidadDeViviendaUsuario unidadDeViviendaUsuarioDB = unidadDeViviendaUsuarioRepository.getById(unidadDeViviendaUsuario.getId());
        unidadDeViviendaUsuarioDB.setDisponible(unidadDeViviendaUsuario.getDisponible());
        unidadDeViviendaUsuarioDB.setTipoHabitante(unidadDeViviendaUsuario.getTipoHabitante());
        return unidadDeViviendaUsuarioRepository.save(unidadDeViviendaUsuarioDB);
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
    public List<unidadDeVivienda> getUnidadDeVivinendaByEmail(String email) {
        List<usuario> usuarios = usuarioRepository.findAll();
        List<conjuntoUsuario> conjuntoUsuarios = conjuntoUsuarioRepository.findAll();
        List<unidadDeVivienda> unidadDeViviendas = null;
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


}
