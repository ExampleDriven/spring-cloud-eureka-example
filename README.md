[![Build Status](https://travis-ci.org/ExampleDriven/spring-cloud-eureka-example.svg)](https://travis-ci.org/ExampleDriven/spring-cloud-eureka-example)

# spring-cloud-eureka-example

This is the source code for the blog post

http://exampledriven.wordpress.com/TBD

This example covers the following :

- Eureka server
- Ribbon
- Feign
- Rest template integration with Ribbon

To run this project
    mvn clean install

then execute

    mvn spring-boot:run

in the following directories in the following order
- eureka-server
- customer-server
- customer-client

