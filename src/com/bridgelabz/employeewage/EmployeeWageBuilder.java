package com.bridgelabz.employeewage;

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		int isPresent = 1;
		int wagePerHr = 20;
		int fullDayHr = 8;
		int finalWage;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == isPresent) {
			finalWage = (wagePerHr * fullDayHr);
			System.out.println("Employee is Full Time Present!");
			System.out.println("Daily wage of an Full timer employee is" + " " + finalWage + " Rs");
		} else {
			System.out.println("Employee is Absent!");

		}
	}
}