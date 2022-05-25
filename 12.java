import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d > 0) {
            System.out.println((-b + Math.sqrt(d)) / (2 * a));
            System.out.println((-b - Math.sqrt(d)) / (2 * a));
        } else if (d == 0) {
            System.out.println(-b / (2 * a));
        } else {
            System.out.println("没有实数根");
        }
    }
}
