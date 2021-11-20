package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.ZonaComunConjunto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZonaComunConjuntoRepository extends JpaRepository<ZonaComunConjunto,Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM zonacomunconjunto WHERE idconjunto = :idconjunto")
    List<ZonaComunConjunto> findZonasComunesConjuntoByIdConjunto(@Param("idconjunto") int idconjunto);

    @Query(nativeQuery = true, value = "SELECT * FROM zonacomunconjunto WHERE id = :idZonaComun")
    ZonaComunConjunto findZonsComunById(@Param("idZonaComun") int idZonaComun);

}
