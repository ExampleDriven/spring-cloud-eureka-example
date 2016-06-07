package org.exampledriven.eureka.customer.shared.client.controller;

import org.exampledriven.eureka.customer.shared.Customer;
import org.exampledriven.eureka.customer.shared.CustomerServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CustomerFeignController {

    @Autowired
    private CustomerServiceFeignClient customerServiceFeignClient;

    @RequestMapping(value = "/customer-client-feign/{id}", method = RequestMethod.GET, produces = "application/json")
    public MessageWrapper<Customer> getCustomer(@PathVariable int id) {

        Customer customer = customerServiceFeignClient.getCustomer(id);

        return new MessageWrapper<>(customer, "server called using eureka with feign");
    }

}