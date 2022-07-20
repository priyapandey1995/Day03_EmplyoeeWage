package com.bridgelabs.empwage;

public class EmpWage {
	static int wagePerHour = 20;
	static int noOfWorkingHours = 8;
	static int partTimeHours = 4;
	static int workingDaysInAMonth = 20;//monthly
	static int WorkingHourPerMonth = 100;
	//static int IsFullTime = 1;
	//static int IsPartTime = 0;

	public static void main(String[] args) {
		/* UC=3
		 * to check employee is present or absent or working for part time.
		 * switch statement is used to calculate the monthly wage employee wage 
		 * 
		 */
		System.out.println("Welcome to Emplyoee Wage Computation Program");
		int dailyWages = 0;
		int workingDay =1;
		int monthlyWages = 1;
		int day =1;
		int totalWorkingHoursInAMonth =0;
		while(workingDay <= workingDaysInAMonth && totalWorkingHoursInAMonth<=WorkingHourPerMonth) {
		int checkAttendance =(int)Math.floor((Math.random()*10)%3);	
		System.out.println(checkAttendance);
		switch(checkAttendance){         
		case 0 : 
			System.out.println("Emplyoee is absent");
			break;
		
		case 1:
			System.out.println("Emplyoee is present");//uc1 code added
			System.out.println("Emplyoee Daily Wage is"+" " +wagePerHour * noOfWorkingHours);
			int totalWorkingHoursInMonth = 1;
			monthlyWages = dailyWages + monthlyWages;
			totalWorkingHoursInAMonth = totalWorkingHoursInAMonth + noOfWorkingHours;
			break;
		case 2:
			System.out.println("Part Time");
			System.out.println("Emplyoee part Time wage is" + noOfWorkingHours*wagePerHour);
			monthlyWages = dailyWages + monthlyWages;
			totalWorkingHoursInAMonth = totalWorkingHoursInAMonth + partTimeHours;
			break;
		
	}
		day++;
		workingDay++;
}
		System.out.println("total monthly working hours" + totalWorkingHoursInAMonth);
		System.out.println("monthly wages:"+monthlyWages);

}
}
