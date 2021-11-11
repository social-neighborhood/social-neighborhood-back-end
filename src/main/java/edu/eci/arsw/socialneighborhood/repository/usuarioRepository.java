package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.tipoInmuebleConjunto;
import edu.eci.arsw.socialneighborhood.model.usuario;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface usuarioRepository extends JpaRepository<usuario,Integer> {

    @Query(nativeQuery = true, value = "SELECT u.id FROM usuario u WHERE email = :email ")
    public usuario findByEmail(@Param("email") String email);

}
