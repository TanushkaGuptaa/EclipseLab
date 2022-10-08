/*
 	Program : Create a Class student which is inherited by college and school student .
 	 		  Override the method calculate average marks.	
 	@Author : Tanushka Gupta
 	@date : 6 Oct 2022
 */
package com.overridden;

public class Student {

	private int id;
	private String name;
	private int sub;
	protected double avgmarks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int sub) {
		super();
		this.id = id;
		this.name = name;
		this.sub = sub;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSub() {
		return sub;
	}

	public void setSub(int sub) {
		this.sub = sub;
	}

	public double getAvgmarks() {
		return avgmarks;
	}

	public void calcAvg(double... s) {
		// TODO Auto-generated method stub

	}

}
