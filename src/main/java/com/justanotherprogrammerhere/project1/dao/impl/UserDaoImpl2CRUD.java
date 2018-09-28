package com.justanotherprogrammerhere.project1.dao.impl;

import com.justanotherprogrammerhere.project1.dao.UserDao;
import com.justanotherprogrammerhere.project1.dao.crud_repo.UserDetailsRepository;
import com.justanotherprogrammerhere.project1.model.UserDetails;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl2CRUD implements UserDao {

    public UserDetailsRepository getUserRepo() {
        return userRepo;
    }

    @Autowired
    private UserDetailsRepository userRepo;

    public List<UserDetails> getUserDetails() {
        System.out.print("DATA IS -----> " + userRepo.findAll());
        return userRepo.findAll();

    }


}
