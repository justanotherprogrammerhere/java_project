package com.justanotherprogrammerhere.project1.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.springframework.stereotype.Repository;

import com.justanotherprogrammerhere.project1.dao.UserDao;
import com.justanotherprogrammerhere.project1.model.UserDetails;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Repository
//public class UserDaoImpl implements UserDao {
public class UserDaoImpl {

    @PersistenceContext
    private EntityManager entityManager;

    public List<UserDetails> getUserDetails() {
        Criteria criteria = entityManager.unwrap(Session.class).createCriteria(UserDetails.class);
        return criteria.list();


    }

}
