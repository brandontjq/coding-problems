package leetcode;

import org.junit.jupiter.api.Test;
import leetcode.ReverseLinkedList2.ListNode;
import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndOfListTest {
    @Test
    void test() {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head1, 2);
        System.out.println(result);

    }
}