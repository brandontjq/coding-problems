package datastructures.linkedlist;

public class LinkedListExample {

    public Link testDummyHead(Link root) {
        Link dummy = new Link(-99);
        dummy.next = root;
        return dummy.next;
    }

    public Link combineList(Link l1, Link l2) {
        Link dummy = l1;
        //dummy.next = l1;
        while(l1.next != null) {
            l1 = l1.next;
        }
        l1.next = l2;
        return dummy;
    }

    public boolean findCycle(Link l1) {
        Link slow = l1;
        Link fast = l1;

        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }

        return false;
    }

    public Link findIntersectingLink(Link l1) {
        Link slow = l1;
        Link fast = l1;
        boolean hasCycle = false;
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) {
                hasCycle = true;
                break;
            }
        }

        if(hasCycle) {
            slow = l1;
            while(slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        } else {
            return null;
        }
    }

    public Link getNLinkFromBack(Link l1, int n) {
        Link slow = l1;
        Link fast = l1;
        while(n != 0) {
            fast = fast.next;
            n--;
        }

        while(fast!= null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public Link merge2SortedLists(Link l1, Link l2) {
        Link dummy = new Link(-99);

        Link result = dummy;

        Link currentL1 = l1;
        Link currentL2 = l2;

        while(currentL1 != null && currentL2 != null) {
            if(currentL1.val <= currentL2.val) {
                result.next = currentL1;
                currentL1 = currentL1.next;
            } else {
                result.next = currentL2;
                currentL2 = currentL2.next;
            }
            result = result.next;
        }

        if(currentL1 != null) {
            result.next = currentL1;
        } else {
            result.next = currentL2;
        }
        return dummy.next;
    }

    public Link oddEvenList(Link head) {
        if (head != null) {

            Link odd = head, even = head.next, evenHead = even;

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

    public Link oddEvenList2(Link head) {
        Link dummy = new Link(-99);
        Link current = dummy;
        int i = 1;
        Link odd = head;
        Link even = head.next;

        Link next = odd;
        while(odd != null && odd.next != null) {
            if(i % 2 == 1) { //odd
                current.next = next;
                odd = odd.next.next;
                next = odd;
            } else { //even
                current.next = next;
                even = even.next.next;
                next = even;
            }
            current = current.next;
            i++;
        }

        return dummy.next;
    }

    public Link mergeInBetweenLinkList(Link l1, Link l2, int a, int b) {
        if(l2 == null) return l1;
        if(l1 == null) return  l2;

        Link beforeFirst = null;
        Link afterSecond = null;
        Link dummy = new Link(-99);
        dummy.next = l1;
        Link l1Curr = l1;
        int i = 0;
        while (l1Curr != null) {
            if(i == a-1) {
                beforeFirst = l1Curr;
            }
            if(i == b+1) {
                afterSecond = l1Curr;
            }
            l1Curr = l1Curr.next;
            i++;
        }

        Link l2Curr = l2;
        beforeFirst.next = l2;

        while(l2Curr != null && l2Curr.next != null) {
            l2Curr = l2Curr.next;
        }
        l2Curr.next = afterSecond;
        return dummy.next;
    }

    public Link swapNodes(Link head, int k) {
        Link slow = head;
        Link fast = head;
        Link first = null;
        Link second = null;

        for(int i = 0; i < k; i++) {
            fast = fast.next;
        }
        first = slow.next;
        //first.next = null;

        while(fast!= null) {
            slow = slow.next;
            fast=fast.next;
        }
        second = slow;

        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;


    }
}
