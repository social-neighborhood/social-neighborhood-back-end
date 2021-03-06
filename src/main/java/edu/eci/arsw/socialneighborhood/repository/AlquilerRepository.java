package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.Alquiler;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AlquilerRepository extends JpaRepository<Alquiler,Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM alquiler WHERE iniciodealquiler >= :fechai and iniciodealquiler < :fechaf and idzonacomun = :idZonaComun and cancelado = false ORDER BY iniciodealquiler")
    List<Alquiler> findAlquileresByFecha(@Param("fechai") long fechai, @Param("fechaf") long fechaf,  @Param("idZonaComun") int idZonaComun );

    @Query(nativeQuery = true, value = "SELECT * FROM alquiler a WHERE a.iniciodealquiler = (SELECT MIN(b.iniciodealquiler) FROM alquiler b WHERE b.iniciodealquiler >= :fechaf and b.iniciodealquiler < :fecham and idzonacomun = :idZonaComun and cancelado = false)")
    Alquiler findAlquilereMenorDiaSiguiente(@Param("fechaf") long fechaf, @Param("fecham") long fecham,  @Param("idZonaComun") int idZonaComun);

    @Query(nativeQuery = true, value = "SELECT * FROM alquiler WHERE iniciodealquiler >= :fechai and iniciodealquiler - :espera <= :fechaf and idzonacomun = :idZonaComun and cancelado = false ORDER BY iniciodealquiler limit 1")
    Alquiler findInMiddle(@Param("fechai") long fechai,@Param("fechai") long fechaf,  @Param("idZonaComun") int idZonaComun, @Param("espera") long espera);

    @Query(nativeQuery = true, value = "SELECT * FROM alquiler WHERE idunidaddeviviendausuario = :idunidaddeviviendausuario ")
    List<Alquiler> getAlquilerCliente(@Param("idunidaddeviviendausuario") int idunidaddeviviendausuario);

    @Query(nativeQuery = true, value = "SELECT * FROM  alquiler  WHERE ( (:idZonaComun = idzonacomun) and ((:fechai BETWEEN iniciodealquiler AND findealquiler) or (:fechaf BETWEEN iniciodealquiler AND findealquiler)))")
    List<Alquiler> Comprobate( @Param("fechai") long fechai, @Param("fechaf") long fechaf, @Param("idZonaComun") int idZonaComun);

}
