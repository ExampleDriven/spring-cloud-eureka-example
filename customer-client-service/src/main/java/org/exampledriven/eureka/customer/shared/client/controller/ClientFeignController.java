package org.exampledriven.eureka.customer.shared.client.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.exampledriven.eureka.customer.shared.Customer;
import org.exampledriven.eureka.customer.shared.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ClientFeignController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/customer-client-feign/{id}", method = RequestMethod.GET, produces = "application/json")
    @HystrixCommand(fallbackMethod = "fallbackGetCustomer")
    public Hint getCustomer(@PathVariable int id) {

        Customer customer = customerService.getCustomer(id);

        return new Hint(customer, "server called using eureka with feign");
    }

    public Hint fallbackGetCustomer(int id) {
        return new Hint(null, "Fallback method handled exception for id " + id);
    }

}