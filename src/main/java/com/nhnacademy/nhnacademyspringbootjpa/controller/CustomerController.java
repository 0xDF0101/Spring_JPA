package com.nhnacademy.nhnacademyspringbootjpa.controller;

import com.nhnacademy.nhnacademyspringbootjpa.entity.Customer;
import com.nhnacademy.nhnacademyspringbootjpa.model.CreateCustomerRequest;
import com.nhnacademy.nhnacademyspringbootjpa.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@RestController
public class CustomerController {


    private final CustomerRepository customerRepository;

    @GetMapping("/customers/{id}")
    public Customer getMyId(@PathVariable("id") Optional<Customer> optionalCustomer) {
        Customer customer = optionalCustomer.orElseThrow(() -> new RuntimeException("Customer not Found"));
        return customer;
    }


    @PostMapping("/customers")
    public ResponseEntity createCustomer(@RequestBody CreateCustomerRequest createCustomerRequest) {

        Customer customer = new Customer(
                createCustomerRequest.getName(),
                createCustomerRequest.getEmailAddress(),
                createCustomerRequest.getPassword()
        );

        Customer customer1 = customerRepository.save(customer);

        log.info("DB 저장 완료 : {}", createCustomerRequest.getName());

        return ResponseEntity.ok().build();
    }
}
