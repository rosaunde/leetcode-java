package easy;

import util.ListNode;

public class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        while(head != null){
            if(head.val == val){
                prev.next = head.next;
                head = head.next;
            } else{
                prev = head;
                head = head.next;
            }
        }
        return dummy.next;

    }
}