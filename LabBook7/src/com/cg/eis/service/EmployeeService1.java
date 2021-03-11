package com.cg.eis.service;

import java.util.Scanner;
import com.cg.eis.bean.Employee1;

public class EmployeeService1 extends Employee1 implements EmployeeInterface
{
	String insuranceScheme;
	public void getDetailsFromUser()
	{
		System.out.println("========================================");
		System.out.println("Enter the emp id");
		Scanner sc = new Scanner(System.in);
		int empid = sc.nextInt();
		System.out.println("Enter the emp salary");
		float empsalary = sc.nextFloat();
		System.out.println("Enter the emp designation");
		String empdesignation = sc.next();
		sc.close();
		
		Employee1 eobj = new Employee1();
		eobj.setId(empid);
		eobj.setSalary(empsalary);
		eobj.setDesignation(empdesignation);
		
		float esalary = eobj.getSalary();
		String edesignation = eobj.getDesignation();
		String einsurance = insuranceScheme(esalary,edesignation);
		eobj.setInsuranceScheme(einsurance);
		
		System.out.println("============================================");
		System.out.println(eobj.getId());
		System.out.println(eobj.getSalary());
		System.out.println(eobj.getDesignation());
		System.out.println(eobj.getInsuranceScheme());
		System.out.println("============================================");
	}

	public String insuranceScheme(float empsalary,String empdesignation) 
	{
		
		if((empsalary>5000 && empsalary<20000) && (empdesignation.equals("systemAssociate")))
		{
			insuranceScheme = "Scheme C ";
		}
		else if((empsalary>20000 && empsalary<40000) && (empdesignation.equals("programmer")))
		{
			insuranceScheme = "Scheme B ";
		}
		else if((empsalary>=40000) && (empdesignation.equals("manager")))
		{
			insuranceScheme = "Scheme A ";
		}
		else
		{
			insuranceScheme = "None";
		}
		return insuranceScheme;
	}
}
