package com.customer.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.customer.service.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
