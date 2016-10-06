package org.exampledriven.eureka.customer.shared.client.controller;

import org.exampledriven.eureka.customer.shared.Customer;
import org.exampledriven.eureka.customer.shared.CustomerServiceFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerFeignController {

    private static Logger logger = LoggerFactory.getLogger(CustomerFeignController.class);

    @Autowired
    private CustomerServiceFeignClient customerServiceFeignClient;

    @RequestMapping(value = "/customer-client-feign/{id}", method = RequestMethod.GET, produces = "application/json")
    public MessageWrapper<Customer> getCustomer(@PathVariable int id) {

        logger.debug("Reading customer using feign client with ID " + id);

        Customer customer = customerServiceFeignClient.getCustomer(id);

        return new MessageWrapper<>(customer, "server called using eureka with feign");
    }

}