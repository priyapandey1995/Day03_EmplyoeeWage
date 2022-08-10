package com.bridgelabs.empwage;

public class Main {

	public static void main(String[] args) {
		EmpWage emp = new EmpWage();
		Welcome();
		emp.toCalculateMonthlyWages();
		
		

	}
	public static void Welcome() {
		System.out.println("welcome to Emplyoee Wage Computation Problem");
	}

}
