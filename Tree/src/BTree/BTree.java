package BTree;

import java.util.Stack;

import BinaryStree.Node;
import ITree.ITree;

public class BTree implements ITree {
    public Node root;

    public Node insert(int data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    public void deletDeepest(Node d_node) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletDeepest'");
    }

    public Node delettion(int key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delettion'");
    }

    public void preorderTraversal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'preorderTraversal'");
    }

    public void inorderTraversal() {
        if (this.root == null) {
            System.out.println("Tree is empty");
            return;
        }
        Node cur = this.root;
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

    public void postorderTraversal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postorderTraversal'");
    }

    public void levelorderTraversal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'levelorderTraversal'");
    }

}
