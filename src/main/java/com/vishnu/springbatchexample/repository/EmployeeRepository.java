package com.vishnu.springbatchexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishnu.springbatchexample.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
