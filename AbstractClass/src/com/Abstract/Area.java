package com.Abstract;

public class Area extends Shape {
	@Override
	public int rectangleArea(int length, int breath) {
		// TODO Auto-generated method stub
		return length * breath;
	}

	@Override
	public int squareArea(int side) {
		// TODO Auto-generated method stub
		return side * side;
	}

	@Override
	public double circleArea(int radius) {
		// TODO Auto-generated method stub
		return 3.14 * radius * radius;
	}

}
