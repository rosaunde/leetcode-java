package medium;

import easy.util.ListNode;

class LinkedListSwapPairs {
    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0, head.next);
        ListNode trailing = dummy;
        ListNode temp = head.next;
        trailing.next = temp;
        head.next = temp.next;
        temp.next = head;
        trailing = head;
        head = head.next;
        while(head != null){
            if(head.next == null){
                break;
            }
            temp = head.next;
            trailing.next = temp;
            head.next = temp.next;
            temp.next = head;
            trailing = head;
            head = head.next;
        }
        return dummy.next;
    }
}