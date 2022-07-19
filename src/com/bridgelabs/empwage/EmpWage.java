package com.bridgelabs.empwage;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Emplyoee Wage Computation Program");
		
		/* UC=3
		 * to check employee is present or absent or working for part time
		 * switch statement is used to calculate the employee wage 
		 * 
		 */
		int isPresent = 1;
		int wagePerHour = 20;
		int noOfWorkingHours = 8;
		int partTimeHours = 4;
		int checkAttendance =(int)Math.floor((Math.random()*10)%3);	
		System.out.println(checkAttendance);
		switch(checkAttendance){         //UC4 added
		case 0 : 
			System.out.println("Emplyoee is absent");
			break;
		
		case 1:
			System.out.println("Emplyoee is present");//uc1 code added
			System.out.println("Emplyoee Daily wage is" + " " +wagePerHour*noOfWorkingHours);//uc4 code is added
			break;
		case 2:
			System.out.println("Part Time");
			System.out.println("Emplyoee Part Time wage is"+" " + wagePerHour*partTimeHours);
			break;
		
	}
}

}
