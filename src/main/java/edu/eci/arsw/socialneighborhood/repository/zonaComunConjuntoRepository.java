package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.zonaComunConjunto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface zonaComunConjuntoRepository extends JpaRepository<zonaComunConjunto,Integer> {
}
