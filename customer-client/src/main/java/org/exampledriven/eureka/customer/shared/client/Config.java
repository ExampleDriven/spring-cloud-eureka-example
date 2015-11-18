package org.exampledriven.eureka.customer.shared.client;

import org.exampledriven.eureka.customer.shared.Customer;
import org.exampledriven.eureka.customer.shared.CustomerService;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableDiscoveryClient
@EnableWebMvc
@EnableFeignClients(basePackageClasses = CustomerService.class)
@Configuration
public class Config {


}
