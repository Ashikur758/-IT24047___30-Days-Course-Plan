import java.util.*;

public class Example_02 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");

        System.out.println("LinkedList: " + list);

        // Add at first position
        list.addFirst("Yellow");

        // Remove last element
        list.removeLast();

        System.out.println("After operations: " + list);
    }
}