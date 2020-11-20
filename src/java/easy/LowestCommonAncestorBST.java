package easy;

import util.TreeNode;

public class LowestCommonAncestorBST {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || (root.left == null && root.right == null) || root.val == p.val || root.val == q.val){
            return root;
        } else if((root.val > p.val) && (root.val < q.val)){
            return root;
        } else if((root.val < p.val) && (root.val > q.val)){
            return root;
        } else if(q.val > root.val && p.val > root.val){
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return lowestCommonAncestor(root.left, p, q);
        }
    }
}