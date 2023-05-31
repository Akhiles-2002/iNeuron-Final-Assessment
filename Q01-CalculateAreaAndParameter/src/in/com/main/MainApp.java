/*
Question 1 : Write a Java program that uses polymorphism by defining an interface called Shape
with methods to calculate the area and perimeter of a shape. Then create classes
that implement the Shape interface for different types of shapes, such as circles and
triangles.
 */

package in.com.main;

import java.util.Scanner;

import in.com.test.Circle;
import in.com.test.Shape;
import in.com.test.Triangle;

public class MainApp {

	public static void main(String[] args) {
		
		double radius, length, breadth, height;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the radius of the Circle ::");
		radius = scanner.nextDouble();	
		
		Shape circle = new Circle(radius);
		System.out.println("Area of Circle is ::"+circle.calculateArea());
		System.out.println("Parameter of Circle is ::"+circle.calculateParameter());
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Enter the length, breadth, height of the Triangle ::");
		length = scanner.nextDouble();
		breadth = scanner.nextDouble();
		height = scanner.nextDouble();
		
		Shape triangle = new Triangle(length, breadth, height);
		System.out.println("Area of Triangle is ::"+triangle.calculateArea());
		System.out.println("Parameter of Triangle is ::"+triangle.calculateParameter());

	}

}
