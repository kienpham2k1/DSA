package BinaryStree;

import java.util.Stack;

public class BinaryTree {
    public Node root;

    public void inorder() {
        if (root == null)
            return;
        Stack<Node> s = new Stack<Node>();
        Node curr = this.root;
        while (curr != null || s.size() > 0) {
            while (curr != null) {
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.print(curr.data + " ");
            curr = curr.right;
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
                while (temp.right != null
                        && temp.right != cur)
                    temp = temp.right;
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
