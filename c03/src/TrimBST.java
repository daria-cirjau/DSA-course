import utils.TreeNode;

public class TrimBST {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }

        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);

        if (root.val >= low && root.val <= high) {
            return root;
        }

        if (root.val < low) {
            return root.right;
        }
        return root.left;
    }
}
