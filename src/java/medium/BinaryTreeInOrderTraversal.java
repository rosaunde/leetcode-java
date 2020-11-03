package medium;

import easy.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

class BinaryTreeInOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        if(root != null){
            inOrderTraversal(root, nodes);
        }
        return nodes;
    }

    public void inOrderTraversal(TreeNode root, List<Integer> nodes) {
        if(root.left != null){
            inOrderTraversal(root.left, nodes);
        }
        nodes.add(root.val);
        if(root.right != null){
            inOrderTraversal(root.right, nodes);
        }

    }
}