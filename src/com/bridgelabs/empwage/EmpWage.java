package com.bridgelabs.empwage;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Emplyoee Wage Computation Program");
		
		/* UC=1
		 * to check employee is present or absent
		 * initially variable isPresent is assigned as 1;and then
		 * random function is used to get the desired output
		 */
		int isPresent = 1;
		int checkAttendance =(int)Math.floor((Math.random()*10)%2);	
		System.out.println(checkAttendance);
		if(checkAttendance == isPresent) {
			System.out.println("Emplyoee is present");
		}
		else {
			System.out.println("Emplyoee is absent");
	}
}

}
