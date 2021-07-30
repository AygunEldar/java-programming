package day63_collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

       // Queue<String> queue = new PriorityQueue<>();
        Queue<String> queue = new ArrayDeque<>();
        queue.add("four");
        queue.add("three");
        queue.add("one");
        queue.add("two");
        queue.add("five");

        System.out.println(queue.element());//if noSuchElementException
        System.out.println(queue.peek()); // if null
        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue);

    }
}
