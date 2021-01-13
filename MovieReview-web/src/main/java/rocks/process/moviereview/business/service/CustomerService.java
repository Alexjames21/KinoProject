/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */
/*
package rocks.process.moviereview.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import rocks.process.moviereview.data.domain.Review;
import rocks.process.moviereview.data.repository.CustomerRepository;

import java.util.List;

@Service
@Validated
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private LoginService agentService;


	public void deleteCustomer(Long customerId)
	{
		customerRepository.deleteById(customerId);
	}
	
	public Review findCustomerById(Long customerId) throws Exception {
		List<Review> customerList = customerRepository.findByIdAndAgentId(customerId, agentService.getCurrentAgent().getId());
		if(customerList.isEmpty()){
			throw new Exception("No customer with ID "+customerId+" found.");
		}
		return customerList.get(0);
	}

	public List<Review> findAllCustomers() {
		return customerRepository.findByAgentId(agentService.getCurrentAgent().getId());
	}
	
} */
