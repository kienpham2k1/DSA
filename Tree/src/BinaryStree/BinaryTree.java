package BanaryStree;

import java.util.Stack;

public class BinaryTree {
    public Node root;

    void inoder() {
        if (root == null) {
            return;
        }
        Stack<Node> s = new Stack<Node>();
        Node curr = this.root;
        while (curr != null && s.size() > 0) {
            s.push(curr);
            curr = curr.left;
        }
        curr = s.pop();
        System.out.println(curr);
        curr = curr.right;
    }

}
