package com.yash.service;

import java.util.ArrayList;
import java.util.List;

import com.yash.model.Employee;


public class EmployeeDao {

	List<Employee> list=new ArrayList<Employee>();

	public EmployeeDao() {
		super();
	}
	
	public void addEmployee()
	{
		System.out.println("in add");
		list.add(new Employee(1, "priya"));
		list.add(new Employee(2, "riya"));
	}
	
	public List<Employee> getEmployee()
	{
		return list;
	}
}
