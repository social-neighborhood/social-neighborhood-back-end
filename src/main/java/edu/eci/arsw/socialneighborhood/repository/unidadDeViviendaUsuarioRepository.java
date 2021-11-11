package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.conjuntoUsuario;
import edu.eci.arsw.socialneighborhood.model.unidadDeViviendaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface unidadDeViviendaUsuarioRepository extends JpaRepository<unidadDeViviendaUsuario,Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM unidaddeviviendausuario WHERE idconjuntousuario = :id ")
    List<unidadDeViviendaUsuario> findByIdConjuntoUsuario(@Param("id") int id);
}
