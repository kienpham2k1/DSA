package ITree;

import Node.Node;

public interface ITree {

    /*
     * Insertion
     * Traversal
     * Deletion
     * Searching
     */

    /*
     * Function to insert nodes
     */
    public Node insert(int data);

    /*
     * function to delete the given deepest node
     * (d_node) in binary tree
     */
    public void deletDeepest(Node d_node);

    /*
     * function to delete element in binary tree
     */
    public Node delettion(int key);

    /*
     * Preorder tree traversal (Root - Left - Right)
     */
    public void preorderTraversal(Node root);
    /*
     * inorder tree traversal (Left - Root - Right)
     */

    public void inorderTraversal(Node root);
    /*
     * Postorder tree traversal (Left - Right - Root)
     */

    public void postorderTraversal(Node root);

    /*
     * Function for Level order tree traversal
     */
    public void levelorderTraversal();
}
