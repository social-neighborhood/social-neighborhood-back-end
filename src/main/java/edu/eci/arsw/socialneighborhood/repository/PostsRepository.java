package edu.eci.arsw.socialneighborhood.repository;

import edu.eci.arsw.socialneighborhood.model.Posts;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostsRepository extends JpaRepository<Posts,String> {

    @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM posts WHERE (id LIKE 'PA%') and iduserconjunto = :iduserconjunto ")
    int getNumPostsAdmin(@Param("iduserconjunto") int iduserconjunto);

    @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM posts WHERE (id LIKE 'PC%') and iduserconjunto = :iduserconjunto ")
    int getNumPostsClient(@Param("iduserconjunto") int iduserconjunto);

    @Query(nativeQuery = true, value = "SELECT * FROM posts WHERE (id LIKE 'PA%') and idconjunto = :idconjunto ORDER BY fechaactualizacion")
    List<Posts> getPostsAdmin(int idconjunto);

    @Query(nativeQuery = true, value = "SELECT * FROM posts WHERE (id LIKE 'PC%') and idconjunto = :idconjunto ORDER BY fechaactualizacion")
    List<Posts> getPostsClient(int idconjunto);
}
