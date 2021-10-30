package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.conjuntoAdministrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface conjuntoAdministradorRepository extends JpaRepository<conjuntoAdministrador,Integer> {
}
