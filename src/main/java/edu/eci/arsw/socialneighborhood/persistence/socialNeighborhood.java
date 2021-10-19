package edu.eci.arsw.socialneighborhood.persistence;

import edu.eci.arsw.socialneighborhood.model.*;

import java.util.List;
import java.sql.SQLException;

public interface socialNeighborhood {
    List<tipoAgrupacion> getTipoAgrupacion() throws SQLException;

    List<tipoInmueble> getTipoInmueble();

    List<tipoAgrupacionConjunto> getTipoAgrupacionPropia();

    List<tipoInmuebleConjunto> getTipoInmueblesPropia();

    List<unidadDeVivienda> getUnidadDeVivinenda();

    Object putTipoAgrupacion(tipoAgrupacionConjunto agrupacionConjunto);

    Object putTipoInmueble(tipoInmuebleConjunto inmuebleConjunto);

    Object postTipoAgrupacion(tipoAgrupacionConjunto agrupacionConjunto);

    Object postTipoInmueble(tipoInmuebleConjunto inmuebleConjunto);

    Object putUnidadDeVivinenda(unidadDeVivienda unidadDeVivienda);

    Object postUnidadDeVivinenda(unidadDeVivienda unidadDeVivienda);

    List<usuario> getUsuario();

    Object putUsuario(usuario usuario);

    Object postUsuario(usuario usuario);

    Object putzonaComunConjunto(zonaComunConjunto zonaComunConjunto);

    Object postzonaComunConjunto(zonaComunConjunto zonaComunConjunto);

    List<agrupacion> getAgrupacion();

    Object putAgrupacion(agrupacion agrupacion);

    Object postAgrupacion(agrupacion agrupacion);

    Object putUnidadDeViviendaUsuario(unidadDeViviendaUsuario unidadDeViviendaUsuario);

    Object postUnidadDeViviendaUsuario(unidadDeViviendaUsuario unidadDeViviendaUsuario);
}
