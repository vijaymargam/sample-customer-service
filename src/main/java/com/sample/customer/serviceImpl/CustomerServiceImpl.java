package com.sample.customer.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.customer.domain.Customer;
import com.sample.customer.repository.CustomerRepository;
import com.sample.customer.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	/*@Autowired
	private CustomerRepository customerRepository;*/

	@Override
	public Customer findCustomerById(int customerId) {
		Customer customer = new Customer();
		customer.setCustId(1);
		customer.setName("santhosh");
		customer.setMobile("8765432190");
		customer.setEmail("santu@gmail.com");
		customer.setAddress("HYD");
		return customer;
	}

}
