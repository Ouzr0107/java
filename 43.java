class Student {
    private String num = "s000";
    private String sname = "����˭";
    private int sage = 22;
    private static int total = 40;

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
        Student st1 = new Student("s001", "�����", 500, 40);
        Student st2 = new Student("s002", "��ɮ", 50, 35);
        Student st3 = new Student();
        System.out.println("ѧ�ţ�" + st3.getNum());
        System.out.println("������" + st3.getSname());
        System.out.println("���䣺" + st3.getSage());
        System.out.println("�༶��������" + Student.getTotal());
    }
}
