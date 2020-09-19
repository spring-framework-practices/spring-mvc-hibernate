package com.trl.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = "/showFormForAdd")
    public String add(Model model) {

        CustomerDTO customer = new CustomerDTO();

        model.addAttribute("customer",customer);

        return "customer-form";
    }

    @GetMapping(path = "/list")
    public String getAll (Model model){

        model.addAttribute("customers", customerService.getAll());
        return "list-customers";
    }

    @PostMapping(path = "/saveCustomer")
    public String save(@ModelAttribute("customer") CustomerDTO customer) {

        customerService.add(customer);

        return "redirect:/customer/list";
    }

    @GetMapping(path = "/showFormForUpdate")
    public String update(@ModelAttribute("customer") CustomerDTO customer) {
        customerService.update(customer);

        return "customer-form";
    }

}
