package org.example.WaysOfIteration.version3;

public class LinkedListIterator implements Iterator{

    private LinkedListNode head;

    public LinkedListIterator(LinkedListNode head) {
        this.head = head;
    }

    @Override
    public boolean hasNext() {
        if(this.head == null)
            return false;
        return true;
    }

    @Override
    public int next() {
        int curr = this.head.getVal();
        this.head = head.getNext();
        return curr;
    }
}
