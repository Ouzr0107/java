class Student {
    private String num;
    private String sname;
    private int sage;
    private static int total = 0;

    public Student() {
    }

    public Student(String num, String sname, int sage, int total) {
        this.num = num;
        this.sname = sname;
        this.sage = sage;
        Student.total = total;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public int getSage() {
        return sage;
    }

    public static int getTotal() {
        return total;
    }

    public String getSname() {
        return sname;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public static void setTotal(int total) {
        Student.total = total;
    }

    public void changeValue(int age) {
        age = 111;
    }

    public void changeValue(Student s) {
        s.sage = 222;
    }
}

public class test {
    public static void main(String[] args) {
        int newAge = 20;
        Student st1 = new Student("s001", "ËïÎò¿Õ", 500, 40);
        st1.changeValue(newAge);
        System.out.println(newAge);
        Student st2 = new Student("s002", "ÌÆÉ®", 50, 35);
        st1.changeValue(st2);
        System.out.println(st2.getSage());
    }
}
