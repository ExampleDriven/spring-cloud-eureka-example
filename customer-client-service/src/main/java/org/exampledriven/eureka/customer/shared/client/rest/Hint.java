package org.exampledriven.eureka.customer.shared.client.rest;

import org.exampledriven.eureka.customer.shared.Customer;

public class Hint {

    private Customer customer;
    private String hint;

    public Hint(Customer customer, String hint) {
        this.customer = customer;
        this.hint = hint;
    }

    public String getHint() {
        return hint;
    }

    public Customer getCustomer() {
        return customer;
    }
}
