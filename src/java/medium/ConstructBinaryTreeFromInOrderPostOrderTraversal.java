package medium;

import util.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromInOrderPostOrderTraversal {
    private Map<Integer,Integer> inMap;
    private int pos;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        inMap = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            inMap.put(inorder[i], i);
        }
        pos = postorder.length-1;
        return build(postorder, 0, postorder.length -1);
    }

    private TreeNode build(int[] postorder, int start, int end){
        if(start>end){
            return null;
        }
        int value = postorder[pos];
        pos--;
        TreeNode root = new TreeNode(value);

        if(start == end){
            return root;
        }
        int inIndex = inMap.get(value);

        root.right = build(postorder, inIndex+1, end);
        root.left = build(postorder, start, inIndex-1);

        return root;
    }
}