package in.com.test;

public class Circle implements Shape {

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double calculateParameter() {
		return 2 * Math.PI * radius;
	}

}
