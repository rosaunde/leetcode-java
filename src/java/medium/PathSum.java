package medium;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSum {

    List<List<Integer>> paths = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        searchTree(root, new ArrayList<>(), 0, sum);
        return paths;
    }

    public void searchTree(TreeNode root, List<Integer> path, int currentValue, int sum){
        if(root == null){
            return;
        }
        path.add(root.val);
        currentValue = currentValue + root.val;
        if(root.left == null && root.right == null && currentValue == sum){
            paths.add(new ArrayList<>(path));
        }
        searchTree(root.left, path, currentValue, sum);
        searchTree(root.right, path, currentValue, sum);
        path.remove(path.size()-1);
    }
}