package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.UnidadDeVivienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadDeViviendaRepository extends JpaRepository<UnidadDeVivienda,Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM unidaddevivienda WHERE id = :id ")
    UnidadDeVivienda findByIDUnidadDeViviendaUsuario(@Param("id") int id);
}
