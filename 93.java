import java.util.*;

class CollectionTest {
    private class Student {
        String num;
        String name;
        int age;

        public Student() {
        }

        public Student(String num, String name, int age) {
            this.num = num;
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return this.num + " " + this.name + " " + this.age;
        }
    }

    public CollectionTest() {
        Map<String, Student> stu = new HashMap<>();
        stu.put("15H002", new Student("15H002", "孙悟空", 2000));
        stu.put("15H001", new Student("15H001", "唐僧", 40));
        stu.put("15H003", new Student("15H003", "猪八戒", 1000));
        if (stu.containsKey("15H003")) {
            System.out.println(stu.get("15H003").num + " " + stu.get("15H003").name + " " + stu.get("15H003").age);
        } else {
            System.out.println("15H003不存在");
        }
        if (stu.containsKey("15H004")) {
            System.out.println(stu.get("15H004").num + " " + stu.get("15H004").name + " " + stu.get("15H004").age);
        } else {
            System.out.println("15H004不存在");
        }
        for (Map.Entry<String, Student> entry : stu.entrySet()) {
            String key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(key + " " + value.name + " " + value.age);
        }
        stu.remove("15H001");
        Object[] values = stu.values().toArray();
        for (int i = 0; i < values.length; ++i) {
            System.out.println(values[i].toString());
        }
    }
}

public class test {
    public static void main(String[] args) {
        new CollectionTest();
    }
}