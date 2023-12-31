package com.project44.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project44.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



}
