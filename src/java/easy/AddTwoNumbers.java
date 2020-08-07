package easy;

import easy.util.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ogHead = new ListNode();
        ListNode head = ogHead;
        int carryOver = 0;
        while(l1 != null || l2 != null || carryOver > 0){
            if(l1 != null && l2 != null){
                int value = l1.val + l2.val + carryOver;
                l1 = l1.next;
                l2 = l2.next;
                if(value >= 10){
                    ListNode newNode = new ListNode(value % 10);
                    carryOver = value/=10;
                    head.next = newNode;
                    head = newNode;
                } else{
                    ListNode newNode = new ListNode(value);
                    carryOver = 0;
                    head.next = newNode;
                    head = newNode;
                }
            } else if(l1 != null){
                int value = l1.val + carryOver;
                l1=l1.next;
                if(value >= 10){
                    ListNode newNode = new ListNode(value % 10);
                    carryOver = value/=10;
                    head.next = newNode;
                    head = newNode;
                } else{
                    ListNode newNode = new ListNode(value);
                    carryOver = 0;
                    head.next = newNode;
                    head = newNode;
                }
            } else if(l2 != null){
                int value = l2.val + carryOver;
                l2=l2.next;
                if(value >= 10){
                    ListNode newNode = new ListNode(value % 10);
                    carryOver = value/=10;
                    head.next = newNode;
                    head = newNode;
                } else{
                    ListNode newNode = new ListNode(value);
                    carryOver = 0;
                    head.next = newNode;
                    head = newNode;
                }
            } else{
                ListNode newNode = new ListNode(carryOver);
                carryOver = 0;
                head.next = newNode;
                head = newNode;
            }
        }
        return ogHead.next;
    }
}