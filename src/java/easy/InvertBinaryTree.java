package easy;

import easy.util.TreeNode;

public class InvertBinaryTree {
    public static TreeNode invertTree(TreeNode root) {
        if(root == null || (root.right == null && root.left == null)){
            return root;
        }
        if(root.right == null){
            root.right = invertTree(root.left);
            root.left = null;
            return root;
        } else if(root.left == null){
            root.left = invertTree(root.right);
            root.right = null;
            return root;
        } else{
            TreeNode temp = root.right;
            root.right = invertTree(root.left);
            root.left = invertTree(temp);
            return root;
        }
    }
}