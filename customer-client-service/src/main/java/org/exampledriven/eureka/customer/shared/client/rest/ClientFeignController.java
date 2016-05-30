package org.exampledriven.eureka.customer.shared.client.rest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
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
    public Hint getCustomer(@PathVariable int id) {

        return getHint(id);

    }

    @HystrixCommand(fallbackMethod = "fallbackGetCustomer")
    private Hint getHint(@PathVariable int id) {
        Customer customer = customerService.getCustomer(id);

        return new Hint(customer, "server called using eureka with feign");
    }

    public Hint fallbackGetCustomer(@PathVariable int id) {
        return new Hint(null, "this result comes from a hystrix fallback");
    }

    @RequestMapping(value = "/test")
//    @Hystrix(fallbackHandler = )
    @HystrixCommand(fallbackMethod = "fallbackTest")
    public String test() throws Exception {
        throw new Exception("e");
    }



}