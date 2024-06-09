package IQueue;

public interface IQueue {
    public void enqueue(int data);

    public int dequeue();

    public int front();

    public int rear();

    public boolean isFull();

    public boolean isEmpty();
}
