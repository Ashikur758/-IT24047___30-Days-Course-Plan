import java.util.*;

public class Example_01 {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue);

        queue.remove();

        System.out.println("After Dequeue: " + queue);

        System.out.println("Front Element: " + queue.peek());
    }
}