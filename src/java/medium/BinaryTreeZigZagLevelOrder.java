package medium;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

class BinaryTreeZigZagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        List<List<Integer>> results = new ArrayList<>();
        if(root == null){
            return results;
        }
        return zigzagLevelOrder(nodes, results, true);
    }

    public List<List<Integer>> zigzagLevelOrder(List<TreeNode> nodes, List<List<Integer>> results, boolean left) {
        if(nodes.size() == 0){
            return results;
        }
        List<Integer> level = new ArrayList<>();
        List<TreeNode> nextNodes = new ArrayList<>();
        if(left){
            populateLeft(nodes, level, nextNodes);
        } else{
            populateRight(nodes, level, nextNodes);
        }
        results.add(level);
        return zigzagLevelOrder(nextNodes, results, !left);
    }

    public void populateLeft(List<TreeNode> nodes, List<Integer> level, List<TreeNode> nextNodes){
        for(int i = 0; i < nodes.size(); i++){
            TreeNode node = nodes.get(i);
            level.add(node.val);
            if(node.left != null){
                nextNodes.add(node.left);
            }
            if(node.right != null){
                nextNodes.add(node.right);
            }
        }
    }

    public void populateRight(List<TreeNode> nodes, List<Integer> level, List<TreeNode> nextNodes){
        for(int i = nodes.size()-1; i>=0; i--){
            TreeNode node = nodes.get(i);
            level.add(node.val);
            if(node.right != null){
                nextNodes.add(0,node.right);
            }
            if(node.left != null){
                nextNodes.add(0,node.left);
            }
        }
    }
}