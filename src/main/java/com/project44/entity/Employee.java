package com.project44.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="employee_Name")
	private String empName;
	
	@Column(name="dept_Name")
	private String deptName;
	
	@Column(name="Salary")
	private long salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String empName, String deptName, long salary) {
		super();
		this.id = empid;
		this.empName = empName;
		this.deptName = deptName;
		this.salary = salary;
	}
	

	public Employee(String empName, String deptName, long salary) {
		super();
		this.empName = empName;
		this.deptName = deptName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	
	
	

}
