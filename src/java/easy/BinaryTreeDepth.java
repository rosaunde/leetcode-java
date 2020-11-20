package easy;

import util.TreeNode;

public class BinaryTreeDepth {
    public static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        return Math.max(1+ maxDepth(root.left), 1 + maxDepth(root.right));
    }
}