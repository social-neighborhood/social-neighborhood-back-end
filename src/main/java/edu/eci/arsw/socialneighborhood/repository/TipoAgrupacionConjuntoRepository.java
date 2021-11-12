package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.TipoAgrupacionConjunto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoAgrupacionConjuntoRepository extends JpaRepository<TipoAgrupacionConjunto,Integer> {
}
