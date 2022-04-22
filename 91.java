import java.util.*;

class CollectionTest {
    public CollectionTest() {
        ArrayList<String> list = new ArrayList<>();
        list.add("James");
        list.add("Tom");
        list.add("Steven");
        list.add("Alice");
        for (int i = 0; i < list.size(); ++i) {
            System.out.println(list.get(i) + " ");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String e = (String) it.next();
            System.out.println(e + " ");
            if (it.next() == "Tom") {
                it.remove();
            }
        }
        Collections.sort(list);
        for (String i : list) {
            System.out.println(i + " ");
        }
    }
}

public class test {
    public static void main(String[] args) {
        new CollectionTest();
    }
}