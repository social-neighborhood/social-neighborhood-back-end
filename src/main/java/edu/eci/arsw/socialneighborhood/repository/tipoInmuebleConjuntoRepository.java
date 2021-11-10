package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.tipoInmuebleConjunto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tipoInmuebleConjuntoRepository extends JpaRepository<tipoInmuebleConjunto,Integer> {
    findByIdConjunto
}
