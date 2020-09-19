package com.trl.customer;

import java.util.List;

public interface CustomerService {

    void add (CustomerDTO customer);

    List<CustomerDTO> getAll();

    void update (CustomerDTO customer);
}
