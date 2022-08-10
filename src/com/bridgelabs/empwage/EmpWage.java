package com.bridgelabs.empwage;
/**
 * 
 * @author pande
 *
 */

public class EmpWage {
	static int wagePerHour = 20;
	static int noOfWorkingHours = 8;
	static int partTimeHours = 4;
	static int workingDaysInAMonth = 20;//monthly
	static int WorkingHourPerMonth = 100;
	
	/**
	 * values initialisation
	 * while loop is performed to calculate monthly wages
	 * then checking for attendace
	 * if its 0=>emply absent
	 * if its 1 =>present
	 * if its 2=>part-time
	 */
	
		
		public void toCalculateMonthlyWages() {
			int dailyWages = 0;
			int workingDay =1;
			int monthlyWages = 1;
			int day =1;
			int totalWorkingHoursInAMonth = 0;
		
		while(workingDay <= workingDaysInAMonth && totalWorkingHoursInAMonth<=WorkingHourPerMonth) {
		int checkAttendance =(int)Math.floor((Math.random()*10)%3);	
		System.out.println(checkAttendance);
		switch(checkAttendance){         
		case 0 : 
			System.out.println("Emplyoee is absent");
			break;
		
		case 1:
			System.out.println("Emplyoee is present");
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
