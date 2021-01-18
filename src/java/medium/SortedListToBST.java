package medium;

import util.ListNode;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> valueList = new ArrayList<>();
        while(head != null){
            valueList.add(head.val);
            head = head.next;
        }
        return arrayListToBST(valueList, 0, valueList.size()-1);
    }

    private TreeNode arrayListToBST(List<Integer> values, int start, int end){
        if(start > end){
            return null;
        }
        int mid = (end + start) / 2;
        TreeNode root = new TreeNode(values.get(mid));
        if(start == end){
            return root;
        }

        root.left = arrayListToBST(values, start, mid-1);
        root.right = arrayListToBST(values, mid+1, end);
        return root;
    }
}