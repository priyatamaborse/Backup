package com.yash.service;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.yash.dao.EmployeeService;
import com.yash.model.Employee;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

	@InjectMocks
	EmployeeService employeeService;
	
	@Mock
	EmployeeDao employeeDao;
	
	@Test
	public void testMockito()
	{
		//create data
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1, "priya"));
		list.add(new Employee(2, "riya"));
		list.add(new Employee(3, "siya"));
		
		//Stubbing
		//when we call dao get employee then return above list insatnce
		when(employeeDao.getEmployee()).thenReturn(list);
		
		List<Employee> actual=employeeService.getEmployee();
		verify(employeeDao,times(1)).getEmployee(); //default 1
		
		//asseration
		assertEquals(employeeDao.getEmployee(),actual);
		//doNothing().when(employeeDao).getEmployee();
		//doThrow(new RuntimeException()).when(employeeDao.getEmployee()).isEmpty();
	}
	
}
