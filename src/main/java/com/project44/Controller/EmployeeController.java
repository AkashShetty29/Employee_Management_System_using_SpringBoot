package com.project44.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project44.entity.Employee;
import com.project44.exception.ResourceNotFoundException;
import com.project44.repository.EmployeeRepository;
import com.project44.service.employee_service;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	employee_service employeeService;
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public employee_service getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(employee_service employeeService) {
		this.employeeService = employeeService;
	}
	
	
	
	@PutMapping("/employeeadd")
	public void addEmployee(@RequestBody Employee emp)
	{
		employeeService.addEmployee(emp);
	}
	
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployee();
		
	}
	
	
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee emp1)
	{
		Employee employee = employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee not exist with given id" +id));
		
		employee.setEmpName(emp1.getEmpName());
		employee.setDeptName(emp1.getDeptName());
		employee.setSalary(emp1.getSalary());
		
		Employee updatedEmployees = employeeRepository.save(employee);
		return ResponseEntity.ok(updatedEmployees);
		
	}
	
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable int id)
	{
		Employee employee = employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee not exist with given id" +id));
		
		employeeRepository.delete(employee);
		
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	
	
	
	
	

}
