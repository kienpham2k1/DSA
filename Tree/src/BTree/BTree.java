package BTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import ITree.ITree;
import Node.Node;

public class BTree implements ITree {
    public Node root;

    public Node insert(int data) {
        if (this.root == null) {
            this.root = new Node(data);
            return root;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {

        }
        return null;
    }

    public void deletDeepest(Node d_node) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletDeepest'");
    }

    public Node delettion(int key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delettion'");
    }

    public void preorderTraversal(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);

    }

    public void inorderTraversal(Node root) {
        if (root == null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);

    }

    public void postorderTraversal(Node root) {
        if (root == null)
            return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public void levelorderTraversal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'levelorderTraversal'");
    }

}
