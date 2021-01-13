/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */
/*
package rocks.process.acrm.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import rocks.process.acrm.business.service.CustomerService;
import rocks.process.acrm.data.domain.Customer;

import javax.validation.ConstraintViolationException;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class ReviewEndpoint {
    @Autowired
    private ReviewService reviewService;

    @PostMapping(path = "/review", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Customer> postReview(@RequestBody Customer customer) {
        try {
            customer = customerService.editReview(customer);
        } catch (ConstraintViolationException e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getConstraintViolations().iterator().next().getMessage());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{customerId}")
                .buildAndExpand(customer.getId()).toUri();

        return ResponseEntity.created(location).body(customer);
    }

    @GetMapping(path = "/customer", produces = "application/json")
    public List<Customer> getCustomers() {
        return customerService.findAllCustomers();
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
}*/