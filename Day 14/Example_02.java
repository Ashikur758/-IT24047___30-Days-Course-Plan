import java.util.*;

public class Example_02 {
    public static void main(String[] args) {

        // HashMap (Fast access, no order)
        HashMap<Integer, String> hmap = new HashMap<>();

        hmap.put(1, "Ashik");
        hmap.put(3, "Rahim");
        hmap.put(2, "Karim");

        System.out.println("HashMap: " + hmap);

        // TreeMap (Sorted order by key)
        TreeMap<Integer, String> tmap = new TreeMap<>();

        tmap.put(1, "Ashik");
        tmap.put(3, "Rahim");
        tmap.put(2, "Karim");

        System.out.println("TreeMap: " + tmap);
    }
}