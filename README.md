[![Build Status](https://travis-ci.org/ExampleDriven/spring-cloud-eureka-example.svg)](https://travis-ci.org/ExampleDriven/spring-cloud-eureka-example)

# spring-cloud-eureka-example

This is the source code for the blog post

https://exampledriven.wordpress.com/2016/07/01/spring-cloud-eureka-ribbon-feign-example/

This example covers the following :

- Eureka server
- Ribbon with rest template
- Feign client
  - Hystrix fallback
  - Inheritance

To run this project

    mvn clean install

then execute

    mvn spring-boot:run

in the all the below directories in the following order
- eureka-server
- customer-service
- customer-client-service

Test URLs :

- Rest template example : http://localhost:9099/customer-client/1
- Feign example : http://localhost:9099/customer-client-feign/1
- Feign example with Hystrix fallback: http://localhost:9099/customer-client-feign/8
- Eureka server : http://localhost:8761/