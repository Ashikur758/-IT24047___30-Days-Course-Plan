import java.util.*;

public class Example_01 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("ArrayList: " + list);

        // Access by index
        System.out.println("Element at index 1: " + list.get(1));

        // Remove element
        list.remove("Python");

        System.out.println("After removal: " + list);
    }
}