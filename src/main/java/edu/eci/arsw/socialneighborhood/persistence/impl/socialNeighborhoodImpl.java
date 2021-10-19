package edu.eci.arsw.socialneighborhood.persistence.impl;

import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.persistence.socialNeighborhood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import edu.eci.arsw.socialneighborhood.repository.*;

import java.util.Date;
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
    public Object putTipoAgrupacion(tipoAgrupacionConjunto agrupacionConjunto) {
        tipoAgrupacionConjuntoRepository.deleteById(agrupacionConjunto.getId());
        return postTipoAgrupacion(agrupacionConjunto);
    }

    @Override
    public Object putTipoInmueble(tipoInmuebleConjunto inmuebleConjunto) {
        return null;
    }

    @Override
    public Object postTipoAgrupacion(tipoAgrupacionConjunto agrupacionConjunto) {
        return tipoAgrupacionConjuntoRepository.save(agrupacionConjunto);
    }

    @Override
    public Object postTipoInmueble(tipoInmuebleConjunto inmuebleConjunto) {
        return null;
    }

    @Override
    public Object putUnidadDeVivinenda(unidadDeVivienda unidadDeVivienda) {
        return null;
    }

    @Override
    public Object postUnidadDeVivinenda(unidadDeVivienda unidadDeVivienda) {
        return null;
    }

    @Override
    public List<usuario> getUsuario() {
        return null;
    }

    @Override
    public Object putUsuario(usuario usuario) {
        usuarioRepository.deleteById(usuario.getId());
        return postUsuario(usuario);
    }

    @Override
    public Object postUsuario(usuario usuario) {

        return usuarioRepository.save(usuario);
    }

    @Override
    public Object putzonaComunConjunto(zonaComunConjunto zonaComunConjunto) {
        return null;
    }

    @Override
    public Object postzonaComunConjunto(zonaComunConjunto zonaComunConjunto) {
        return null;
    }

    @Override
    public List<agrupacion> getAgrupacion() {
        return null;
    }

    @Override
    public Object putAgrupacion(agrupacion agrupacion) {
        return null;
    }

    @Override
    public Object postAgrupacion(agrupacion agrupacion) {
        return null;
    }

    @Override
    public Object putUnidadDeViviendaUsuario(unidadDeViviendaUsuario unidadDeViviendaUsuario) {
        return null;
    }

    @Override
    public Object postUnidadDeViviendaUsuario(unidadDeViviendaUsuario unidadDeViviendaUsuario) {
        return null;
    }
}
