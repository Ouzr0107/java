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
        Student st1 = new Student("s001", "�����", 500, 40);
        System.out.println("ѧ�ţ�" + st1.getNum());
        System.out.println("������" + st1.getSname());
        System.out.println("���䣺" + st1.getSage());
        System.out.println("�༶��������" + st1.getTotal());
        Student st2 = new Student("s002", "��ɮ", 50, 35);
        System.out.println("ѧ�ţ�" + st2.getNum());
        System.out.println("������" + st2.getSname());
        System.out.println("���䣺" + st2.getSage());
        System.out.println("�༶��������" + st2.getTotal());
        System.out.println("ѧ�ţ�" + st1.getNum());
        System.out.println("������" + st1.getSname());
        System.out.println("���䣺" + st1.getSage());
        System.out.println("�༶��������" + st1.getTotal());
        System.out.println("�༶��������" + Student.getTotal());
    }
}
