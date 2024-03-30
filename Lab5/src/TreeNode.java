/**
 * SN: 301001692
 * Name: Jared Manalo
 * Course: COMP 228
 * Section: 015
 * Username: moksi
 * Date: 2024-03-27
 */
public class TreeNode {

    public int data;
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
    }

    // Optional constructor with parent reference
    public TreeNode(int data, TreeNode parent) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = parent;
    }
}
