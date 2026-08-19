import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Ashik");
        students.put(2, "Rahim");
        students.put(3, "Karim");

        System.out.println(students);

        System.out.println(students.get(2));
    }
}