public class test {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println();
            System.out.println("��Ŷ������Ϊ��");
            System.out.println(e);
        }
    }
}