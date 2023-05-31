package in.com.test;

public class Triangle implements Shape {

	private double length;
	private double breadth;
	private double height;

	public Triangle(double length, double breadth, double height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return length * breadth * height;
	}

	@Override
	public double calculateParameter() {
		return length + breadth + height;
	}

}
