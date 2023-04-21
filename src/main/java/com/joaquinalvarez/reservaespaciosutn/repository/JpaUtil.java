package com.joaquinalvarez.reservaespaciosutn.respository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class JpaUtil {

    //Este atributo se va a instanciar una sola vez, luego no podra ser modificado
    private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();


    private static EntityManagerFactory buildEntityManagerFactory(){
        return Persistence.createEntityManagerFactory("JPA_PU"); //mismo nombre que pusimos en el persistence.xml
    }

    //Se va a crear una instancia de EntityManager para cada request
    @Bean
    public static EntityManager getEntityManager(){
        return entityManagerFactory.createEntityManager();
    }
}
