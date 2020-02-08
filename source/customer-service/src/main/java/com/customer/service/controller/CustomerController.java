package com.customer.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customer.service.model.Customer;
import com.customer.service.repository.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository repository;
	
	@RequestMapping(method = RequestMethod.PUT,
            value = "/customer/add",
            produces = MediaType.APPLICATION_JSON_VALUE)
	public Customer addCustomer(@RequestBody Customer customer) {
		System.out.println("Before Inserting Data Into Customer");
		customer = repository.save(customer);
		System.out.println("Customer Data Inserted.");
		return customer;
	}
	
	@RequestMapping(method = RequestMethod.POST,
            value = "/customer/update",
            produces = MediaType.APPLICATION_JSON_VALUE)	
	public Customer updateCustomer(@RequestBody Customer customer) {
		System.out.println("Before Updating Data Into Customer");
		customer = repository.save(customer);
		System.out.println("Customer Data Updated.");
		return customer;
	}
	
}
