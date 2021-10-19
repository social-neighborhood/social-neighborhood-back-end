package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.unidadDeViviendaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface unidadDeViviendaUsuarioRepository extends JpaRepository<unidadDeViviendaUsuario,Integer> {
}
