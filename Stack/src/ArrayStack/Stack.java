package ArrayStack;

import Interface.IStack;

public class Stack implements IStack {
    int size;
    int top;
    int stack[];

    public Stack() {
        this(5);
    }

    public Stack(int size) {
        size = 5;
        top = -1;
        this.stack = new int[size];
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean push(int data) {
        if (top == size - 1) {
            System.out.println("Stack is overflow");
            return false;
        } else {
            stack[++top] = data;
            System.out.println(data + " pushed to stack");
            return true;
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack is unerflow");
            return 0;
        } else {
            int x = stack[top--];
            return x;
        }
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is underflow");
            return 0;
        } else {
            int x = stack[top];
            return x;
        }
    }

    protected boolean grow() {
        int size1 = size + size / 2;
        int[] stack1 = new int[size1];
        if (stack1 == null) {
            return (false);
        }
        for (int i = 0; i <= top; i++)
            stack1[i] = stack[i];
        stack = stack1;
        return (true);
    }

    public void display() {
        String line = "--------------------------------";
        System.out.println(line);
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
        System.out.println(line);
    }
}
