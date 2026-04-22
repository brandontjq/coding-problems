package datastructures.linkedlist;

public class LinkedList {
    private Link root;
    private int size;

    public LinkedList() {
        this.root = null;
        this.size = 0;
    }

    public Link getRoot() {
        return root;
    }

    public void setRoot(Link root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        return size == 0;
    }

    public void pushFront(int data) {
        Link currentRoot = this.root;
        this.root = new Link(data);
        if (currentRoot.getVal() != 0) {
            root.setNext(currentRoot);
        }
        size++;
    }

    public int getFirst() {
        return root.getVal();
    }

    public int popFront() {
        Link poppedLink = root;
        root = root.getNext();
        size--;
        return poppedLink.getVal();
    }

    public void pushBack(int data) {
        Link link = root;
        if (link == null) {
            this.root = new Link(data);
            size++;
        } else {
            while (link.getNext() != null) {
                link = link.getNext();
            }
            Link newLink = new Link(data);
            link.setNext(newLink);
            size++;
        }

    }

    public int getLast() {
        Link link = root;
        if (link == null) {
            throw new IndexOutOfBoundsException();
        } else {
            while (link.getNext() != null) {
                link = link.getNext();
            }
            return link.getVal();
        }

    }

    public int popBack() {
        Link link = root;
        int counter = 1;
        while (counter < size) {
            link = link.getNext();
            counter++;
        }
        Link poppedLink = link.getNext();
        link.setNext(null);
        size--;
        return poppedLink.getVal();
    }

    //0-based index
    //[0,1,2,3,4]
    public void insert(int data, int index) {
        Link currentLink = root;
        int counter = 0;
        while (counter < index - 1) {
            currentLink = currentLink.getNext();
            counter++;
        }
        Link nextLink = currentLink.getNext();
        Link newLink = new Link(data);
        currentLink.setNext(newLink);
        newLink.setNext(nextLink);
        size++;
    }

    //[0,1,2,3,4]
    public void erase(int index) {
        Link currentLink = root;
        Link previousLink = null;
        int counter = 0;
        while (counter < index) {
            previousLink = currentLink;
            currentLink = currentLink.getNext();
            counter++;
        }
        Link nextLink = currentLink.getNext();
        //delete currentLink by setting it's next to null
        currentLink.setNext(null);
        //Previous Link to set it's next to deleted currentLink's next
        previousLink.setNext(nextLink);
        size--;
    }


    //[0,1,2,3,4] --> [4,3,2,1,0]
    public void reverse() {
        Link currentLink = root;
        Link previousLink = null;
        Link nextLink;

        while (currentLink != null) {
            nextLink = currentLink.getNext();
            currentLink.setNext(previousLink);
            previousLink = currentLink;
            currentLink = nextLink;
        }
        root = previousLink;
    }


}
