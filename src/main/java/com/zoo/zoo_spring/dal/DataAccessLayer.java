package com.zoo.zoo_spring.dal;

import javax.crypto.NullCipher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.hibernate.*;

@Component
public class DataAccessLayer {

    private final SessionFactory sessionFactory;

    @Autowired
    public DataAccessLayer(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;

    }

    Session session = null;
}
