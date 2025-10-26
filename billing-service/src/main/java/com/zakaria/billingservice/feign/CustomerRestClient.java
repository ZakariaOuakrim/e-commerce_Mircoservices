package com.zakaria.billingservice.feign;

import com.zakaria.billingservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "customer-service")
public interface CustomerRestClient  {
    @GetMapping("/api/customers/{id}")
    public Customer findCustomerById(Long id);
}
