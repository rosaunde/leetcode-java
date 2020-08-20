package medium;

import easy.util.ListNode;

import java.util.HashMap;
import java.util.Map;

public class RemoveNthNodeFromTheEndOfAList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        Map<Integer, ListNode> nodesByIndex = new HashMap<>();
        ListNode fakeHead = new ListNode(0, head);
        int index = 1;
        while(head != null){
            nodesByIndex.put(index, head);
            index++;
            head=head.next;
        }
        ListNode toBeRemoved = nodesByIndex.get(index - n);
        ListNode before = nodesByIndex.get((index - n) - 1);

        if(before == null){
            fakeHead = fakeHead.next;
        } else{
            before.next = toBeRemoved.next;
        }
        return fakeHead.next;
    }
}