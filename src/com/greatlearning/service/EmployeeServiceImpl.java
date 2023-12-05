package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmployeeServiceImpl   implements Employeeservice {

	@Override
	public String generateEmailID(String fname, String lname, String deptNAME) 
	{

		return fname+lname+"."+deptNAME+"@greatlearning.com";
	}

	@Override
	public String generatePassword() {
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // 26
		String lower="abcdefghijklmnopqrstuvwxyz"; //26
		String nums="0123456789";                  //10
		String splchars="!@#$%^&*()";              //10
		
		String combined=caps+lower+nums+splchars;  //72
		String myPass="";
		Random random=new Random();
    	for(int i=1;i<=8;i++)
		{
    		myPass=myPass +String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		
		return myPass;
			
	}

	@Override
	public void showEmployeeDetails(Employee e) {
    System.out.println("Employee First Name is :"+e.getFirstName());
    System.out.println("Employee last Name is :"+e.getLastName());
    System.out.println("Employee Email is :"+e.getEmail());
    System.out.println("Employee password Name is :"+e.getPassword());
		
	}

	

}
