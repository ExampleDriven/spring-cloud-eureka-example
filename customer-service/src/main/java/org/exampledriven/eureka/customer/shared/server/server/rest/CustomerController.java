package org.exampledriven.eureka.customer.shared.server.server.rest;

import org.exampledriven.eureka.customer.shared.Customer;
import org.exampledriven.eureka.customer.shared.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController implements CustomerService {

    private static Logger logger = LoggerFactory.getLogger(CustomerController.class);

    private List<Customer> customers;

    public CustomerController() {
        customers = new LinkedList<>();
        customers.add(new Customer(1, "Peter", "Test"));
        customers.add(new Customer(2, "Peter", "Test2"));
    }

    public Customer getCustomer(@PathVariable int id) {

        logger.debug("reading customer with id " + id);

        Optional<Customer> customer = customers.stream().filter(customer1 -> customer1.getId() == id).findFirst();

        return customer.get();

    }

}