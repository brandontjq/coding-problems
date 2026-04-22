package leetcode;

import leetcode.node.ListNode;

public class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        ListNode newCurrent = head;
        for (int i = 0; i < count /2; i++) {
            newCurrent = newCurrent.next;
            System.out.println(newCurrent);
        }
        return newCurrent;
    }
}
