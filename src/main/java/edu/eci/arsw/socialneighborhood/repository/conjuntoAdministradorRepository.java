package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.conjuntoAdministrador;
import edu.eci.arsw.socialneighborhood.model.usuario;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface conjuntoAdministradorRepository extends JpaRepository<conjuntoAdministrador,Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM conjuntoadministrador  WHERE idusuarioadministrador = :idAdmin ")
    public conjuntoAdministrador findByIdAdmin(@Param("idAdmin") int idAdmin);
}
