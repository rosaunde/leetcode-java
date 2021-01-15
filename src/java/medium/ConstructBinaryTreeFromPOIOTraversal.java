package medium;

import util.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPOIOTraversal {
    private Map<Integer,Integer> inMap = new HashMap<>();
    private int pIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0){
            return null;
        }

        for(int i = 0; i < inorder.length; i++){
            inMap.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length -1);
    }
    public TreeNode build(int[] pre, int start, int end){
        if(start > end){
            return null;
        }
        TreeNode root = new TreeNode(pre[pIndex]);
        pIndex++;

        int inOrderIndex = inMap.get(root.val);

        if(start == end){
            return root;
        }

        root.left = build(pre, start, inOrderIndex-1);
        root.right = build(pre, inOrderIndex+1, end);
        return root;
    }
}