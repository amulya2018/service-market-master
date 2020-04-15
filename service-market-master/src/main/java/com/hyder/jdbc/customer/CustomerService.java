package com.hyder.jdbc.customer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	CustomerInterface inter;

	Optional<Customer> signIn(int customerId){
		return inter.findById(customerId);
	}
	
	void signUp(Customer customer) {
		inter.save(customer);
	}
}
