package leetcode;

import org.junit.jupiter.api.Test;
import leetcode.ReverseLinkedList2.ListNode;
import static org.junit.jupiter.api.Assertions.*;

class ReorderListTest {

    @Test
    void test() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ReorderList reorderList = new ReorderList();
        reorderList.reorderList(node1);

    }

}