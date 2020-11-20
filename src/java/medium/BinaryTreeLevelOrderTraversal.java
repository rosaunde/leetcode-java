package medium;

import util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode> nodes = new ArrayDeque<>();

        nodes.add(root);

        return levelOrder(result, nodes);
    }

    public List<List<Integer>> levelOrder(List<List<Integer>> result, Queue<TreeNode> nodes){
        List<Integer> level = new ArrayList<>();
        int nodesToCheck = nodes.size();
        for(int i = 0; i < nodesToCheck; i++){
            TreeNode node = nodes.remove();
            level.add(node.val);
            if(node.left != null){
                nodes.add(node.left);
            }
            if(node.right != null){
                nodes.add(node.right);
            }
        }
        if(level.size() > 0){
            result.add(level);
            return levelOrder(result, nodes);
        }

        return result;
    }
}