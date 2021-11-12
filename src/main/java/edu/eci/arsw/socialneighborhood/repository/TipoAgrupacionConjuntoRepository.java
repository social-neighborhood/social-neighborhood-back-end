package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.ConjuntoUsuario;
import edu.eci.arsw.socialneighborhood.model.TipoAgrupacionConjunto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoAgrupacionConjuntoRepository extends JpaRepository<TipoAgrupacionConjunto,Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM tipoagrupacionconjunto WHERE idconjunto = :idconjunto")
    List<TipoAgrupacionConjunto> findTipoAgrupacionConjuntoByIdConjunto(@Param("idconjunto") int idconjunto);
}
