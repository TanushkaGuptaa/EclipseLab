package com.Abstract;

import java.util.Scanner;

public class TestAreaShape {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			// Create area object
			Area a1 = new Area();

			// for rectangle
			System.out.println("----- RECTANGLE -----");
			// take length and breadth input
			System.out.println("Enter the lenghth : ");
			int len = sc.nextInt();
			int bre = sc.nextInt();
			// print area of rectangle
			System.out.println("Area of rectangle is : " + a1.rectangleArea(len, bre));

			// for square
			System.out.println("----- SQUARE -----");
			// Take side input
			System.out.println("Enter the side : ");
			int side = sc.nextInt();
			// print area of square
			System.out.println("Area of square is : " + a1.squareArea(side));

			// for circle
			System.out.println("----- CIRCLE -----");
			// take radius input
			System.out.println("Enter the radius : ");
			int radius = sc.nextInt();
			// print area of circle
			System.out.println("Area of circle is : " + a1.circleArea(radius));
		}

	}

}
