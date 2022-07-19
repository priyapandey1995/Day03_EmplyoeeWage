package com.bridgelabs.empwage;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Emplyoee Wage Computation Program");
		
		/* UC=2
		 * to check employee is present or absent
		 * initially variable isPresent is assigned as 1;and then
		 * random function is used to get the desired output
		 * then,employee daily wage is calculate w.r.t to no of working hours
		 */
		int isPresent = 1;
		int wagePerHour = 20;
		int noOfWorkingHours = 8;
		int checkAttendance =(int)Math.floor((Math.random()*10)%2);	
		System.out.println(checkAttendance);
		if(checkAttendance == isPresent) {
			System.out.println("Emplyoee is present");//uc1 code added
			System.out.println("Emplyoee Daily wage is" + " " +wagePerHour*noOfWorkingHours);//uc2 code is added
		}
		else {
			System.out.println("Emplyoee is absent");
	}
}

}
