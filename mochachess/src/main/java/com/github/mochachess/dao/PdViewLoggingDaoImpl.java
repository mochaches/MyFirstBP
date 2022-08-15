package com.github.mochachess.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PdViewLoggingDaoImpl {

    @PersistenceContext
    private EntityManager entityManager;
}
