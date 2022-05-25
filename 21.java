import java.math.BigInteger;

public class test {
    public static void main(String[] args) {
        final int MAX_PER_CLASS = 40;
        System.out.println(MAX_PER_CLASS);
        float a = 18.888f;
        System.out.println((int) a);
        BigInteger b = new BigInteger("12345678901234567890");
        b = b.multiply(new BigInteger("123"));
        System.out.println(b);
    }
}