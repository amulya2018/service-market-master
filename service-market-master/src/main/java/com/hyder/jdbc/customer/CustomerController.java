package com.hyder.jdbc.customer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	@RequestMapping(method = RequestMethod.POST, value ="/customers")
	void signUp(@RequestBody Customer customer){
		return service.signUp(customer);
	}
	
	@RequestMapping("/customers/{customerId}")
	Optional<Customer> signIn(@PathVariable int customerId){
		return service.signIn(customerId);
	}

}
