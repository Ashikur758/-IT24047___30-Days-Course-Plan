import java.util.*;

public class Example_01 {
    public static void main(String[] args) {

        // List (allows duplicates, maintains order)
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");

        System.out.println("List Output: " + list);

        // Set (no duplicates, unordered)
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");

        System.out.println("Set Output: " + set);
    }
}