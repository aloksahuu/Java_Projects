package com.list.LQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // 1. add() - adds element to the queue (throws exception if full)
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Mango");

        // 2. offer() - adds element to the queue (returns false if fails)
        queue.offer("Orange");

        System.out.println("Queue after add/offer: " + queue);

        // 3. peek() - retrieves but does not remove the head
        System.out.println("Peek: " + queue.peek());

        // 4. element() - same as peek(), but throws exception if empty
        System.out.println("Element: " + queue.element());

        // 5. poll() - retrieves and removes the head
        System.out.println("Poll: " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        // 6. remove() - retrieves and removes head, throws exception if empty
        System.out.println("Remove: " + queue.remove());
        System.out.println("Queue after remove: " + queue);

        // 7. size()
        System.out.println("Queue size: " + queue.size());

        // 8. isEmpty()
        System.out.println("Is queue empty? " + queue.isEmpty());

        // 9. contains()
        System.out.println("Contains 'Mango'? " + queue.contains("Mango"));

        // 10. clear()
        queue.clear();
        System.out.println("Queue after clear: " + queue);
    }
}

