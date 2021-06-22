package com.bridgelabz.LineComparisonProblem;

import java.util.Scanner;

public class LineComparison {
	
	public static void main(String args[]) {
	
		System.out.println("Welcome to Line Comparison Computation");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coordinates of first point x1 y1 : ");
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		System.out.println("Enter coordinates of second point x2 y2 : ");
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		double length = (Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
		System.out.printf("length of line is = %.2f ",length);
		
	}

}
