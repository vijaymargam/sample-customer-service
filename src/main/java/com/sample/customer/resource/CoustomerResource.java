package com.sample.customer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.customer.domain.Customer;
import com.sample.customer.service.CustomerService;


@RestController
@RequestMapping("/customer")
public class CoustomerResource {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/get/{customerId}")
	public Customer findCustomerById(@PathVariable int customerId) {
		Customer customer = customerService.findCustomerById(customerId);
		return customer;
	}

}
