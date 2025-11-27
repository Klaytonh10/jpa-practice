package com.pluralsight;

import jakarta.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {

        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();

        Person person = new Person();
        person.setFirstName("Klayton");
        person.setLastName("Huneycutt");

        em.persist(person);

        em.getTransaction().commit();
        em.close();
    }
}