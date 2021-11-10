package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.tipoInmuebleConjunto;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public interface tipoInmuebleConjuntoRepository extends JpaRepository<tipoInmuebleConjunto,Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM tipoinmuebleconjunto  WHERE idconjunto = :idconjunto ")
    public List<tipoInmuebleConjunto> findByIdConjunto(@Param("idconjunto") int idconjunto);
}
