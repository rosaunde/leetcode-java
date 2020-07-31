package easy;

import easy.util.ListNode;

import java.util.HashSet;
import java.util.Set;

public class GetIntersectionNodeInLinkedList {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<ListNode>();

        if(headA == null || headB == null){
            return null;
        }
        if(headA == headB){
            return headA;
        }

        while(!(headA == null && headB == null)){
            if(set.contains(headA)){
                return headA;
            }else{
                if(headA != null){
                    set.add(headA);
                    headA = headA.next;
                }
            }
            if(set.contains(headB)){
                return headB;
            }else{
                if(headB != null){
                    set.add(headB);
                    headB = headB.next;
                }
            }

        }
        return null;
    }
}