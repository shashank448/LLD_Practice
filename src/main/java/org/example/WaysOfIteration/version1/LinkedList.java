package org.example.WaysOfIteration.version1;

public class LinkedList {
    private LinkedListNode head;

    public LinkedList(LinkedListNode head) {
        this.head = head;
    }
    public void insert(LinkedListNode node){
        LinkedListNode previous = head;
        while(previous.getNext()!=null){
            previous = previous.getNext();
        }
        previous.setNext(node);
    }
    public LinkedListNode[] getData(){
        LinkedListNode temp = head;
        int count = 0;
        while(temp!=null){
            temp = temp.getNext();
            count++;
        }
        LinkedListNode[] nodes = new LinkedListNode[count];
        temp = head;
        count = 0;
        while(temp!=null){
            nodes[count++] =temp;
            temp = temp.getNext();
        }
        return nodes;
    }
}
