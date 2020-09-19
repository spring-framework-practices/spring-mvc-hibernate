package com.trl.customer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void add(CustomerDTO customer) {
        customerRepository.add(customer);
    }

    @Override
    public List<CustomerDTO> getAll() {
        return customerRepository.getAll();
    }

    @Override
    public void update(CustomerDTO customer) {
        customerRepository.update(customer);
    }
}
