package com.yash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.EmployeeService;

public class EmployeeController {

	@Autowired
	private static EmployeeService employeeService;
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"springbean_cfg.xml");
		employeeService = (EmployeeService) context.getBean("helloBean");
		employeeService.printHello();
		//employeeService.testAddEmployee();
	}
}
