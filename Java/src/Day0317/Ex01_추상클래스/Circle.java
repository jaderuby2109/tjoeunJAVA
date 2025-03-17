package Day0317.Ex01_추상클래스;

public class Circle extends Shape {

	double radius; // 반지름

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		// 원의 넓이 = (원주율) * (반지름) * (반지름)
		//		return Math.PI * radius * radius;
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	double round() {
		return 2 * Math.PI * radius;
	}

	// getter, setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// toString
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
