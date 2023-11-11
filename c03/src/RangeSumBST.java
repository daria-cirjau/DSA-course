import utils.TreeNode;

public class RangeSumBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        int left = root.val >= low ? rangeSumBST(root.left, low, high): 0;
        int right = root.val <= high ? rangeSumBST(root.right, low, high): 0;

        int sum = left + right;

        if (root.val <= high && root.val >= low) {
            return sum + root.val;
        }
        return sum;
    }
}

