package com.overridden;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating college student
		SchoolStudent sch = new SchoolStudent(201, "sia", 7);
		// calculate avg marks
		sch.calcAvg(78, 95, 88);
		// print details
		System.out.println("------ School Student -------");
		System.out.println("Student Id is : " + sch.getId());
		System.out.println("Student name is : " + sch.getName());
		System.out.println("Student age is : " + sch.getSub());
		System.out.println("Student average marks is : " + sch.getAvgmarks());

		// Creating college student
		CollegeStudent clg = new CollegeStudent(101, "Tanushka", 9);
		// calculate avg marks
		clg.calcAvg(90, 75, 90, 85, 94);
		// print details
		System.out.println("------ College Student -------");
		System.out.println("Student Id is : " + clg.getId());
		System.out.println("Student name is : " + clg.getName());
		System.out.println("Student age is : " + clg.getSub());
		System.out.println("Student average marks is : " + clg.getAvgmarks());
	}

}
