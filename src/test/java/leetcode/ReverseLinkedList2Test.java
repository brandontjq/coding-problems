package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedList2Test {
    @Test
    void test() {
        ReverseLinkedList2 reverseLinkedList2 = new ReverseLinkedList2();
        ReverseLinkedList2.ListNode head1 = new ReverseLinkedList2.ListNode(1);
        ReverseLinkedList2.ListNode head2 = new ReverseLinkedList2.ListNode(2);
        ReverseLinkedList2.ListNode head3 = new ReverseLinkedList2.ListNode(3);
        ReverseLinkedList2.ListNode head4 = new ReverseLinkedList2.ListNode(4);
        ReverseLinkedList2.ListNode head5 = new ReverseLinkedList2.ListNode(5);
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
//        ReverseLinkedList2.ListNode head3 = new ReverseLinkedList2.ListNode(3);
//        ReverseLinkedList2.ListNode head5 = new ReverseLinkedList2.ListNode(5);
//        head3.next = head5;

        reverseLinkedList2.reverseBetween(head1, 3, 4);
    }

    @Test
    void anotherTest() {
        ReverseLinkedList2 reverseLinkedList2 = new ReverseLinkedList2();
        ReverseLinkedList2.ListNode head1 = new ReverseLinkedList2.ListNode(1);
        ReverseLinkedList2.ListNode head2 = new ReverseLinkedList2.ListNode(2);
        ReverseLinkedList2.ListNode head3 = new ReverseLinkedList2.ListNode(3);
        ReverseLinkedList2.ListNode head4 = new ReverseLinkedList2.ListNode(4);
        ReverseLinkedList2.ListNode head5 = new ReverseLinkedList2.ListNode(5);
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        reverseLinkedList2.oddEvenList(head1);
    }
}