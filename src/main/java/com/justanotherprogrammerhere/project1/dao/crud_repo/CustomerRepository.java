package com.justanotherprogrammerhere.project1.dao.crud_repo;

import java.util.List;

import com.justanotherprogrammerhere.project1.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}