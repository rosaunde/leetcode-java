package easy;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    List<String> paths = new ArrayList<>();
    private static final String SPACER = "->";

    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            return paths;
        }
        binaryTreePaths(root, String.valueOf(root.val));
        return paths;
    }

    private void binaryTreePaths(TreeNode node, String path){
        if(node.left == null && node.right == null){
            paths.add(path);
        } else {
            path = path + SPACER;
            if(node.left != null){
                binaryTreePaths(node.left, path + node.left.val);
            }
            if(node.right != null){
                binaryTreePaths(node.right, path + node.right.val);
            }
        }
    }
}