package com.crack.assignment7.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.narwal.asignment7.services.OrderService;
import com.narwal.assignment7.models.Order;

@RestController 
public class OrderController {

	@Autowired
	OrderService orderService;

	@RequestMapping("/orders")
	public Collection<Order> getAllOrders() {
		System.out.println("orders");
		return orderService.getAllOrders();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/orders")
	public void addOrder(@RequestBody Order Order) {
		orderService.addOrder(Order);
	}

	@RequestMapping("/orders/{id}")
	public Order getOrder(@PathVariable("id") int id) {
		return orderService.getOrder(id);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/orders/{id}")
	public void updateOrder(@PathVariable("id") int id, @RequestBody Order order) {
		orderService.updateOrder(id, order);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/orders/{id}")
	public void deleteOrder(@PathVariable("id") int id) {
		orderService.deleteOrder(id);
	}

}
