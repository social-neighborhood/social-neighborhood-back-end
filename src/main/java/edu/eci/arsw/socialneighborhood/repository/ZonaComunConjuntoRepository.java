package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.ZonaComunConjunto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZonaComunConjuntoRepository extends JpaRepository<ZonaComunConjunto,Integer> {
}
