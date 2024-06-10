package BinaryStree;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTree {
    public Node root;

    public void inorder() {
        if (root == null)
            return;
        Node cur = root;
        Stack<Node> s = new Stack<>();
        while (cur != null || s.size() > 0) {
            while (cur != null) {
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            System.out.print(cur.data + " ");
            cur = cur.right;

        }
    }

    public void morrisInorder() {
        Node cur = this.root;
        while (cur != null) {
            if (cur.left == null) {
                System.out.print(cur.data + " ");
                cur = cur.right;
            } else {
                Node temp = cur.left;
                while (temp.right != null && temp.right != cur) {
                    temp = temp.right;
                }
                if (temp.right == null) {
                    temp.right = cur;
                    cur = cur.left;
                } else {
                    temp.right = null;
                    System.out.print(cur.data + " ");
                    cur = cur.right;
                }
            }
        }
    }

    public ArrayList<Integer> inOrderTrav() {
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Node> s = new Stack<>();
        if (this.root == null)
            return null;
        Node cur = this.root;
        while (true) {
            if (cur != null) {
                s.push(cur);
                cur = cur.left;
            } else {
                if (s.isEmpty())
                    break;
                cur = s.peek();
                arr.add(cur.data);
                cur = s.pop();
                cur = cur.right;
            }

        }
        return arr;
    }

}
