package com.vishnu.springbatchexample.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vishnu.springbatchexample.model.Employee;
import com.vishnu.springbatchexample.repository.EmployeeRepository;

@Component
public class DBWriter implements ItemWriter<Employee>{

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Override
	public void write(List<? extends Employee> items) throws Exception {
		System.out.println("Data Saved for Employees: " + items);
		employeeRepo.saveAll(items);
	}

}
