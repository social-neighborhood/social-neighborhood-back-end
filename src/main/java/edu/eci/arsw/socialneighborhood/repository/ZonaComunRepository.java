package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.ZonaComun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZonaComunRepository extends JpaRepository<ZonaComun,Integer> {
}
