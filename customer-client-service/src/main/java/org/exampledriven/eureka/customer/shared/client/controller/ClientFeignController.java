package org.exampledriven.eureka.customer.shared.client.controller;

import org.exampledriven.eureka.customer.shared.Customer;
import org.exampledriven.eureka.customer.shared.CustomerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ClientFeignController {

    @Autowired
    CustomerClient customerClient;

    @RequestMapping(value = "/customer-client-feign/{id}", method = RequestMethod.GET, produces = "application/json")
    public Hint getCustomer(@PathVariable int id) {

        Customer customer = customerClient.getCustomer(id);

        return new Hint(customer, "server called using eureka with feign");
    }

}