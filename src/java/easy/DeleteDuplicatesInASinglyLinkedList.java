package easy;

import easy.util.ListNode;

public class DeleteDuplicatesInASinglyLinkedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode og = head;

        while(head.next != null){
            if(head.val == head.next.val){
                head.next = head.next.next;
            } else{
                head = head.next;
            }
        }
        return og;
    }
}