package ArrayQueue;

import IQueue.IQueue;

public class Queue implements IQueue {
    private int front, rear, size;
    int capacity;
    int array[];

    public Queue(int capacity) {
        this.capacity = capacity;
        this.front = this.size = 0;
        this.rear = capacity - 1;
        this.array = new int[this.capacity];
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is overflow");
            return;
        } else {
            this.rear = (rear + 1) % this.capacity;
            this.array[rear] = data;
            this.size = this.size + 1;
            System.out.println(data + "added to queue");
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is underflow");
            return 0;
        } else {
            int item = this.array[this.front];
            this.front = (this.front + 1) % capacity;
            this.size = this.size - 1;
            return item;
        }
    }

    public int front() {
        if (isEmpty())
            return Integer.MIN_VALUE;
        else
            return array[this.front];
    }

    public int rear() {
        if (isEmpty())
            return Integer.MIN_VALUE;
        else
            return this.array[this.rear];
    }

    public boolean isFull() {
        return this.size == this.capacity;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void display() {
        for (int i = front; i <= size; i++) {
            System.out.println(array[i]);
        }
    }
}
