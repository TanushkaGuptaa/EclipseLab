package com.overridden;

public class CollegeStudent extends Student {
	public CollegeStudent() {
		super();
	}

	public CollegeStudent(int id, String name, int sub) {
		super(id, name, sub);
		// TODO Auto-generated constructor stub
	}

	// calculate avg marks
	@Override
	public void calcAvg(double... s) {
		this.avgmarks = (s[0] + s[1] + s[2] + s[3] + s[4]) / 5;
	}
}
