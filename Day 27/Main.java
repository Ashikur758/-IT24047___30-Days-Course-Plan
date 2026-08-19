import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Ashik");
        queue.add("Rahim");
        queue.add("Karim");

        System.out.println(queue);

        System.out.println("Removed: " + queue.poll());

        System.out.println("Front: " + queue.peek());
    }
}