package com.yash.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) 
	{
	        Employee employee1 = new Employee(
	                "Yash",
	                20,
	                new Address("1234"),
	                Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));
	     
	            Employee employee2 = new Employee(
	                "Ram",
	                20,
	                new Address("1235"),
	                Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));
	     
	            Employee employee3 = new Employee(
	                "Sita",
	                20,
	                new Address("1236"),
	                Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));
	            
	            List<Employee> employees = Arrays.asList(employee1, employee2, employee3);
	            
	            
	            // Get employee with exact match name "Yash", if not found print "Not found".
	            List<Employee> eMatchName=employees.stream().filter(x->x.getName().equals("Yash")).collect(Collectors.toList());
	            if(eMatchName.isEmpty()){
	            	System.out.println("Not Found");
	            }
	            else{
	            		System.out.println("Employees with matching name Yash :");
	            		eMatchName.forEach(System.out::println);
	            }
	            
	            // Get employee with matching address "1235"
	            System.out.println("Employees with matching address 1235 :");
	            employees.stream().map(x->x).filter(x->x.getAddress().getZipcode().equals("1235")).forEach(System.out::println);
	            
	           
	            // Get all employee having mobile numbers 3333.
	            System.out.println("Employees with matching numbers 3333 :");
	            employees.stream().filter(x->x.getMobileNumbers().stream().anyMatch(emp->emp.getNumber().equals("3333"))).forEach(System.out::println);;
	           
	            // Convert List<Employee> to List<String> of employee name
	            System.out.println("List<String> of employee name :");
	            employees.stream().map(x->x.getName()+" ").collect(Collectors.toList()).forEach(System.out::print);
	            
	            // Collect all the names of employees in a string separated by ||
	            System.out.println("names of employees in a string separated by || :");
	            employees.stream().map(x->x.getName()+" || ").collect(Collectors.toList()).forEach(System.out::print);
	            
	            // Change the case of List<String>
	            System.out.println(" Change the case of List<String> :");
	            employees.stream().map(x->x.getName().toUpperCase()+" ").forEach(System.out::print);
	            
	            // Sort List<String>
	            System.out.println(" Sort List<String> :");
	            employees.stream().map(x->x.getName()).sorted((x,y)->x.compareTo(y)).forEach(System.out::println);;
	            
	            // sort List<Employee> based on name
	            System.out.println(" Collectons List<String> :");
	            Collections.sort(employees,Comparator.comparing(Employee::getName));
	            employees.forEach(System.out::println);

	}

}
