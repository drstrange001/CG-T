package com.narwal.assignment8.services;



import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.narwal.assignment8.models.Order;

@Service
public class OrderService {
	
	HashMap<Integer, Order> orders = new HashMap<Integer, Order>();
	private static int idCount = 0;
	
	public Collection<Order> getAllOrders(){
		return orders.values();
	}
	
	public Order getOrder(int id) {
		return orders.get(id);
	}
	
	public void deleteOrder(int id) {
		orders.remove(id);
	}
	
	public void updateOrder(int id, Order order) {
		order.setId(orders.get(id).getId());
		orders.replace(id, order);
	}

	public void addOrder(Order order) {
		order.setId(++idCount);
		orders.put(idCount, order);
	}
	
}
