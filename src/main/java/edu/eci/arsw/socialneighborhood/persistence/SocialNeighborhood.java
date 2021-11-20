package edu.eci.arsw.socialneighborhood.persistence;

import edu.eci.arsw.socialneighborhood.model.*;
import org.json.JSONArray;
import java.text.ParseException;
import java.util.List;

public interface SocialNeighborhood {
    List<TipoAgrupacion> getTipoAgrupacion();

    List<TipoInmueble> getTipoInmueble();

    List<TipoAgrupacionConjunto> getTipoAgrupacionPropia();

    List<TipoInmuebleConjunto> getTipoInmueblesPropia();

    List<UnidadDeVivienda> getUnidadDeVivinenda();

    List<Usuario> getConjuntoUsuario();

    List<Agrupacion> getAgrupacion();

    Object userByEmail(String email);

    JSONArray getUnidadDeVivinendaByEmail(String email);

    Conjunto getConjuntoById(int id);

    Usuario getUsuarioById(int id);

    ConjuntoUsuario getConjuntoUsuarioByConjuntoUsuario(int idconjunto, int idusuario);

    UnidadDeVivienda getUnidadDeViviendaByID(int id);

    UnidadDeViviendaUsuario getUnidadDeVivendaUsuarioByID(int idUnidadDeVivienda, int idConjuntoUsuario);

    Agrupacion getAgrupacionByID(int idAgrupacion);

    TipoAgrupacion getTipoAgrupacionByID(int idTipoAgrupacion);

    TipoInmueble getTipoinmuebleByID(int idTipoInmueble);

    TipoAgrupacionConjunto getTipoAgrupacionConjuntoByID(int idTipoAgrupacionConjunto);

    TipoInmuebleConjunto getTipoInmuebleConjuntoByID(int idTipoInmuebleConjunto);

    List<ZonaComunConjunto> getZonasComunesConjuntoByIdConjunto(int idconjunto);

    List<ZonaComun> getZonasComunesByZonasComunesConjunto(List<ZonaComunConjunto> zonasComunesConjunto);

    ConjuntoAdministrador getCojuntoAdministradorByID(int idConjuntoAdministrador);

    List<ZonaComun> getZonasComunes();

    List<ConjuntoUsuario> getConjuntoUsuarioByIDConjunto(int idconjunto);

    List<Usuario> getUsuariosByConjuntoUsuarios(List<ConjuntoUsuario> ConjuntoUsuarios);

    List<UnidadDeViviendaUsuario> getUnidadesDeViviendaUsuariosByConjuntoUsuarios(List<ConjuntoUsuario> ConjuntoUsuarios);

    List<UnidadDeVivienda> getUnidadesDeViviendaByIdConjunto(int idconjunto);

    List<Agrupacion> getAgrupacionByIdConjunto(int idconjunto);

    List<TipoInmuebleConjunto> getTipoInmuebleConjuntoByIdConjunto(int idconjunto);

    List<TipoAgrupacionConjunto> getTipoAgrupacionConjuntoByIdConjunto(int idconjunto);

    Object postTipoAgrupacion(TipoAgrupacionConjunto agrupacionConjunto);

    Object postTipoInmueble(TipoInmuebleConjunto inmuebleConjunto);

    Object postUnidadDeVivinenda(UnidadDeVivienda unidadDeVivienda);

    Object postConjuntoUsuario(ConjuntoUsuario conjuntoUsuario);

    Object postzonaComunConjunto(ZonaComunConjunto zonaComunConjunto);

    Object postAgrupacion(Agrupacion agrupacion);

    Object postUnidadDeViviendaUsuario(UnidadDeViviendaUsuario unidadDeViviendaUsuario);

    Object postUsuario(Usuario usuario);

    Object putUnidadDeViviendaUsuario(UnidadDeViviendaUsuario unidadDeViviendaUsuario);

    Object putUsuarioPropio(Usuario usuario);

    Object putzonaComunConjunto(ZonaComunConjunto zonaComunConjunto);

    Object putUnidadDeVivinenda(UnidadDeVivienda unidadDeVivienda);

    ConjuntoAdministrador getConjuntosByEmaill(String email);

    List<Conjunto> getConjuntos();

    List<Alquiler> getAlquileres(List<ZonaComunConjunto> zonascomunes);

    TipoAgrupacionConjunto getTipoAgrupacionConjuntoById(int id);

    TipoInmuebleConjunto getTipoInmuebleConjuntoById(int id);

    TipoAgrupacion getTipoAgrupacionById(int id);

    TipoInmueble getTipoInmuebleById(int id);

    JSONArray getHorasInicioAlquiler(long fechai, long fechaf, long fecham, String fechainicio, int idZonaComun) throws ParseException;

    JSONArray getHorasFinAlquiler(long fechai, String fechainicio, String horainicio, int idZonaComun) throws ParseException;

    Object postAlquiler(long inicio, long fin, int idzonacomun, Integer id);

    List<Alquiler> getAlquileresCliente(int idunidaddeviviendausuario);

    Object putAlquiler(int id);

    Object postPostAdmin(Posts posts);

    Object postPostClient(Posts posts);

    List<Posts> getPostDeAdmin(int idconjunto);

    List<Posts> getPostDeClient(int idconjunto);


    Object registrarUsuario(ConjuntoUsuario conjuntoUsuario);
}
