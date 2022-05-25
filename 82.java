class MyException extends Exception {
    public MyException() {
    }

    public MyException(String Message) {
        super(Message);
    }
}

class abaaba {
    int Multiply(int n, int m) throws MyException {
        int re;
        re = n * m;
        if (re > 1000) throw new MyException("结果re=" + re + "超过了" + 1000);
        return re;
    }
}

public class test {
    public static void main(String[] args) {
        abaaba i = new abaaba();
        try {
            i.Multiply(100, 100);
        } catch (MyException e) {
            System.out.println();
            System.out.println(e);
        }
    }
}