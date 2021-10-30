package edu.eci.arsw.socialneighborhood.persistence;

import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.persistence.impl.socialNeighborhoodImpl;

import java.util.List;

public interface socialNeighborhood {
    List<tipoAgrupacion> getTipoAgrupacion();

    List<tipoInmueble> getTipoInmueble();

    List<tipoAgrupacionConjunto> getTipoAgrupacionPropia();

    List<tipoInmuebleConjunto> getTipoInmueblesPropia();

    List<unidadDeVivienda> getUnidadDeVivinenda();

    Object postTipoAgrupacion(tipoAgrupacionConjunto agrupacionConjunto);

    Object postTipoInmueble(tipoInmuebleConjunto inmuebleConjunto);

    Object putUnidadDeVivinenda(unidadDeVivienda unidadDeVivienda);

    Object postUnidadDeVivinenda(unidadDeVivienda unidadDeVivienda);

    List<usuario> getConjuntoUsuario();

    Object postConjuntoUsuario(conjuntoUsuario conjuntoUsuario);

    Object putzonaComunConjunto(zonaComunConjunto zonaComunConjunto);

    Object postzonaComunConjunto(zonaComunConjunto zonaComunConjunto);

    List<agrupacion> getAgrupacion();

    Object postAgrupacion(agrupacion agrupacion);

    Object putUnidadDeViviendaUsuario(unidadDeViviendaUsuario unidadDeViviendaUsuario);

    Object postUnidadDeViviendaUsuario(unidadDeViviendaUsuario unidadDeViviendaUsuario);

    Object postUsuario(usuario usuario);

    Object userByEmail(String email);

    List<unidadDeVivienda> getUnidadDeVivinendaByEmail(String email);

    conjunto getConjuntoById(int id);

    usuario getUsuarioById(int id);

    conjuntoUsuario getConjuntoUsuarioByID(int id);

    unidadDeVivienda getUnidadDeViviendaByID(int id);

    unidadDeViviendaUsuario getUnidadDeVivendaUsuarioByID(int id);

    agrupacion getAgrupacionByID(int idAgrupacion);

    tipoAgrupacion getTipoAgrupacionByID(int idTipoAgrupacion);

    tipoInmueble getTipoinmuebleByID(int idTipoInmueble);

    tipoAgrupacionConjunto getTipoAgrupacionConjuntoByID(int idTipoAgrupacionConjunto);

    tipoInmuebleConjunto getTipoInmuebleConjuntoByID(int idTipoInmuebleConjunto);

    List<zonaComunConjunto> getZonasComunesConjuntoByIdConjunto(int idconjunto);

    List<zonaComun> getZonasComunesByZonasComunesConjunto(List<zonaComunConjunto> zonasComunesConjunto);

    conjuntoAdministrador getCojuntoAdministradorByID(int idConjuntoAdministrador);

    List<zonaComun> getZonasComunes();

    List<conjuntoUsuario> getConjuntoUsuarioByIDConjunto(int idconjunto);

    List<usuario> getUsuariosByConjuntoUsuarios(List<conjuntoUsuario> conjuntoUsuarios);

    List<unidadDeViviendaUsuario> getUnidadesDeViviendaUsuariosByConjuntoUsuarios(List<conjuntoUsuario> conjuntoUsuarios);

    List<unidadDeVivienda> getUnidadesDeViviendaByUnidadesDeViviendaUsuario(List<unidadDeViviendaUsuario> unidadesDeViviendaUsuarios);

    List<agrupacion> getAgrupacionByUnidadDeVivienda(List<unidadDeVivienda> unidadesDeVivienda);

    List<tipoInmuebleConjunto> getTipoInmuebleConjuntoByIdConjunto(int idconjunto);

    List<tipoAgrupacionConjunto> getTipoAgrupacionConjuntoByIdConjunto(int idconjunto);
}
