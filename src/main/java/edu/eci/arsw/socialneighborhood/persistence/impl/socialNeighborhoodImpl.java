package edu.eci.arsw.socialneighborhood.persistence.impl;

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
        return tipoAgrupacionConjuntoRepository.save(agrupacionConjunto);
    }

    @Override
    public Object postTipoInmueble(tipoInmuebleConjunto inmuebleConjunto) {
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
        return unidadDeViviendaRepository.save(unidadDeVivienda);
    }

    @Override
    public List<usuario> getConjuntoUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public Object postConjuntoUsuario(conjuntoUsuario conjuntoUsuario) {
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
        return zonaComunConjuntoRepository.save(zonaComunConjunto);
    }

    @Override
    public List<agrupacion> getAgrupacion() {
        return agrupacionRepository.findAll();
    }

    @Override
    public Object postAgrupacion(agrupacion agrupacion) {
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
        return unidadDeViviendaUsuarioRepository.save(unidadDeViviendaUsuario);
    }

    @Override
    public Object postUsuario(usuario usuario) {
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
        //List<usuario> usuarios = usuarioRepository.fin;
        List<conjuntoUsuario> conjuntoUsuarios;
        List<unidadDeVivienda> unidadDeViviendas;
        List<unidadDeVivienda> unidadDeViviendaList = unidadDeViviendaRepository.findAll();
        //for (unidadDeVivienda unidadDeVivienda: unidadDeViviendaList){
        //    if (unidadDeVivienda.get){

       //     }
       // }
        return null;
    }
}
