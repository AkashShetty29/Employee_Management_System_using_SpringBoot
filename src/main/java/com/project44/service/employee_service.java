package com.project44.service;

import java.util.List;

import com.project44.entity.Employee;

public interface employee_service {
	
	public void addEmployee(Employee emp);
	
	public void updateEmployee(Employee emp, int empid);
	
	public void deleteEmployee(int empid);
	
	public List<Employee> getAllEmployee();

}
