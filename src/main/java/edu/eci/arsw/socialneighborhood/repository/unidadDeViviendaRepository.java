package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.unidadDeVivienda;
import edu.eci.arsw.socialneighborhood.model.unidadDeViviendaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface unidadDeViviendaRepository extends JpaRepository<unidadDeVivienda,Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM unidaddevivienda WHERE id = :id ")
    unidadDeVivienda findByIDUnidadDeViviendaUsuario(@Param("id") int id);
}
