package com.essgineer.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.essgineer.demo.model.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer>{

}
