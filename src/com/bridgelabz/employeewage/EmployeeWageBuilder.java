package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		int wagePerHr = 20;
		int fullDayHr = 8;
		int partDayHr = 4;
		int dayInMonth = 20;
		int dayWage;
		int monthlyWage = 0;
		int workHr = 0;

		Random rmd = new Random();
		int i;
		for (i = 1; i <= dayInMonth; i++) {
			if (workHr < 100) {
				int empCheck = rmd.nextInt(3);
				switch (empCheck) {
				case 2: {
					dayWage = (wagePerHr * partDayHr);
					monthlyWage = (dayInMonth * dayWage);
					workHr = (workHr + partDayHr);
					break;
				}
				case 1: {
					dayWage = (wagePerHr * fullDayHr);
					monthlyWage = (dayInMonth * dayWage);
					workHr = (workHr + fullDayHr);
					break;
				}
				case 0: {
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + empCheck);
				}
			 }
			 else
			 {
				 break;
			 }
		 }
		 System.out.println("The employee monthly wage is" + " " + monthlyWage + " " + "Rs for" + " " + workHr + " " + "Hr in" + " " + (i-1) + " " + "days");
		 
	}
}