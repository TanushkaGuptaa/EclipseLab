package com.Buffer;

import java.util.Scanner;

public class StringBuffer {

	public static long checkStringBuffer(String str) {
		// storing current time
		long currTime = System.currentTimeMillis();
		// Creating new stringBuffer object
		StringBuffer sbf = new StringBuffer();

		for (int i = 0; i < 100000; i++) {
			sbf.append("b");
		}
		// return the time
		return System.currentTimeMillis() - currTime;
	}

	private void append(String string) {
		// TODO Auto-generated method stub

	}

	public static long checkStringBuilder(String str) {

		long currTime = System.currentTimeMillis();
		// Creating stringBuilder object
		StringBuilder sbl = new StringBuilder(str);

		for (int i = 0; i < 100000; i++) {
			sbl.append("b");
		}
		// return the time
		return System.currentTimeMillis() - currTime;
	}

	// create check performance
	public static void checkPerformance(String str) {
		// Storing StringBuffer time
		long sbfr = checkStringBuffer(str);
		long sblr = checkStringBuilder(str);

		// printing time taken
		System.out.println("String buffer time is : " + sbfr + " mili sec");
		System.out.println("String builder time is : " + sblr + " mili sec");

		if (sbfr > sblr) {
			System.out.println("String buffer is fast");
		}

		else {
			System.out.println("String builder is fast");
		}
	}

	// calling main method
	public static void main(String[] args) {
		try (// Creating new scanner object
				Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the string :");
			checkPerformance(sc.next());
		}
	}
}