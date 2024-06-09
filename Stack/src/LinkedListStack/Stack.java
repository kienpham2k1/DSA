package LinkedListStack;

import Interface.IStack;

public class Stack implements IStack {
    StackNode root;

    public boolean isEmpty() {
        return root == null;
    }

    public boolean push(int data) {
        StackNode newNode = new StackNode(data);
        if (root == null)
            root = newNode;
        else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack.");
        return true;
    }

    public int pop() {
        int popped = Integer.MIN_VALUE;
        if (root == null)
            System.out.println("Stack is underflow.");
        else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }

    public int peek() {
        if (root == null) {
            System.out.println("Stack is underflow");
            return Integer.MIN_VALUE;
        } else {
            return root.data;
        }
    }

    public void display() {
        StackNode cur = root;
        String line = "--------------------------------";
        System.out.println(line);
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
        System.out.println(line);
    }
}
