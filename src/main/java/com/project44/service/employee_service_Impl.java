package com.project44.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project44.entity.Employee;
import com.project44.repository.EmployeeRepository;

@Service
public class employee_service_Impl implements employee_service {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public EmployeeRepository getEmployeeRepository() {
		
		return employeeRepository;
		
	}


	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		
		this.employeeRepository = employeeRepository;
		
	}

	@Override
	public void addEmployee(Employee emp) {
		
		employeeRepository.save(emp);
		
	}

	@Override
	public void updateEmployee(Employee emp, int empid) {
		
		employeeRepository.save(emp);
		
	}

	@Override
	public void deleteEmployee(int empid) {
		
		employeeRepository.deleteById(empid);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.findAll();
		
	}

}
