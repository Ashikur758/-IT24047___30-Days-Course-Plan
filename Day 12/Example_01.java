import java.util.*;

public class Example_01 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // duplicate
        set.add("Orange");

        System.out.println("HashSet Output: " + set);
    }
}