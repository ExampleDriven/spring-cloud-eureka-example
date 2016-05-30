package org.exampledriven.eureka.customer.shared.client.controller;

import org.exampledriven.eureka.customer.shared.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
class ClientRestTemplateController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/customer-client/{id}", method = RequestMethod.GET, produces = "application/json")
    public Hint getCustomer(@PathVariable int id) {

        Customer customer = restTemplate.exchange(
                "http://customer-service/customer/{id}",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Customer>() {
                },
                id).getBody();

        return new Hint(customer, "server called using eureka with rest template");

    }

}