package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.TipoInmuebleConjunto;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoInmuebleConjuntoRepository extends JpaRepository<TipoInmuebleConjunto,Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM tipoinmuebleconjunto  WHERE idconjunto = :idconjunto ")
    List<TipoInmuebleConjunto> findByIdConjunto(@Param("idconjunto") int idconjunto);
}
