package edu.eci.arsw;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import org.postgresql.util.PSQLException;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.SQLException;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan(basePackages = {"edu.eci.arsw.socialneighborhood"})
public class socialNeighborhoodApp {
    public static void main(String[] args)  throws PSQLException {
        try {
            SpringApplication.run(socialNeighborhoodApp.class, args);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}