package com.bridgelabs.empwage;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Emplyoee Wage Computation Program");
		
		/* UC=3
		 * to check employee is present or absent or working for part time.
		 * switch statement is used to calculate the monthly wage employee wage 
		 * 
		 */
		int isPresent = 1;
		int wagePerHour = 20;
		int noOfWorkingHours = 8;
		int partTimeHours = 4;
		int workingDaysInAMonth = 20;//monthly
		int checkAttendance =(int)Math.floor((Math.random()*10)%3);	
		System.out.println(checkAttendance);
		switch(checkAttendance){         
		case 0 : 
			System.out.println("Emplyoee is absent");
			break;
		
		case 1:
			System.out.println("Emplyoee is present");//uc1 code added
			System.out.println("Emplyoee Daily Wage is"+" " +wagePerHour * noOfWorkingHours);
			System.out.println("Emplyoee Monthly wage is" + " " +wagePerHour*noOfWorkingHours*workingDaysInAMonth);//uc5 code is added
			break;
		case 2:
			System.out.println("Part Time");
			System.out.println("Emplyoee part Time wage is" + noOfWorkingHours*wagePerHour);
			System.out.println("Emplyoee Monthly wage is"+" " + wagePerHour*partTimeHours*workingDaysInAMonth);
			break;
		
	}
}

}
