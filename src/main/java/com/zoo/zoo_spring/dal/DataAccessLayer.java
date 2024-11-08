package com.zoo.zoo_spring.dal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;

import org.hibernate.SessionFactory;
import org.hibernate.Session;

public class DataAccessLayer {

    private final SessionFactory sessionFactory;

    public DataAccessLayer(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;

    }

    Session session = null;

}
