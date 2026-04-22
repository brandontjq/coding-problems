package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void whenCreateEmptyLinkedList_ShouldReturnSize0() {
        LinkedList linkedList = new LinkedList();
        assertEquals(0, linkedList.getSize());
    }

    @Test
    void whenCreateEmptyLinkedList_ShouldReturnEmptyAsTrue() {
        LinkedList linkedList = new LinkedList();
        assertTrue(linkedList.empty());
    }

    @Test
    void whenPushFront_ElementShouldBeInFront() {
        LinkedList linkedList = new LinkedList();
        linkedList.pushFront(1);
        linkedList.pushFront(2);
        linkedList.pushFront(3);
        assertEquals(3, linkedList.getSize());
        assertEquals(3, linkedList.getFirst());
    }

    @Test
    void whenPopFront_ShouldReturnHeadDataAndSizeDecrementByOne() {
        LinkedList linkedList = new LinkedList();
        linkedList.pushFront(1);
        linkedList.pushFront(2);
        linkedList.pushFront(3);
        int data = linkedList.popFront();
        assertEquals(2, linkedList.getSize());
        assertEquals(3, data);
    }

    @Test
    void whenPushBack_ElementShouldBeAtTheBack() {
        LinkedList linkedList = new LinkedList();
        linkedList.pushBack(1);
        linkedList.pushBack(2);
        linkedList.pushBack(3);
        assertEquals(3, linkedList.getSize());
        assertEquals(3, linkedList.getLast());
    }

    @Test
    void whenPopBack_PoppedElementShouldBetheLastElementAndSizeDecrementByOne() {
        LinkedList linkedList = new LinkedList();
        linkedList.pushBack(1);
        linkedList.pushBack(2);
        linkedList.pushBack(3);
        int data = linkedList.popBack();
        assertEquals(3, data);
        assertEquals(2, linkedList.getSize());
        int anotherPoppedData = linkedList.popBack();
        assertEquals(2, anotherPoppedData);
        assertEquals(1, linkedList.getSize());
    }

    @Test
    void whenInsertAtIndex_CurrentElementShouldBePointedToByNewElement() {
        LinkedList linkedList = new LinkedList();
        linkedList.pushBack(1);
        linkedList.pushBack(2);
        linkedList.pushBack(3);
        linkedList.insert(99, 1);
        assertEquals(4, linkedList.getSize());
        int poppedData = linkedList.popFront();
        int anotherPoppeddata = linkedList.popFront();
        assertEquals(99, anotherPoppeddata);
    }

    @Test
    void whenEraseAtIndex_ShouldDeleteElementAndSetPreviousElementToPointToItsNextElement() {
        LinkedList linkedList = new LinkedList();
        linkedList.pushBack(1);
        linkedList.pushBack(2);
        linkedList.pushBack(3);
        linkedList.erase(1);
        assertEquals(2, linkedList.getSize());
        assertEquals(1, linkedList.popFront());
        assertEquals(3, linkedList.popFront());

    }

    @Test
    void shouldReverseLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.pushBack(1);
        linkedList.pushBack(2);
        linkedList.pushBack(3);
        linkedList.reverse();
        assertEquals(3, linkedList.getSize());
        assertEquals(3, linkedList.popFront());
        assertEquals(2, linkedList.popFront());
        assertEquals(1, linkedList.popFront());
    }



}