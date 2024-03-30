
public class Main {

    public static void main(String[] args) {
        // Creating a sample tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("Element and Height of each node:");
        printElementAndHeight(root);




    }
    static class TreeNode {
        int val;
        TreeNode left, right, parent; // Adding the parent field

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
            this.parent = null; // Initializing parent to null
        }
    }

    public static void printElementAndHeight(TreeNode root) {
        if (root == null)
            return;

        postOrderTraversal(root);
    }

    private static int postOrderTraversal(TreeNode node) {
        if (node == null)
            return -1; // Height of null node is -1

        int leftHeight = postOrderTraversal(node.left); // Recursively compute height of left subtree
        int rightHeight = postOrderTraversal(node.right); // Recursively compute height of right subtree

        int height = Math.max(leftHeight, rightHeight) + 1; // Height of current node is 1 + maximum height of its subtrees

        System.out.println("E: " + node.val + ", H: " + height); // Print element and height of current node

        return height; // Return height of current node to parent node





    }
}
