package org.exampledriven.eureka.customer.shared;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(CustomerService.SERVICE_NAME)
public interface CustomerService {

    String SERVICE_NAME = "customer-service";

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET, produces = "application/json")
    Customer getCustomer(@PathVariable("id") int id);
}
