package easy;

import util.ListNode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        List<Integer> myList = new ArrayList<>();
        while(head != null){
            myList.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = myList.size() - 1;

        while(left<right){
            int leftInt = myList.get(left);
            int rightInt = myList.get(right);
            if(leftInt != rightInt){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}