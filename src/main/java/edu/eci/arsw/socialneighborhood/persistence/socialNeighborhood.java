package edu.eci.arsw.socialneighborhood.persistence;

import edu.eci.arsw.socialneighborhood.model.*;

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
}
