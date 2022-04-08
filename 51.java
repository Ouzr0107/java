import java.util.Scanner;

class Rect {
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
    public double vol() {
        return getHeight() * super.area();
    }
}

public class test {
    public static void main(String[] args) {
        double l, w, h;
        Scanner in = new Scanner(System.in);
        l = in.nextDouble();
        w = in.nextDouble();
        h = in.nextDouble();
        Cub cub1 = new Cub();
        cub1.setLWH(l, w, h);
        System.out.println(cub1.area() + " " + cub1.vol());
        Cub cub2 = new Cub(l, w, h);
        System.out.println(cub2.area() + " " + cub2.vol());
        System.out.println(cub2.peri());
        Rect rc1 = new Rect(l, w);
        System.out.println(rc1.area() + " " + rc1.peri());
    }
}
