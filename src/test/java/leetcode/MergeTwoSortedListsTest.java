package leetcode;

import leetcode.node.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    @Test
    void test() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);

        one.next = two;
        two.next = three;

        MergeTwoSortedLists test = new MergeTwoSortedLists();
        test.dummy(one);
        System.out.println("done");
    }
}