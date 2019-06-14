package com.yash.practice;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
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
            // Get employee with matching address "1235"
            // Get all employee having mobile numbers 3333.
            // Convert List<Employee> to List<String> of employee name
            // Collect all the names of employees in a string separated by ||
            // Change the case of List<String>
            // Sort List<String>
            // sort List<Employee> based on name
            // 
            
            
	}
}
