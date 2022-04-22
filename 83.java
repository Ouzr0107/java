import java.util.logging.Logger;

public class test {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i < 101; ++i) {
            result += i;
        }
        System.out.println(result);
        Logger.getGlobal().info("您执行了从1加到100的操作，结果是：" + result);
    }
}