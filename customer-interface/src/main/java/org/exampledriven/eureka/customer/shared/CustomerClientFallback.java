package org.exampledriven.eureka.customer.shared;

import org.springframework.stereotype.Component;

@Component
public class CustomerClientFallback implements CustomerClient {

    @Override
    public Customer getCustomer(int id) {
        return new Customer(12, "Fallback", "Customer");
    }

}
