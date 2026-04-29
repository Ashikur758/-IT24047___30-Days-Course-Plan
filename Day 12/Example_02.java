import java.util.*;

public class Example_02 {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(20);
        set.add(40);
        set.add(10);
        set.add(20); // duplicate

        System.out.println("TreeSet Output: " + set);
    }
}