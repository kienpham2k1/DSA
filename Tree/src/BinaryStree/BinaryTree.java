package BinaryStree;

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

}
