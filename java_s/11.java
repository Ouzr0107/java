import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int i = 0;
        while (i < x) {
            for (int j = 0; j < i + 1; ++j) {
                System.out.print("*");
            }
            System.out.println();
            ++i;
        }
    }
}
