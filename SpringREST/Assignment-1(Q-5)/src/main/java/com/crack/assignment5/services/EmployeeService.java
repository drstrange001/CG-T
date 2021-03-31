package com.crack.assignment5.services;

import java.awt.List;
import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.narwal.assignment5.models.Employee;

@Service
public class EmployeeService {
	
	HashMap<Integer, Employee> employees = new HashMap<>();
	private static int idCount = 0;
	
	public void addEmployee(Employee employee) {
		employee.setEmployeeId(++idCount);
		employees.put(idCount, employee);
	}

	public Collection<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employees.values();
	}

	public Employee getEmployee(int id) {
		return employees.get(id);
	}
	
	public void updateEmployee(int id, Employee employee) {
		employees.replace(id, employee);
	}
	
	public void deleteEmployee(int id) {
		employees.remove(id);
	}
	
}
