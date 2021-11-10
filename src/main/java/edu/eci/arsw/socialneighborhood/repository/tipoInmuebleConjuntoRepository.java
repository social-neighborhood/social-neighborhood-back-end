package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.tipoInmuebleConjunto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tipoInmuebleConjuntoRepository extends JpaRepository<tipoInmuebleConjunto,Integer> {
    //findByIdConjunto
    //@Query("SELECT usr FROM User usr  WHERE usr.configurable = TRUE "
    //        + "AND (" +
     //       "lower(usr.name) like lower(:filterText) OR lower(usr.userType.classType.displayName) like lower(:filterText) OR lower(usr.userType.model) like lower(:filterText)"
     //       +      ")"
     //       + "")
   // public List<tipoInmuebleConjunto> findByFilterText(@Param("filterText") String filterText, Sort sort);
}
