import java.util.*;

public class Example_02 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Ashik");
        map.put(102, "Rahim");
        map.put(103, "Karim");

        System.out.println("Map Output: " + map);

        // Access value using key
        System.out.println("Value for 102: " + map.get(102));
    }
}