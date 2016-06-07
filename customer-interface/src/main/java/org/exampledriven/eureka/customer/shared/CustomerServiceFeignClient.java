package org.exampledriven.eureka.customer.shared;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "customer-service", fallback = CustomerServiceFeignClientFallback.class)
public interface CustomerServiceFeignClient extends CustomerService {

}
