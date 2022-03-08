package com.training.cg;

public class EmployeeTest {
	public static void main(String args[])
	{
		Employee emp1= new Employee();
		emp1.setEmpId("101");
		emp1.setEmpSalary(68645);
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getEmpSalary());
	}

}