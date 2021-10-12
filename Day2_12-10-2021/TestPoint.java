package com.basic;

import java.util.*;

public class InputPoint2D {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter x of p1: ");
		double x_p1 = sc.nextDouble(); 
		System.out.print("Enter y of p1: ");
		double y_p1 = sc.nextDouble();

		
		Point2D p1 = new Point2D(x_p1,y_p1);
		System.out.println(p1.getDetails());
		
		System.out.print("Enter x of p2: ");
		double x_p2 = sc.nextDouble(); 
		System.out.print("Enter y of p2: ");
		double y_p2 = sc.nextDouble();

		
		Point2D p2 = new Point2D(x_p2,y_p2);
		System.out.println(p2.getDetails());

	}

}
