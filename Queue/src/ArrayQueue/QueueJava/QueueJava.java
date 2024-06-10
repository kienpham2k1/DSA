package ArrayQueue.QueueJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueJava {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(5);
        q.add(7);
        q.add(2);
        System.out.println("Queue: " + q);
        System.out.println("Poll queue: " + q.poll());
        System.out.println("Queue: " + q);
    }
}
