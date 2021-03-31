package com.crack.asignment7.services;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.narwal.assignment7.models.Order;

@Service
public class OrderService {
	HashMap<Integer, Order> Orders = new HashMap<>();
	private static int idCount = 0;
	
	public void addOrder(Order Order) {
		Order.setId(++idCount);
		Orders.put(idCount, Order);
	}

	public Collection<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return Orders.values();
	}

	public Order getOrder(int id) {
		return Orders.get(id);
	}
	
	public void updateOrder(int id, Order Order) {
		Orders.replace(id, Order);
	}
	
	public void deleteOrder(int id) {
		Orders.remove(id);
	}
	
	
}
       