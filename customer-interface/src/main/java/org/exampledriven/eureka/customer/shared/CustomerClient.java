package org.exampledriven.eureka.customer.shared;

import org.springframework.cloud.netflix.feign.FeignClient;

//@FeignClient(value = "customer-service")
@FeignClient(value = "customer-service", fallback = CustomerClientFallback.class)
public interface CustomerClient extends CustomerService {

}
