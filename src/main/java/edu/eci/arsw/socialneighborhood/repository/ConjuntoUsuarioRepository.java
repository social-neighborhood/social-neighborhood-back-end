package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.ConjuntoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConjuntoUsuarioRepository extends JpaRepository<ConjuntoUsuario,Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM conjuntousuario WHERE idusuario = :id ")
    List<ConjuntoUsuario> findByIdUsuario(@Param("id") int id);
}