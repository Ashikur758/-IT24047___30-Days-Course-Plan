import java.util.*;

public class Example_02 {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(50);
        queue.add(10);
        queue.add(30);

        System.out.println("Queue: " + queue);

        queue.poll();

        System.out.println("After Dequeue: " + queue);

        System.out.println("Front: " + queue.peek());
    }
}