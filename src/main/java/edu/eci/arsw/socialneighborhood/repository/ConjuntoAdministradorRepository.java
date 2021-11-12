package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.ConjuntoAdministrador;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ConjuntoAdministradorRepository extends JpaRepository<ConjuntoAdministrador,Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM conjuntoadministrador  WHERE idusuarioadministrador = :idAdmin ")
    public ConjuntoAdministrador findByIdAdmin(@Param("idAdmin") int idAdmin);
}
