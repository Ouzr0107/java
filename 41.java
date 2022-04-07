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

}

public class test {
    public static void main(String[] args) {
        Student st1 = new Student("s001", "孙悟空", 500, 40);
        System.out.println("学号：" + st1.getNum());
        System.out.println("姓名：" + st1.getSname());
        System.out.println("年龄：" + st1.getSage());
        System.out.println("班级总人数：" + st1.getTotal());
        Student st2 = new Student("s002", "唐僧", 50, 35);
        System.out.println("学号：" + st2.getNum());
        System.out.println("姓名：" + st2.getSname());
        System.out.println("年龄：" + st2.getSage());
        System.out.println("班级总人数：" + st2.getTotal());
        System.out.println("学号：" + st1.getNum());
        System.out.println("姓名：" + st1.getSname());
        System.out.println("年龄：" + st1.getSage());
        System.out.println("班级总人数：" + st1.getTotal());
        System.out.println("班级总人数：" + Student.getTotal());
    }
}
