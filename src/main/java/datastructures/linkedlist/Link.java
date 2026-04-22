package datastructures.linkedlist;

public class Link {

    public int val;
    public Link next;

    public Link() {

    }

    public Link(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }
}
