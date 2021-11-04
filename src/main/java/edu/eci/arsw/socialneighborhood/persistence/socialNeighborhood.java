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

    List<usuario> getConjuntoUsuario();

    List<agrupacion> getAgrupacion();

    Object userByEmail(String email);

    List<unidadDeVivienda> getUnidadDeVivinendaByEmail(String email);

    conjunto getConjuntoById(int id);

    usuario getUsuarioById(int id);

    conjuntoUsuario getConjuntoUsuarioByConjuntoUsuario(int idconjunto, int idusuario);

    unidadDeVivienda getUnidadDeViviendaByID(int id);

    unidadDeViviendaUsuario getUnidadDeVivendaUsuarioByID(int idUnidadDeVivienda, int idConjuntoUsuario);

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

    List<unidadDeVivienda> getUnidadesDeViviendaByIdConjunto(int idconjunto);

    List<agrupacion> getAgrupacionByIdConjunto(int idconjunto);

    List<tipoInmuebleConjunto> getTipoInmuebleConjuntoByIdConjunto(int idconjunto);

    List<tipoAgrupacionConjunto> getTipoAgrupacionConjuntoByIdConjunto(int idconjunto);

    Object postTipoAgrupacion(tipoAgrupacionConjunto agrupacionConjunto);

    Object postTipoInmueble(tipoInmuebleConjunto inmuebleConjunto);

    Object postUnidadDeVivinenda(unidadDeVivienda unidadDeVivienda);

    Object postConjuntoUsuario(conjuntoUsuario conjuntoUsuario);

    Object postzonaComunConjunto(zonaComunConjunto zonaComunConjunto);

    Object postAgrupacion(agrupacion agrupacion);

    Object postUnidadDeViviendaUsuario(unidadDeViviendaUsuario unidadDeViviendaUsuario);

    Object postUsuario(usuario usuario);

    Object putUnidadDeViviendaUsuario(unidadDeViviendaUsuario unidadDeViviendaUsuario);

    Object putUsuarioPropio(usuario usuario);

    Object putzonaComunConjunto(zonaComunConjunto zonaComunConjunto);

    Object putUnidadDeVivinenda(unidadDeVivienda unidadDeVivienda);

    conjuntoAdministrador getConjuntosByEmaill(String email);

    List<conjunto> getConjuntos();

    List<alquiler> getAlquileres();

    tipoAgrupacionConjunto getTipoAgrupacionConjuntoById(int id);

    tipoInmuebleConjunto getTipoInmuebleConjuntoById(int id);

    tipoAgrupacion getTipoAgrupacionById(int id);

    tipoInmueble getTipoInmuebleById(int id);
}
