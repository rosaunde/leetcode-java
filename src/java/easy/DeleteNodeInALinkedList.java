package easy;

import easy.util.ListNode;

public class DeleteNodeInALinkedList {
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}