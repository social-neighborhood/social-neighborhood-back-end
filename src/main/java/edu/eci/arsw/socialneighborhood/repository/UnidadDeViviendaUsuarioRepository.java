package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.UnidadDeViviendaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnidadDeViviendaUsuarioRepository extends JpaRepository<UnidadDeViviendaUsuario,Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM unidaddeviviendausuario WHERE idconjuntousuario = :id ")
    List<UnidadDeViviendaUsuario> findByIdConjuntoUsuario(@Param("id") int id);
}
