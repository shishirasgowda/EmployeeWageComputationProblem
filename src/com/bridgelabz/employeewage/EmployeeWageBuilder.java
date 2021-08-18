package com.bridgelabz.employeewage;

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		int isPresent = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == isPresent)
			System.out.println("Employee is Full Time Present!");
		else
			System.out.println("Employee is Absent!");
	}
}
