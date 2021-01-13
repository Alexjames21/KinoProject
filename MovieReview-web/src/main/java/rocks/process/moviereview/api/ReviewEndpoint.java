/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package rocks.process.moviereview.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import rocks.process.moviereview.business.service.CustomerService;
import rocks.process.moviereview.data.domain.Review;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class ReviewEndpoint {
    @Autowired
    private CustomerService customerService;


    @GetMapping(path = "/customer", produces = "application/json")
    public List<Review> getCustomers() {
        return customerService.findAllCustomers();
    }

    @GetMapping(path = "/customer/{customerId}", produces = "application/json")
    public ResponseEntity<Review> getCustomer(@PathVariable(value = "customerId") String customerId) {
        Review customer = null;
        try {
            customer = customerService.findCustomerById(Long.parseLong(customerId));
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
        return ResponseEntity.ok(customer);
    }

    @PutMapping(path = "/customer/{customerId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Review> putCustomer(@RequestBody Review customer, @PathVariable(value = "customerId") String customerId) {
        try {
            customer.setId(Long.parseLong(customerId));
            customer = customerService.editCustomer(customer);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return ResponseEntity.accepted().body(customer);
    }

    @DeleteMapping(path = "/customer/{customerId}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable(value = "customerId") String customerId) {
        try {
            customerService.deleteCustomer(Long.parseLong(customerId));
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return ResponseEntity.accepted().build();
    }
}