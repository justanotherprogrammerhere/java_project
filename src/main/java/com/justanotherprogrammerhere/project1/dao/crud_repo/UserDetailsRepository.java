package com.justanotherprogrammerhere.project1.dao.crud_repo;

import com.justanotherprogrammerhere.project1.model.UserDetails;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDetailsRepository extends CrudRepository<UserDetails, Long> {

    List<UserDetails> findAll();

}


