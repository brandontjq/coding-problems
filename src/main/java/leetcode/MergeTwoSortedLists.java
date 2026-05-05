package leetcode;

import leetcode.node.ListNode;

public class MergeTwoSortedLists {

    public ListNode dummy (ListNode node) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        ListNode node1 = node;

        while (node1 != null) {
            curr.next = node1;
            node1 = node1.next;
            curr = curr.next;
        }

        ListNode dummyNext = dummy.next;
        return dummyNext;

//        ListNode dummy = new ListNode(-1);
//        dummy.next = node;
//        ListNode dummyNext = dummy.next;
//        return dummyNext;
    }


}
