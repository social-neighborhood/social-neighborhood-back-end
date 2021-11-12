package edu.eci.arsw;

import org.postgresql.util.PSQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan(basePackages = {"edu.eci.arsw.socialneighborhood"})
public class SocialNeighborhoodApp {
    public static void main(String[] args)  throws PSQLException {
        try {
            SpringApplication.run(SocialNeighborhoodApp.class, args);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}