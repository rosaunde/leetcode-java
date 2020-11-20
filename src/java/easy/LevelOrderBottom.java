package easy;

import util.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LevelOrderBottom {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        return levelOrderBottom(Collections.singletonList(root), levels);
    }

    public static List<List<Integer>> levelOrderBottom(List<TreeNode> nodes, List<List<Integer>> levels) {
        List<Integer> level = new ArrayList();
        List<TreeNode> nextNodes = new ArrayList();
        boolean hit = false;
        for(int i = 0; i < nodes.size(); i++){
            TreeNode node = nodes.get(i);
            if(node != null){
                level.add(node.val);
                nextNodes.add(node.left);
                nextNodes.add(node.right);
                hit = true;
            }
        }
        if(hit == false){
            return levels;
        }
        else{
            levels.add(0, level);
            return levelOrderBottom(nextNodes, levels);
        }
    }
}