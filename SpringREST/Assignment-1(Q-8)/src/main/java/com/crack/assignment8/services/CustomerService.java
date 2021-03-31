package com.narwal.assignment8.services;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.narwal.assignment8.models.Customer;

@Service
public class CustomerService {

	HashMap<Integer, Customer> customers = new HashMap<Integer, Customer>();
	private static int idCount = 0;
	
	public Collection<Customer> getAllCustomers(){
		return customers.values();
	}
	
	public Customer getCustomer(int id) {
		return customers.get(id);
	}
	
	public void updateCustomer(int id, Customer customer) {
		customer.setId(customers.get(id).getId());
		customers.replace(id, customer);
	}
	
	public void deleteCustomer(int id) {
		customers.remove(id);
	}
	
	public void addCustomer(Customer customer) {
		customer.setId(++idCount);
		customers.put(idCount, customer);
	}
}
