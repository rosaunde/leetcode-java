package medium;

import util.TreeNode;

public class FlattenBinaryTree {
    private TreeNode endNode;
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        flattenTree(root);
    }

    public TreeNode flattenTree(TreeNode root) {
        if(root == null){
            return null;
        }
        endNode = root;
        TreeNode temp = root.right;
        root.right = flattenTree(root.left);
        root.left = null;
        endNode.right = flattenTree(temp);
        return root;
    }
}