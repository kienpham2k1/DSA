package LinkedListQueue;

import IQueue.IQueue;

public class Queue implements IQueue {
    Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public void enqueue(int data) {
        Node temp = new Node(data);
        if (rear == null) {
            this.rear = this.front = temp;
        }
        this.rear.next = temp;
        this.rear = temp;
    }

    public int dequeue() {
        if (this.front == null) {
            System.out.println("Queue is underflow");
            return Integer.MIN_VALUE;
        }
        Node temp = this.front;
        this.front = this.front.next;

        if (this.front == null) {
            this.rear = null;
        }
        return temp.data;
    }

    public int front() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'front'");
    }

    public int rear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rear'");
    }

    public boolean isFull() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isFull'");
    }

    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    public void display() {
        Node curr = this.front;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

}
