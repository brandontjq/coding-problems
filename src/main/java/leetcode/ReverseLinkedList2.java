package leetcode;

public class ReverseLinkedList2 {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode current = head;
        int count = 1;
        ListNode nodeBeforeReversedHead = null;
        ListNode reversedHead = null;
        ListNode remainingNode = null;
        while(current != null) {
            if(left == 1 || count == left - 1) {
                nodeBeforeReversedHead = current;
            }
            if(count == left) {
                reversedHead = current;
            }
            if(count == right + 1) {
                remainingNode = current;
                break;
            }
            current = current.next;
            count++;

        }

        int difference = right - left;
        ListNode prev = remainingNode;
        while(reversedHead != null && difference >= 0) {
            ListNode next = reversedHead.next;
            reversedHead.next = prev;
            prev = reversedHead;
            reversedHead = next;
            difference--;
        }

        reversedHead = prev;
        if(left == 1) {
            return reversedHead;
        }
        nodeBeforeReversedHead.next = reversedHead;
        ListNode result = head;
        return result;

    }

    public ListNode oddEvenList(ListNode head) {
        if (head != null) {

            ListNode odd = head, even = head.next, evenHead = even;

            while (even != null && even.next != null) {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
        }
        return head;
    }
}
