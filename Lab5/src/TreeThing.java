public class TreeThing {
    public static void main(String[] args) {
        // Create a binary tree
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node1.parent = root;
        node2.parent = root;

        node1.left = node3;
        node1.right = node4;
        node3.parent = node1;
        node4.parent = node1;

        node2.left = node5;
        node2.right = node6;
        node5.parent = node2;
        node6.parent = node2;


    }
}
