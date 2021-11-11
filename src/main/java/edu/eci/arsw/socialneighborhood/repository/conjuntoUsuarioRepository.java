package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.conjuntoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface conjuntoUsuarioRepository extends JpaRepository<conjuntoUsuario,Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM conjuntousuario WHERE idusuario = :id ")
    List<conjuntoUsuario> findByIdUsuario(@Param("id") int id);
}