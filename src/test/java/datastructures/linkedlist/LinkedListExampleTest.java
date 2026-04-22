package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

class LinkedListExampleTest {

    @Test
    void testDummyHead () {
        LinkedListExample l = new LinkedListExample();
        Link root = new Link(1);
        Link two = new Link(2);
        Link three = new Link(3);

        Link four = new Link(4);
        Link five = new Link(5);
        Link six = new Link(6);

        root.next = two;
        two.next = three;
        Link link = l.testDummyHead(root);
        System.out.println(link);
    }

    @Test
    void testCombineList () {
        LinkedListExample l = new LinkedListExample();
        Link root = new Link(1);
        Link two = new Link(2);
        Link three = new Link(3);

        Link four = new Link(4);
        Link five = new Link(5);
        Link six = new Link(6);

        root.next = two;
        two.next = three;

        four.next = five;
        five.next = six;
        Link link = l.combineList(root, four);
        System.out.println(link);
    }

    @Test
    void testFindCycle() {
        LinkedListExample l = new LinkedListExample();
        Link root = new Link(1);
        Link two = new Link(2);
        Link three = new Link(3);
        Link four = new Link(4);
        Link five = new Link(5);

        root.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        //five.next = three;
        boolean result = l.findCycle(root);
        System.out.println(result);
    }

    @Test
    void testFindIntersectingLink() {
        LinkedListExample l = new LinkedListExample();
        Link root = new Link(1);
        Link two = new Link(2);
        Link three = new Link(3);
        Link four = new Link(4);
        Link five = new Link(5);

        root.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        //five.next = three;
        Link result = l.findIntersectingLink(root);
        System.out.println(result);
    }

    @Test
    void testGetNLinkFromBack() {
        LinkedListExample l = new LinkedListExample();
        Link root = new Link(1);
        Link two = new Link(2);
        Link three = new Link(3);
        Link four = new Link(4);
        Link five = new Link(5);

        root.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        Link result = l.getNLinkFromBack(root, 5);
        System.out.println(result);
    }

    @Test
    void testMerge2SortedLists() {
        LinkedListExample l = new LinkedListExample();
        Link root = new Link(1);
        Link six = new Link(6);
        Link seven = new Link(7);
        Link eight = new Link(8);
        Link four = new Link(4);
        Link five = new Link(5);

        Link secondRoot = new Link(1);

        root.next = four;
        four.next = five;

        secondRoot.next = six;
        six.next = seven;
        seven.next = eight;

        Link result = l.merge2SortedLists(root, secondRoot);
        System.out.println(result);
    }

    @Test
    void testOddEvenList() {
        LinkedListExample l = new LinkedListExample();
        Link root = new Link(1);
        Link two = new Link(2);
        Link three = new Link(3);
        Link four = new Link(4);
        Link five = new Link(5);

        root.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        Link result = l.oddEvenList(root);
        System.out.println(result);
    }

    @Test
    void testMyOddEvenList() {
        LinkedListExample l = new LinkedListExample();
        Link root = new Link(1);
        Link two = new Link(2);
        Link three = new Link(3);
        Link four = new Link(4);
        Link five = new Link(5);

        root.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        Link result = l.oddEvenList2(root);
        System.out.println(result);
    }

    @Test
    void testMergeInBetweenLinkList() {
        LinkedListExample l = new LinkedListExample();
        Link root = new Link(0);
        Link one = new Link(1);
        Link two = new Link(2);
        Link three = new Link(3);
        Link four = new Link(4);
        Link five = new Link(5);

        Link anotherRoot = new Link(1000);
        Link oneThousandOne = new Link(1001);
        Link oneThousandTwo = new Link(1002);

        anotherRoot.next = oneThousandOne;
        oneThousandOne.next = oneThousandTwo;

        root.next = one;
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        Link result = l.mergeInBetweenLinkList(root, anotherRoot, 3, 4);

        System.out.println(result);

    }

    @Test
    void testSwapNodes() {
        LinkedListExample l = new LinkedListExample();
        Link one = new Link(1);
        Link two = new Link(2);
        Link three = new Link(3);
        Link four = new Link(4);
        Link five = new Link(5);


        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        Link result = l.swapNodes(one, 2);
        System.out.println(result);
    }

}