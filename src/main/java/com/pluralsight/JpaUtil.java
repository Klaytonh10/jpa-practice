package com.pluralsight;

import jakarta.persistence.*;

public class JpaUtil {

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("my-pu");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
