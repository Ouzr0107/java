import java.util.Scanner;

interface ShapeCalc {
    abstract double area();

    abstract double peri();
}

class Rect implements ShapeCalc, Cloneable {
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

    public Rect clone() {
        Rect rc = null;
        try {
            rc = (Rect) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return rc;
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
        System.out.println(" ‰»Î≥§∫ÕøÌ");
        ShapeCalc rc = new Rect(in.nextDouble(), in.nextDouble());
        System.out.println(rc.peri() + " " + rc.area());
        Rect newrc = ((Rect) rc).clone();
        System.out.println(newrc.peri() + " " + newrc.area());
    }
}
