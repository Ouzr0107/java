import java.util.Scanner;

abstract class Shape {
    public abstract double area();

    public abstract double peri();
}

class Rect extends Shape {
    private double length;
    private double width;

    public Rect() {
    }

    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLW(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double area() {
        return getLength() * getWidth();
    }

    public double peri() {
        return 2 * (getLength() + getWidth());
    }
}

class Cub extends Rect {
    private double height;

    public Cub() {
    }

    public Cub(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public void setLWH(double length, double width, double height) {
        super.setLW(length, width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        return 2 * (getLength() * getWidth() + getWidth() * getHeight() + getHeight() * getLength());
    }

    public double peri() {
        return super.peri() * 2 + 4 * height;
    }

    public double vol() {
        return getHeight() * super.area();
    }
}

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Shape shp;
        while (in.hasNextInt()) {
            int flag = in.nextInt();
            if (flag == 1) {
                System.out.println("输入长l和宽w");
                double l = in.nextDouble();
                double w = in.nextDouble();
                shp = new Rect(l, w);
                System.out.println(shp.peri() + " " + shp.area());
            } else if (flag == 2) {
                System.out.println("输入长l、宽w和高h");
                double l = in.nextDouble();
                double w = in.nextDouble();
                double h = in.nextDouble();
                shp = new Cub(l, w, h);
                System.out.println(shp.peri());
            } else {
                break;
            }
        }
    }
}
