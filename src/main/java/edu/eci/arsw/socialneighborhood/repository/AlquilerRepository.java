package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.Alquiler;
import edu.eci.arsw.socialneighborhood.model.ConjuntoAdministrador;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface AlquilerRepository extends JpaRepository<Alquiler,Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM alquiler WHERE iniciodealquiler >= :fechai and iniciodealquiler < :fechaf and idzonacomun = :idZonaComun ORDER BY iniciodealquiler")
    public List<Alquiler> findAlquileresByFecha(@Param("fechai") long fechai, @Param("fechaf") long fechaf,  @Param("idZonaComun") int idZonaComun );

    @Query(nativeQuery = true, value = "SELECT * FROM alquiler a WHERE a.iniciodealquiler = (SELECT MIN(b.iniciodealquiler) FROM alquiler b WHERE b.iniciodealquiler >= :fechaf and b.iniciodealquiler < :fecham and idzonacomun = :idZonaComun)")
    public Alquiler findAlquilereMenorDiaSiguiente(@Param("fechaf") long fechaf, @Param("fecham") long fecham,  @Param("idZonaComun") int idZonaComun);

}
