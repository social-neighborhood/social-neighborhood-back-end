package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.tipoAgrupacionConjunto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tipoAgrupacionConjuntoRepository extends JpaRepository<tipoAgrupacionConjunto,Integer> {
}
