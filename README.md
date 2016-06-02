[![Build Status](https://travis-ci.org/ExampleDriven/spring-cloud-eureka-example.svg)](https://travis-ci.org/ExampleDriven/spring-cloud-eureka-example)

# spring-cloud-eureka-example

This is the source code for the blog post

http://exampledriven.wordpress.com/TBD

This example covers the following :

- Eureka server
- Ribbon with rest template
- Feign client
- Feign client with Hystrix fallback

To run this project

    mvn clean install

then execute

    mvn spring-boot:run

in the all the below directories in the following order
- eureka-server
- customer-server
- customer-client

Test URLs :

- Rest template example : http://localhost:9099/customer-client/1
- Feign example : http://localhost:9099/customer-client-feign/1
- Feign example with Hystrix fallback: http://localhost:9099/customer-client-feign/8
- Eureka : http://localhost:8761/