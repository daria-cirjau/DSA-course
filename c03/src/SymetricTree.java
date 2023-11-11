import utils.TreeNode;

public class SymetricTree {
    private boolean isSymetricH(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isSymetricH(p.left, q.right) && isSymetricH(p.right, q.left);
    }
}
