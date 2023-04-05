package com.greymatter.spring6restmvc.services;

import com.greymatter.spring6restmvc.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {
    Customer getCustomerById(UUID id);
    List<Customer> getAllCustomers();
    Customer saveNewCustomer(Customer customer);
}
