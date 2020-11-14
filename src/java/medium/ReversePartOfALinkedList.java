package medium;

import util.ListNode;

class ReversePartOfALinkedList {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(n-m == 0){
            return head;
        }
        ListNode firstNode = head;
        ListNode prev = null;
        for(int i = 1; i < m; i++){
            prev = head;
            head = head.next;
        }
        ListNode nodeBefore = prev;
        ListNode startNode = head;
        prev = head;
        head = head.next;
        ListNode next = head.next;
        ListNode endNode;
        for(int i = 0; i < (n-m); i++){
            head.next = prev;
            prev = head;
            head = next;
            if(next != null){
                next = next.next;
            }
        }
        startNode.next = head;
        if(nodeBefore != null){
            nodeBefore.next = prev;
        }
        if(m > 1){
            return firstNode;
        } else{
            return prev;
        }
    }
}