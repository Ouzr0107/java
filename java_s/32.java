import java.util.*;

class Circle {
	private double r;

	public Circle() {
	}

	public Circle(double R) {
		r = R;
	}

	public void setR(double R) {
		r = R;
	}

	public double getR() {
		return r;
	}

	public double area() {
		return Math.PI * Math.pow(r, 2);
	}

	public double peri() {
		return 2 * Math.PI * r;
	}
}

public class test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		Circle cir1 = new Circle();
		cir1.setR(a);
		System.out.println(cir1.getR() + " " + cir1.area() + ' ' + cir1.peri());		
		Circle cir2 = new Circle(a);
		System.out.println(cir2.getR() + " " + cir2.area() + ' ' + cir2.peri());		
	}
}