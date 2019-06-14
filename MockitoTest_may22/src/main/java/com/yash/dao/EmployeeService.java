package com.yash.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yash.model.Employee;
import com.yash.service.EmployeeDao;

public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Hello ! " + name);
	}
	
	public void testAddEmployee()
	{
		employeeDao.addEmployee();
	}
	public List<Employee> getEmployee()
	{
		return employeeDao.getEmployee();
	}
}
