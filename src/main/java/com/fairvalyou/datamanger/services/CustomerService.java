/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fairvalyou.datamanger.services;

import com.fairvalyou.datamanger.domain.node.Customer;
import com.fairvalyou.datamanger.repositories.CustomerRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author crtom
 */
@Service
public class CustomerService {

    public final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional(readOnly = false)
    public Customer save(Customer user) {
        return customerRepository.save(user);
    }

    @Transactional(readOnly = false)
    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Customer findById(Long Id) {
        return customerRepository.findById(Id).get();
    }

    @Transactional(readOnly = true)
    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }
}
