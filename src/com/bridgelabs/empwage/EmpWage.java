package com.bridgelabs.empwage;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Emplyoee Wage Computation Program");
		
		/* UC=3
		 * to check employee is present or absent or working for part time
		 * else if  statement is used to calculate the emplyoee wage 
		 * 
		 */
		int isPresent = 1;
		int wagePerHour = 20;
		int noOfWorkingHours = 8;
		int partTimeHours = 4;
		int checkAttendance =(int)Math.floor((Math.random()*10)%3);	
		System.out.println(checkAttendance);
		if(checkAttendance == 1) {     
			System.out.println("Emplyoee is present");//uc1 code added
			System.out.println("Emplyoee Daily wage is" + " " +wagePerHour*noOfWorkingHours);//uc2 code is added
		}
		else if(checkAttendance == 0) {
			System.out.println("Emplyoee is absent");
		}
		else {
			System.out.println("Part Time");//UC3 added
			System.out.println("Emplyoee Part Time wage is"+ wagePerHour*partTimeHours);
		}
		
	}
}


