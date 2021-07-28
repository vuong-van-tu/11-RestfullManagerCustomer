package com.codegym.cms.service.Impl;

import com.codegym.cms.model.Customer;
import com.codegym.cms.repository.ICustomerRepo;
import com.codegym.cms.service.ICustomerService;
import com.codegym.cms.service.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepo iCustomerRepo;

    @Override
    public Iterable<Customer> findAll() {
        return iCustomerRepo.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return iCustomerRepo.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
       return iCustomerRepo.save(customer);
    }

    @Override
    public void remove(Long id) {
        iCustomerRepo.deleteById(id);
    }
}
