package com.trl.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class CustomerRepository {

    private final List<CustomerDTO> customerDTOList;

    public CustomerRepository() {

        this.customerDTOList = new ArrayList<>();

        CustomerDTO customer1 = new CustomerDTO();
        customer1.setId(UUID.randomUUID());
        customer1.setFirstName("Roman");
        customer1.setLastName("Tsyupryk");
        customer1.setEmail("tsyupryk.roman@gmail.com");
        CustomerDTO customer2 = new CustomerDTO();
        customer2.setId(UUID.randomUUID());
        customer2.setFirstName("Mariana");
        customer2.setLastName("Tsyupryk");
        customer2.setEmail("tsyupryk.mariana@gmail.com");
        CustomerDTO customer3 = new CustomerDTO();
        customer3.setId(UUID.randomUUID());
        customer3.setFirstName("Amaya");
        customer3.setLastName("Tsyupryk");
        customer3.setEmail("tsyupryk.amaya@gmail.com");

        this.customerDTOList.add(customer1);
        this.customerDTOList.add(customer2);
        this.customerDTOList.add(customer3);

    }

    public void add (CustomerDTO customer){
        customerDTOList.add(customer);
    }

    public List<CustomerDTO> getAll(){
        return new ArrayList<>(customerDTOList);
    }

    public void update (CustomerDTO customer) {
        for (CustomerDTO cm: customerDTOList) {
            if (cm.getId().equals(customer.getId())) {
                cm.setFirstName(customer.getFirstName());
                cm.setLastName(customer.getLastName());
                cm.setEmail(customer.getEmail());
            }
        }

    }
}
