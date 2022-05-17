import java.util.Scanner;


class Course {
    private String num;
    private String name;
    private double score;

    public Course() {
    }

    public Course(String num, String name, double score) {
        this.num = num;
        this.name = name;
        this.score = score;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public double time() {
        return score * 16;
    }
}

public class Testcourse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Course course = new Course(in.next(), in.next(), in.nextDouble());
        System.out.println("�γ̱�ţ�" + course.getNum());
        System.out.println("�γ����ƣ�" + course.getName());
        System.out.println("�γ�ѧ�֣�" + course.getScore());
        System.out.println("�γ�ѧʱ����" + course.time());
    }
}
