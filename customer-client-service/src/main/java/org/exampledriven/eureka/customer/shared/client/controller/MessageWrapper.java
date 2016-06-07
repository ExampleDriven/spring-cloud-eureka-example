package org.exampledriven.eureka.customer.shared.client.controller;

public class MessageWrapper<T> {

    private T wrapped;
    private String message;

    public MessageWrapper(T wrapped, String message) {
        this.wrapped = wrapped;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public T getWrapped() {
        return wrapped;
    }

}
