package com.zakaria.customerservice;

import com.zakaria.customerservice.entities.Customer;
import com.zakaria.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder()
                            .email("zakaria@gmail.com")
                            .name("Zakaria")
                    .build());
            customerRepository.save(Customer.builder()
                    .email("Imane@gmail.com")
                    .name("Imane")
                    .build());
            customerRepository.save(Customer.builder()
                    .email("saad@gmail.com")
                    .name("saad")
                    .build());
            customerRepository.findAll().forEach(c->{
                System.out.println("============");
                System.out.println(c.getId());
                System.out.println(c.getName());
                System.out.println(c.getEmail());
                System.out.println("=========");
            });
        };
    }
}
