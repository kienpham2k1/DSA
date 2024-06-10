import BTree.BTree;
import BinaryStree.BinaryTree;
import Node.Node;

public class App {
    public static void main(String[] args) throws Exception {
        BTree tree = new BTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        // tree.inorderTraversal();
        tree.postorderTraversal(tree.root);
    }
}
/**
 * ----1
 * ---/ \
 * --2---3
 * -/ \
 * 4---5
 */