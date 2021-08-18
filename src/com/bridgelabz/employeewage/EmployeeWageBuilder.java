package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		int wagePerHr = 20;
		int fullDayHr = 8;
		int partDayHr = 4;
		int dayInMonth = 20;
		int dayWage;
		int monthlyWage;

		Random rmd = new Random();
		int empCheck = rmd.nextInt(3);
		switch (empCheck) {
		case 2: {
			dayWage = (wagePerHr * partDayHr);
			monthlyWage = (dayInMonth * dayWage);
			System.out.println("Employee is part time present!");
			System.out.println("Daily wage of an part timer employee is" + " " + dayWage + " " + "Rs");
			System.out.println("Monthly wage of an part timer employee is" + " " + monthlyWage + " " + "Rs");
			break;
		}
		case 1: {
			dayWage = (wagePerHr * fullDayHr);
			monthlyWage = (dayInMonth * dayWage);
			System.out.println("Employee is Full Time Present!");
			System.out.println("Daily wage of an full timer employee is" + " " + dayWage + " " + "Rs");
			System.out.println("Monthly wage of an full timer employee is" + " " + monthlyWage + " " + "Rs");
			break;
		}
		case 0: {
			System.out.println("Employee is Absent!");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + empCheck);
		}
	}
}