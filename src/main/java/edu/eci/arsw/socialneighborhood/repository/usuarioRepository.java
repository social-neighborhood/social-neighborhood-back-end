package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface usuarioRepository extends JpaRepository<usuario,Integer> {
}
