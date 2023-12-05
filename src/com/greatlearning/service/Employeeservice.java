package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface Employeeservice {
	
	String generateEmailID(String fname,String lname,String deptNAME);
	String generatePassword();
	void showEmployeeDetails(Employee e);
}
